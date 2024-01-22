public class Square extends Rectangle{
    
    double side;
    
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    
    public double getSide(){
        return side;
    }
        
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
        this.side = side;
    }
    
    public double calculateArea(){
        return super.calculateArea();
    }
    
    public double calculatePerimeter(){
        return super.calculatePerimeter();
    }
}