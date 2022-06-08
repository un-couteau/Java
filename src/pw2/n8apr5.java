package pw2;

class n8apr5 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        String x = MyUtils.STRput();

        StringBuilder res = new StringBuilder();
//        String res = "";

        for (int i = x.length() - 1; i >= 0; i--) {
            res.append(x.charAt(i));
//            res += Character.toString(x.charAt(i));
        }

        System.out.println(res);
    }
}
