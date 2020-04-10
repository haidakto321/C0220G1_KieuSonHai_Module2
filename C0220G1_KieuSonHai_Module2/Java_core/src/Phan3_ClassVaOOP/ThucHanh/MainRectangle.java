package Phan3_ClassVaOOP.ThucHanh;

import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the width:");
        double width = input.nextDouble();
        System.out.println("Enter the height:");
        double height = input.nextDouble();

        RectangleClass rectangle=new RectangleClass(width,height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
