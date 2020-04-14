package Phan5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable.Shapes;

import Phan5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public String getArea() {
        return "Dien tich: "+radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Hinh tron: "
                +"\nBán kính truoc khi thay đổi: " + (this.radius)
                +"\nDien tich truoc khi thay doi: "+this.getArea());
        this.radius=this.radius + this.radius * percent;
        System.out.println("\nBán kính sau khi thay đổi: " + (this.radius)
        +"\nDien tich sau khi thay doi: "+this.getArea());
    }
}
