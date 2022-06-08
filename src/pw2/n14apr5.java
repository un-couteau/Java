package pw2;

import java.util.Arrays;
//import java.util.stream.IntStream;

class n14apr5 {
    public static void main(String[] args) {
        System.out.print("Введите выражение: ");
        String x = MyUtils.STRput();


//        String[] arr = x.split("[+ ]+"); int [] res = new int[arr.length]; for (int i=0; i< arr.length; i++) { res[i] = Integer.parseInt(arr[i]);}System.out.println(IntStream.of(res).sum());
//        в одну строчку зато

        System.out.println(Arrays.stream(x.split("[+ ]+")).mapToInt(Integer::parseInt).sum());



    }
}
