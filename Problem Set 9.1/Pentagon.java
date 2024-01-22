public class Pentagon extends Shape{
    private double sides;
    
    public Pentagon(String color, boolean filled, int sides) {
        super(color, filled);
        setSide(sides);
    }

    public double getSide(){
        return sides;
    }

    public void setSide(double sides){
        this.sides = sides;
    }

    public double calculateArea(){
        double c = Math.sqrt(5*(5+2*Math.sqrt(5)));
        return c*sides*sides/4;
    }

    public double calculatePerimeter(){
        return 5*sides;
    }
}