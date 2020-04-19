package Phan3_ClassVaOOP.BaiTap.Fan;

public class RealFan1 {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("quat 1: "+fan1.toString());
    }
}
