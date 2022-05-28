package pw3.n3;

import pw3.Input;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(recursiveFibonacciNumber(Input.Int("Введите число N для рек. метода: ")));
        System.out.println(fibonacciNumber(Input.Int("Введисло N для обычного метода: ")));
    }

    private static int recursiveFibonacciNumber(int n) {

        if (n == 1 || n == 2) {
            return 1;
        } else if (n <= 0) {
            return 0;
        } else {
            return recursiveFibonacciNumber(n - 1) + recursiveFibonacciNumber(n - 2);
        }
    }

    private static int fibonacciNumber(int x) {
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        if (x >= 1) {
            fibonacci.add(0);
            fibonacci.add(1);
            for (int i = 0; i <= x - 2; i++) {
                fibonacci.add((fibonacci.get(i) + fibonacci.get(i + 1)));
            }
        } else {
            return 0;
        }
        return fibonacci.get(x);
    }

}
