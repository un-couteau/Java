package pw2;

import java.util.Locale;

class n5apr5 {
    public static void main(String[] args) {
        System.out.print("Введите слово: ");
        String x = MyUtils.STRput().toLowerCase(Locale.ROOT);
        StringBuilder b = new StringBuilder(x);

        if (x.equals(b.reverse().toString())) {
            System.out.println("Это слово палиндром.");
        } else {
            System.out.println("Это слово НЕ палиндром.");
        }
    }
}