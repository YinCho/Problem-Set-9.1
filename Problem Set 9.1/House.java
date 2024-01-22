public class House extends Shape{
    
    Square square;
    Triangle triangle;
    
    public House(String color, boolean filled, Square square, Triangle triangle) {
        super(color, filled);
        this.square = square;
        this.triangle = triangle;
    }
        
    public void setSquare(Square s){
        this.square = s;
    }
    
    public void setTriangle(Triangle t) {
        this.triangle = t;
    }
    
    public double calculateArea(){
        return square.calculateArea() + triangle.calculateArea();
    }
    
    public double calculatePerimeter(){
        return square.calculatePerimeter() + triangle.calculatePerimeter() - 2*square.getSide();
    }
}
