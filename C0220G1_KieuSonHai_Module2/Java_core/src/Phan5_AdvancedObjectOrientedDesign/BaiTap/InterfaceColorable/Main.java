package Phan5_AdvancedObjectOrientedDesign.BaiTap.InterfaceColorable;


public class Main {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[2];
        shapes[0] =new Rectangle(15,10,"Blue",false);
        shapes[1] =new Square(7,"Yellow",false);
        for(Shape o:shapes) {
            if(o instanceof Rectangle) {
                System.out.println("Rectangle: "+((Rectangle)o).getArea());
            } else {
                System.out.println("Square: "+((Square) o).getArea());
                ((Square) o).howToColor();
            }
        }
    }
}
