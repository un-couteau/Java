package pw3;

import java.util.Scanner;

public class Input {

    public static int Int() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int Int(String string) {
        System.out.print(string + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String String() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String String(String string) {
        System.out.print(string + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static double Double() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double Double(String string) {
        System.out.print(string + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
