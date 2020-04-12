package Phan4_KeThua.BaiTap.CircleAndCylinder;

public class Circle {
    private double radis=2.0;
    private String color="Blue";
    Circle() {
    }

    public Circle(double radis, String color) {
        this.radis = radis;
        this.color = color;
    }

    public double getRadius() {
        return radis;
    }

    public void setRadius(double radis) {
        this.radis = radis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.pow(this.getRadius(), 2) * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.getRadius() * Math.PI;
    }
    public String toString() {
        return "A Circle with radius " +this.getRadius()+" has color "+this.getColor();
    }
}
