package pw3.n1;

import pw3.RoundingDouble;

public class Rectangle extends Figure {
    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    @Override
    public double calcPerimeter() {
        return RoundingDouble.roundingIn2(2 * (getA() + getB()));
    }

    @Override
    public double calcArea() {
        return RoundingDouble.roundingIn2(getA() * getB());
    }

}
