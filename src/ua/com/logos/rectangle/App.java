package ua.com.logos.rectangle;

public class App {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10.3, 15.2);
        System.out.println("Розмір прямокутника"+rectangle1);
        System.out.println("Периметр прямокутника: "+rectangle1.getPerimetr());
        System.out.println("Площа прямокутника: "+rectangle1.getArea());
    }
}
