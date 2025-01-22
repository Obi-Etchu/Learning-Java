public class Rectangle {
    private double Length;
    private double width;
    
//constructor
Rectangle(double Length, double width){
    this.Length = Length;
    this.width = width;
}

    //method for calculating area
    public double Area(){
        return Length*width;
    }
    //method for calculating perimeter
    public double perimeter(){
        return 2*(Length + width);
    }
public void setLength(double Length){
    this.Length = Length;
}
public void setWidth(double width){
    this.width = width;
}
public double getLength(){
    return Length;
}
public double getWidth(){
    return width;
}
public static void main(String[] args) {
    Rectangle rec = new Rectangle(2.5, 3.0);
    System.out.println("Leghth:" + rec.getLength());
    System.out.println("Width: " + rec.getWidth());
    System.out.println("Area: "+ rec.perimeter());
    System.out.println("Perimeter: " + rec.Area());


}
}




