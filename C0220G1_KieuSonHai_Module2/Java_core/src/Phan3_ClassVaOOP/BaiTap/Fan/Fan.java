package Phan3_ClassVaOOP.BaiTap.Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    public int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String speed = "";
        if (this.getSpeed() == 1) {
            speed += "LOW";
        } else if (getSpeed() == 2) {
            speed += "MEDIUM";
        } else {
            speed += "FAST";
        }
        String on_off = "";
        if (this.getOn()) {
            on_off += "Quat dang bat.";
        } else {
            on_off += "Quat dang tat.";
        }
        return "speed: " + speed + " ,color: " + this.getColor() + " ,radius: " + this.getRadius() + ", " + on_off;
    }
}
