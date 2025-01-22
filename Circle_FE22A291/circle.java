public class circle {
    private double Radius;
    
    
    circle(double Radius){
        this.Radius = Radius;
    }
    //method to calculate area
    public double Area(){
        return Math.PI * this.Radius * this.Radius;
    }
    //method to calculate circumference
    public double circumference(){
        return Math.PI * 2 * this.Radius;
    }
    public void setRadius(double Radius){
        this.Radius = Radius;
    }
    public double getRadius(){
        return Radius;
    }


 public static void main(String[] args){
circle CIRCLE = new circle(5.0);
System.out.println("Radius: " + CIRCLE.getRadius());
System.out.println("Area: " + CIRCLE.Area());
System.out.println("circumference: " + CIRCLE.circumference());

 }
}