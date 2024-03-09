public class Area {
    double radius;
    double length;
    double breadth;
    public Area(){
        System.out.println("NO PARAMETERS IS GIVEN");
    }
    public Area(double radius) {
        double pi = 3.141;
        this.radius = radius;
        System.out.println("THE AREA OF CIRCLE OF RADIUS " + radius + " IS: " + (pi * radius * radius));
    }
    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("THE AREA OF RECTANGLE OF LENGTH " + length + " AND BREADTH " + breadth + " IS: " + (length * breadth));
    }

    public static void main(String[] args) {
        Area a=new Area();
        Area circle = new Area(5.0); // Creating a circle object
        Area rectangle = new Area(6.0, 4.0); // Creating a rectangle object
    }
}
