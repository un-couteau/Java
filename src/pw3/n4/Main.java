package pw3.n4;

import pw3.Input;

public class Main {
    public static void main(String[] args) {
        Circle n1 = new Circle(Input.Double("Введите r первой окружности"));
        System.out.println("1. Площадь круга, ограниченного этой окружностью: " + n1.circleArea());
        n1.setCircleCenter(Input.Double("Введите X окружности"), Input.Double("Введите Y окружности"));
        System.out.println("2. Вы успешно поменяли цетр окружности");
        Circle n2 = new Circle(Input.Double("Введите r второй окружности"));
        System.out.println("3. Вхождение первой окружности во вторую: " + n1.enteringСircles(n2));
        System.out.println("4. Расстояние между окружностями: " + n1.circleSpacing(n2));
    }
}
