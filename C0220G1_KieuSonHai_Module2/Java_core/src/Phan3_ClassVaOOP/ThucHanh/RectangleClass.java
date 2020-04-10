package Phan3_ClassVaOOP.ThucHanh;

public class RectangleClass {
    double width,height;

//    public RectangleClass() {
//    }
    public RectangleClass(double width, double height) {
        this.width= width;
        this.height= height;
    }
    public double getArea() {
        return this.width*this.height;
    }
    public double getPerimeter() {
        return (this.width+this.height)*2;
    }
    public String display() {
        return "Rectangle: "+"width= "+width+", height= "+height+ "";
    }
}
