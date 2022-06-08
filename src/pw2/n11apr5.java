package pw2;

import java.util.HashMap;

class n11apr5 {
    public static void main(String[] args) {
        HashMap<String, String> letters = new HashMap<>();
        letters.put("б", "b");
        letters.put("в", "v");
        letters.put("г", "g");
        letters.put("д", "d");
        letters.put("ё", "e");
        letters.put("ж", "yo");
        letters.put("з", "zh");
        letters.put("и", "i");
        letters.put("й", "j");
        letters.put("к", "k");
        letters.put("л", "l");
        letters.put("м", "m");
        letters.put("н", "n");
        letters.put("п", "p");
        letters.put("р", "r");
        letters.put("с", "s");
        letters.put("т", "t");
        letters.put("у", "u");
        letters.put("ф", "f");
        letters.put("х", "h");
        letters.put("ц", "c");
        letters.put("ч", "ch");
        letters.put("ш", "sh");
        letters.put("щ", "w");
        letters.put("ъ", "#");
        letters.put("ы", "y");
        letters.put("ь", "'");
        letters.put("э", "je");
        letters.put("ю", "ju");
        letters.put("я", "ja");
        letters.put("а", "a");
        letters.put("е", "e");
        letters.put("о", "o");
//        letters.put(" ", " ");
//        letters.put("!", "!");
//        letters.put("?", "?");
//        letters.put(",", ",");
//        letters.put(".", ".");
//        letters.put("-", "-");
//      неважно кто важно, а важно кто неважно

        System.out.print("Введите слово: ");
        String x = MyUtils.STRput();

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            if (letters.containsKey(Character.toString(x.charAt(i)).toLowerCase())) {
                if (x.charAt(i) != ' ') {
                    if (Character.isUpperCase(x.charAt(i))) {
                        res.append(letters.get(Character.toString(x.charAt(i)).toLowerCase()).toUpperCase());
                    } else {
                        res.append(letters.get(Character.toString(x.charAt(i))));
                    }
                } else {
                    res.append(' ');
                }
            } else {
                res.append(x.charAt(i));
            }
        }

        System.out.println(res);

    }
}