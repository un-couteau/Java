package pw3;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int x){

        if (x == 1){

            return 1;
        }
        return x * factorial(x - 1);
    }
}
