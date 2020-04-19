package Phan1_NgonNguJava.ThucHanh;

import java.util.Scanner;

public class CaculateBMI {
    public static void main(String[] args) {
        double weight,height,bmi;
        Scanner input=new Scanner(System.in);
        System.out.println("Write your weight(kg): ");
        weight=input.nextDouble();
        System.out.println("Write your height(meter): ");
        height=input.nextDouble();
        bmi=weight/Math.pow(height,2);
        if(bmi<18) {
            System.out.println("Your BMI is "+bmi+" .UnderWeight.");
        } else if(bmi<25.0) {
            System.out.println("Your BMI is "+bmi+" .Normal ");
        } else if(bmi<30.0) {
            System.out.println("Your BMI is "+bmi+" .Overweight");
        } else {
            System.out.println("Obese!");
        }
    }
}
