package Phan5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable;

import Phan5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable.Shapes.Circle;
import Phan5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable.Shapes.Rectangle;
import Phan5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable.Shapes.Shape;
import Phan5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable.Shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].resize(Math.random());
        }
    }
}
