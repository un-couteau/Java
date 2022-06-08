package extra16;

public class Main {
    public static void main(String[] args) {
        String str = "final";
        System.out.println(myReverse(str));
        String s = "cat /mnt/c/Users/free/IdeaProjects/java/src/extra16/Main.java | nc termbin.com 9999";
        System.out.println(myReverse(s));
    }

    static String myReverse(String s) {
        String left;
        String right;
        if (s.length() == 1) {
            return s;
        }
        left = s.substring(0, s.length() / 2);
        right = s.substring(s.length() / 2);
        return myReverse(right) + myReverse(left);
    }
//    final -> (nal + fi) -> ((al + n) + (i + f)) -> (((l + a) + n) + (i + f))
//    в виде дерева: https://imgur.com/a/vQayqV0
}
