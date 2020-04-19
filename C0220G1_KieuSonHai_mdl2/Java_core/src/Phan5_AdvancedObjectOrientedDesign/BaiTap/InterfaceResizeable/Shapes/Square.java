package Phan5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable.Shapes;

import Phan5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable.Resizeable;

public class Square extends Rectangle implements Resizeable {
    private double side=1;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public double getArea() {
        return this.side * this.side;
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        System.out.println("Hinh vuong:"+"\nCạnh trc khi thay đổi: "+this.getSide()
                +"\nDien tich truoc khi thay doi: "+this.getArea());
        this.side = this.getSide() + (this.getSide() * percent);
        System.out.println("\nCạnh sau khi thay đổi: "+(this.getSide()+this.getSide()*percent)
                +"\nDien tich sau khi thay doi: "+this.getArea());
    }
}
