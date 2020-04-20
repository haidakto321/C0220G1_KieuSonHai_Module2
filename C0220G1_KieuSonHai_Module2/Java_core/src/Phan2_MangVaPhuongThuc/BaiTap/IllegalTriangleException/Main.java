package Phan2_MangVaPhuongThuc.BaiTap.IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập cạnh thứ nhất: ");
        double x = input.nextDouble();
        System.out.println("Nhập cạnh thứ hai: ");
        double y = input.nextDouble();
        System.out.println("Nhập cạnh thứ ba: ");
        double z = input.nextDouble();

        try {
            if (x <= 0 || y <= 0 || z <= 0 || x + y < z || x + z < y || y + z < x)
                throw new IllegalTriangleException();
            else {
                System.out.println("3 cạnh nhập vào thỏa điều kiện của 1 tam giác.");
            }
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Done!");
        }
    }
}

