package Phan5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable.Shapes;

import Phan5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        System.out.println("Hinh chu nhat: "+
                "\nChieu dai trc khi thay doi: "
                +(this.length)+" .Chieu rong trc khi thay doi: "
                +(this.width)+" \nDien tich truoc khi thay doi: "+this.getArea());
        this.length=this.length+this.length*percent;
        this.width=this.width+this.width*percent;
        System.out.println("\nChieu dai sau khi thay doi: "
                +(this.length)+" .Chieu rong sau khi thay doi: "
                +(this.width)
                +"\nDien tich sau khi thay doi: "+this.getArea());
    }
}
