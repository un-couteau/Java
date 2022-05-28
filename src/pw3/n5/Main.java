package pw3.n5;

import pw3.Input;

public class Main {
    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(Input.Double("re for n1"), Input.Double("im for n1"));
        ComplexNumber n2 = new ComplexNumber(Input.Double("re for n2"), Input.Double("im for n2"));
        System.out.println("n1 hashcode: " + n1.hashCode() + "\nn2 hashcode: " + n2.hashCode());
        System.out.println("n1 equals n2: " + n1.equals(n2));

        System.out.println("\n==================================================\n");

        ComplexNumber a1 = new ComplexNumber(10, 20);
        ComplexNumber a2 = new ComplexNumber(10, 20);
        System.out.println("a1 hashcode: " + a1.hashCode() + "\na2 hashcode: " + a2.hashCode());
        System.out.println("a1 equals a2: " + a1.equals(a2));

    }
}
