import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "123456";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            // Create database if not exists
            String sql = "CREATE DATABASE IF NOT EXISTS STUDENT";
            stmt.execute(sql);
            System.out.println("DATABASE CREATED");

            // Use STUDENT database
            sql = "USE STUDENT";
            stmt.execute(sql);

            // Create DETAILS table
            sql = "CREATE TABLE IF NOT EXISTS DETAILS("
                    + "roll_num CHAR(15) PRIMARY KEY,"
                    + "name CHAR(15) NOT NULL,"
                    + "mobile_num CHAR(15)"
                    + ")";
            stmt.execute(sql);
            System.out.println("TABLE CREATED");

            // Describe DETAILS table
            sql = "DESC DETAILS";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String field = rs.getString("Field");
                String type = rs.getString("Type");
                System.out.println("Field: " + field + ", Type: " + type);
            }
            rs.close();
            sql= "INSERT INTO DETAILS (roll_num, name, mobile_num) VALUES"+
                "('2102310100049','ISHRAQ SAIFI','7982241430'),"+
                "('21023100056','KUNAL KOUSHIK','882320645')";
            int rowsInserted=stmt.executeUpdate(sql);
            System.out.println(rowsInserted+" RAWS INSERTED");
            
            ResultSet r=stmt.executeQuery("SELECT * FROM DETAILS");
            System.out.println("PRINTING DATA FROM THE TABEL DETAIL:");
                System.out.println("-----------------------------");
            while (r.next()) {
                String rollNum = r.getString("roll_num");
                String name = r.getString("name");
                String mobileNo = r.getString("mobile_num");
                
                System.out.println("Roll No.: " + rollNum);
                System.out.println("Name    : " + name);
                System.out.println("Mobile No.: " + mobileNo);
                System.out.println("-----------------------------");
            }
            
            r.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
