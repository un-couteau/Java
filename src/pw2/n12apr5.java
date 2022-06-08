package pw2;

import java.util.regex.Pattern;

class n12apr5 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        String x = MyUtils.STRput();

        System.out.print("Введите спец. символ: ");
        String b = MyUtils.STRput();

        for (String retrieval : x.split(Pattern.quote(b))) {
            System.out.println(retrieval + " = " + retrieval.length());
        }
    }
}
