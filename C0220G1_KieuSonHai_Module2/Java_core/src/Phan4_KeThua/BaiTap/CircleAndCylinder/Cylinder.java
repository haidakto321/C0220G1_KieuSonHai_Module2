package Phan4_KeThua.BaiTap.CircleAndCylinder;

public class Cylinder extends Circle{
    private double height=3.0;
    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.pow(this.getRadius(),2)*this.getHeight()*Math.PI;
    }
    public String toString() {
        return "A Cylinder with height: "+this.getHeight()+" has volume: "+this.getVolume()
                +" ,which is a subclass of "+super.toString();
    }
}
