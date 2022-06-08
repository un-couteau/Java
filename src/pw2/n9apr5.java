package pw2;

class n9apr5 {
    public static void main(String[] args) {
        System.out.print("Введите длину массива: ");
        int m = MyUtils.INTput();

        String[] array = new String[m];

        for (int i = 0; i < m; i++) {
            System.out.print("Введите " + (i + 1) + " элемент массива: ");
            String x = MyUtils.STRput();
            array[i] = x;
        }

        String res = String.join(", ", array);

//        System.out.println(Arrays.deepToString(array).replaceAll("^\\[|\\]$", "") + ".");
        System.out.println(res + ".");
    }
}
