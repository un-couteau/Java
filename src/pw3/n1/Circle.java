package pw3.n1;

import pw3.RoundingDouble;

public class Circle extends Figure {
    private double a;
    public Circle(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double calcPerimeter() {
        return RoundingDouble.roundingIn2(2 * Math.PI * getA());
    }

    @Override
    public double calcArea() {
        return RoundingDouble.roundingIn2(Math.PI * Math.pow(getA(), 2));
    }
}
