class Fan{
    int wings;
    String color;
    float weight;
    float height;
    public Fan(int wings,String color,float weight,float height){
        this.wings = wings;
        this.color = color;
        this.weight = weight;
        this.height = height;
    }
    public void rotate(){
        System.out.println("WINGS: "+wings+" COLOR: "+color+" WEIGHT: "+weight+ " HEIGHT: "+height);
        System.out.println("FAN IS ROTATING");
    }
}
public class Classandobjects {

    public static void main(String[] args) {
        Fan s= new Fan(3,"Red",5,4);
        s.rotate();
        System.out.println(s.wings);
    }
}
