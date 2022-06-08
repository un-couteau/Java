package pw2;

class n7apr5 {
    public static void main(String[] args) {
        System.out.print("Введите слово: ");
        String x = MyUtils.STRput();

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            if (Character.isUpperCase(x.charAt(i))) {
                res.append(Character.toLowerCase(x.charAt(i)));
            } else {
                res.append(Character.toUpperCase(x.charAt(i)));
            }

        }

        System.out.println(res);

    }
}