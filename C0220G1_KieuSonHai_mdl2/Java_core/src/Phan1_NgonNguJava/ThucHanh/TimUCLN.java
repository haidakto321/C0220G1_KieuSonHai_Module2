package Phan1_NgonNguJava.ThucHanh;

import java.util.Scanner;

public class TimUCLN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0 || b==0) {
            System.out.println("Khong co uoc chung lon nhat.");
        }
        while(a!=b) {
            if(a>b) {
                a=a-b;
            } else {
                b=b-a;
            }
        }
        System.out.println("UCLN la: "+a);
    }
}
