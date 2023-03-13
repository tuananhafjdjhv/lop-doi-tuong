package PhuongTrinhBac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap gia tri a :");
        double a = scanner.nextDouble();
        System.out.println(" Nhap gia tri b :");
        double b = scanner.nextDouble();
        System.out.println(" Nhap gia tri c :");
        double c = scanner.nextDouble();
        PhuongTrinhBac2 phuongTrinhBac2 = new PhuongTrinhBac2(a,b,c);
        if (phuongTrinhBac2.delta() < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (phuongTrinhBac2.delta() == 0) {
            System.out.println("Phuong trinh co 1 nghiem la : " + phuongTrinhBac2.nghiem1());
        } else {
            System.out.println("Phuong trinh co nghiem 1 la : " + phuongTrinhBac2.nghiem1() + "\n");
            System.out.println("Phuong trinh co nghiem 2 la : " + phuongTrinhBac2.nghiem2() + "\n");
        }
    }
}
