package Phan4_KeThua.BaiTap.PointAndMoveablePoint;

public class test {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(4, 5);
        System.out.println(point);

        MoveablePoint moveable=new MoveablePoint();
        System.out.println(moveable);
        moveable=new MoveablePoint(4,3);
        System.out.println(moveable);
        moveable.move();
        moveable.move();
        moveable=new MoveablePoint(6,7,4,5);
        moveable.move();
        moveable.move();


    }
}
