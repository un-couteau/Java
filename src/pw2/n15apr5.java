package pw2;

class n15apr5 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        String x = MyUtils.STRput();

        int max = 0;
        int count = 0;
        char res = 0;

        for (int i = 1; i < x.length(); i++) {
            char tmp = x.charAt(i - 1);

            if (tmp == x.charAt(i)) {
                count++;
                res = x.charAt(i - 1);
            } else {
                if (count > max) {
                    max = count;
                    count = 0;
                } else {
                    count = 0;
                }
            }
        }

        if (count > max) {
            max = count;
        }

        if (max > 0) {
            System.out.println("Символ: \"" + res + "\"\nПовторяется (раз): " + (max + 1) + "\nНачиная с символа под номером: " + (x.indexOf(Character.toString(res).repeat(max + 1)) + 1));
        } else {
            System.out.println("Повторяющих подряд символов не найдено");
        }
    }
}