package pw3.n4;

import pw3.RoundingDouble;

public class Circle {
    private double radius;
    private double x;
    private double y;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setCircleCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double circleArea() { // 1 задание
        return RoundingDouble.roundingIn2(Math.PI * Math.pow(getRadius(), 2));
    }

    public boolean enteringСircles(Circle circle) { // 3 задание
        return ((Math.pow(getX() - circle.getX(), 2) + Math.pow(getY() - circle.getY(), 2)) < Math.pow(getRadius() - circle.getRadius(), 2));
    }

    public double circleSpacing(Circle circle) { // 4 задание
        return RoundingDouble.roundingIn2(Math.sqrt((Math.pow(circle.getX() - getX(), 2) + Math.pow(circle.getY() - getY(), 2))));
    }
}
