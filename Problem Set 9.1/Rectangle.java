
public class Rectangle extends Shape {
    private double width, length;
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public double calculateArea() {
        return width * length;
    }
    
    @Override
    public double calculatePerimeter() {
        return (width + length) * 2;
    }
}
