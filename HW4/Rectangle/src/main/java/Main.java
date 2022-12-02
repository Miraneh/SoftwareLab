import java.util.Scanner;

class Rectangle {
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

    public double area(){
        return (width*length);
    }
}

class Square extends Rectangle{
    public Square(double side){
        super(side, side);
    }

    @Override
    public void setWidth(double width){
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length){
        super.setWidth(length);
        super.setLength(length);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double length = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, length);
        Square square = new Square(width);
        System.out.println(computeArea(rectangle));
        System.out.println(computeArea(square));
    }

    public static double computeArea(Rectangle rectangle)
    {
        return rectangle.area();
    }
}
