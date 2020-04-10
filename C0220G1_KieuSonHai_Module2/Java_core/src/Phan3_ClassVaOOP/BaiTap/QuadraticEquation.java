package Phan3_ClassVaOOP.BaiTap;

import java.util.Scanner;

public class QuadraticEquation {
    Scanner input=new Scanner(System.in);
    private double a,b,c;
    QuadraticEquation(double a,double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this .c;
    }
    public double getDiscriminant() {
        return (this.getB()*2-4*this.getA()*this.getC());
    }
    public double getRoot1() {
        return ((-this.getB()+this.getDiscriminant())/(2*this.getA()));
    }
    public double getRoot2() {
        return ((-this.getB()-this.getDiscriminant())/(2*this.getA()));
    }
    public String display() {
        if(this.getDiscriminant()>0) {
            return "x1= "+this.getRoot1()+"\nX2= "+this.getRoot2();
        } else if(this.getDiscriminant()==0) {
            return "x= "+this.getRoot1();
        } else {
            return "The equation has no roots.";
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap theo cú pháp: ax^2+bx+c=0 để tìm x");
        System.out.println("Nhap vào a: ");
        double a=input.nextDouble();
        System.out.println("Nhập vào b: ");
        double b=input.nextDouble();
        System.out.println("Nhập vào c: ");
        double c=input.nextDouble();
        QuadraticEquation phuongtrinh=new QuadraticEquation(a,b,c);
        System.out.println(phuongtrinh.display());
    }
}

