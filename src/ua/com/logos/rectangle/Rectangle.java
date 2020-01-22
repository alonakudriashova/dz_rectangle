package ua.com.logos.rectangle;

public class Rectangle {
    private double length;
    private double width;

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public Rectangle(){}
    public Rectangle (double length, double width) {this.length=length; this.width=width;}
    public double getPerimetr(){return (length+width)*2;}
    public double getArea(){return length*width;}
}
