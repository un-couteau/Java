package pw2;

class n6apr5 {
    public static void main(String[] args) {
        System.out.print("Введите слово: ");
        String str = MyUtils.STRput();
        System.out.print("Введите символ: ");
        char ch = MyUtils.STRput().charAt(0);
        int _count = 0;

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                res.append(str.charAt(i));
            } else {
//                res.append(Character.toString(str.charAt(i)).toUpperCase(Locale.ROOT));
                res.append(Character.toUpperCase(str.charAt(i)));
                _count += 1;
            }
        }

        System.out.println("Кол-во вхождений: " + _count + "\nПреобразованная строка: " + res);
    }
}