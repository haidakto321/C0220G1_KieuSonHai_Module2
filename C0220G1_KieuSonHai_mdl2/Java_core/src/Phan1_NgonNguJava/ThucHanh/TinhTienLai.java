package Phan1_NgonNguJava.ThucHanh;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double money=1.0;
        int month=1;
        double interest_rate=1.0;
        System.out.println("Money: ");
        money=input.nextDouble();
        System.out.println("Time(month): ");
        month=input.nextInt();
        System.out.println("Interest rate: ");
        interest_rate=input.nextDouble();
        double total_interest=0;
        for(int i=0;i<month;i++) {
            total_interest=money*(interest_rate/100)/12*3;
        }
        System.out.println("Total interest is: "+total_interest);
    }
}
