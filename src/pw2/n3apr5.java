package pw2;

class n3apr5 {
    public static void main(String[] args) {
        System.out.print("Введите слово: ");
        String word = MyUtils.STRput();

        for (int i = 0; i < word.length(); i++){
            String x = Character.toString(word.charAt(i));
            System.out.println(x.repeat(i + 1));
        }
    }
}