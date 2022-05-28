package pw3.n1;

import pw3.Input;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(Input.Double("Сторона прямоугольника A"), Input.Double("Сторона прямоугольника B"));
        System.out.println("Периметр прямоугольника: " + rectangle.calcPerimeter());
        System.out.println("Площадь прямоугольника: " + rectangle.calcArea());
        Triangle triangle = new Triangle(Input.Double("Сторона треугольника A"), Input.Double("Сторона треугольника B"), Input.Double("Сторона треугольника C"));
        System.out.println("Периметр треугольника: " + triangle.calcPerimeter());
        System.out.println("Площадь треугольника: " + triangle.calcArea());
        Square square = new Square(Input.Double("Сторона квадрата"));
        System.out.println("Периметр квадрата: " + square.calcPerimeter());
        System.out.println("Площадь квадрата: " + square.calcArea());
        Figure[] figures = {rectangle, triangle, square};
        System.out.println("Суммарная площадь фигур: " + Figure.totalArea(figures));
        Circle circle = new Circle(Input.Double("Радиус круга: "));
        System.out.println("Периметр круга: " + circle.calcPerimeter());
        System.out.println("Площадь круга: " + circle.calcArea());
    }


}
