public class Dayofweekandyear {
        public static void main(String[] args) {
            printDaysOfWeek();
            printMonthsOfYear();
        }
    
        public static void printDaysOfWeek() {
            String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            System.out.println("Days of the week:");
            for (String day : daysOfWeek) {
                System.out.println(day);
            }
        }
    
        public static void printMonthsOfYear() {
            String[] monthsOfYear = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            System.out.println("Months of the year:");
            for (String month : monthsOfYear) {
                System.out.println(month);
            }
        }
    
}
