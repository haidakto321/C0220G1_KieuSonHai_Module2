package Phan4_KeThua.BaiTap.TriAngle;

public class test {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        System.out.println(triangle);
        triangle=new Triangle(4.0,5.0,6.9);
        System.out.println(triangle);
        triangle=new Triangle("grey",false,6.0,7.2,8.3);
        System.out.println(triangle);
    }
}
