import java.util.Scanner;

interface Shape {
    double area();
}

class Rectangle implements Shape{
    private double width;
    private double length;

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area(){
        return (width*length);
    }
}

class Square implements Shape{
    private double side;

    Square(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area(){
        return (side*side);
    }
}

class computeArea{
    public static double calculateShapeArea(Shape shape)
    {
        return shape.area();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double length = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, length);
        Square square = new Square(width);
        System.out.println(computeArea.calculateShapeArea(rectangle));
        System.out.println(computeArea.calculateShapeArea(square));
    }
}
