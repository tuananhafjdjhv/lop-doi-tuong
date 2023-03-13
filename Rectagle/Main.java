package Rectagle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai : ");
        double width = scanner.nextInt();
        System.out.println("Nhap chieu rog : ");
        double height = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(" Dien tich laf : " + rectangle.getArea());
        System.out.println("Chu vi la : " + rectangle.getPerimeter());

    }
}
