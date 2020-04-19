package Phan1_NgonNguJava.ThucHanh;

import java.util.Scanner;

public class PTBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as'a*x+b=0', please enter constant:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a=scanner.nextDouble();
        System.out.println("b: ");
        double b=scanner.nextDouble();
        if(a!=0) {
            double result=-b/a;
            System.out.println("The result is: "+result);
        } else {
            if(b==0) {
                System.out.println("The result is 0");
            }
            System.out.println("No result");
        }
    }
}
