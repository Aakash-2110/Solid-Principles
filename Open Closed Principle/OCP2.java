interface Shape{
    public void calculateArea();
}
class Circle implements Shape{
    private int radius;
    Circle(int radius)
    {
        this.radius = radius;
    }
    public void calculateArea()
    {
        System.out.println(Math.PI * radius * radius);
    }
}
class Rectangle implements Shape{
    private int length;
    private int breadth;
    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public void calculateArea()
    {
        System.out.println(length * breadth);
    }
}
class Areacaluclation{
    public void calculateArea(Shape shape)
    {
        shape.calculateArea();
    }
}
class OCP2{
    public static void main(String[] args) {
        Shape c = new Circle(4);
        Shape r = new Rectangle(4,5);
        Areacaluclation ac = new Areacaluclation();
        ac.calculateArea(c);
        ac.calculateArea(r);
    }
}