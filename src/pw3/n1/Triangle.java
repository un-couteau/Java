package pw3.n1;

import pw3.RoundingDouble;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getB() {
        return b;
    }


    public double getC() {
        return c;
    }

    public double getA() {
        return a;
    }

    @Override
    public double calcPerimeter() {
        return getA() + getB() + getC();
    }

    @Override
    public double calcArea() {
        double halfPerimeter = calcPerimeter() / 2;
//        return Double.parseDouble(String.format("%.3f", (Math.sqrt(halfPerimeter * (halfPerimeter - getA()) * (halfPerimeter - getB()) * (halfPerimeter - getC())))).replace(',', '.'));
        return RoundingDouble.roundingIn2(Math.sqrt(halfPerimeter * (halfPerimeter - getA()) * (halfPerimeter - getB()) * (halfPerimeter - getC())));
    }
}
