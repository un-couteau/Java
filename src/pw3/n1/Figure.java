package pw3.n1;

import pw3.RoundingDouble;

public abstract class Figure {
    public abstract double calcPerimeter();

    public abstract double calcArea();

    public static double totalArea(Figure[] figures) {
        double result = 0;
        for (Figure figure : figures) {
            result += figure.calcArea();
        }
        return RoundingDouble.roundingIn2(result);
    }

}
