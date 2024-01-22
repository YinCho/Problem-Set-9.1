public class ShapeDriver {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle("red", true, 2, 4);
        Circle circ = new Circle("blue", true, 3);
        Triangle tri = new Triangle("green",false, 3,3,3);
        Square squ = new Square("yellow",true, 3);
        Pentagon pent = new Pentagon("orange", false, 4);
        House house = new House("purple", false, squ, tri);
    
        Shape[] shapes = {rect, circ, tri, squ, pent, house};

        for(Shape s: shapes) {
            System.out.println("Info " );
            s.displayInfo();    
            System.out.println("Area: " + s.calculateArea());
            System.out.println("Perimteter: " + s.calculatePerimeter());
        }
    }
}