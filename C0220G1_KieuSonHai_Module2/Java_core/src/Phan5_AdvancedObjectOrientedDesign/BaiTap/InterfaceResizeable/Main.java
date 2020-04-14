package Phan5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable;

import Phan5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable.Shapes.Circle;

public class Main {
    public static void main(String[] args) {
        Circle[] circles=new Circle[2];
        circles[0]=new Circle();
        circles[1]=new Circle();
        for(int i=0;i<circles.length;i++) {
            System.out.println(circles[i].getArea());
        }
        for(int i=0;i<circles.length;i++) {
            circles[i].resize(Math.random()*100+1);
        }
    }
}
