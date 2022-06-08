package pw2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MyUtils {
//    String name;
    // input int
    static int INTput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    // input str
    static String STRput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    // input pattern
    static Pattern PATTput() {
        Scanner scanner = new Scanner(System.in);
        return Pattern.compile(scanner.nextLine());
    }
    // input ch
//    static String CHput() {
//        Scanner scanner = new Scanner(System.in);
//        return scanner.next().charAt(0);
//    }
    // input double
    static double DOUput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    // dict ##  словарь
//    public class dict(String name) {
//        HashMap<String, String> name = new HashMap<>();
//    }


//    static int[] convertStringArrayToIntArray(String[] stringArray) throws NumberFormatException {
//        if (stringArray != null) {
//            int[] intArray = new int[stringArray.length];
//            for (int i = 0; i < stringArray.length; i++) {
//                intArray[i] = Integer.parseInt(stringArray[i]);
//            }
//            return intArray;
//        }
//        return null;
//    }
}
