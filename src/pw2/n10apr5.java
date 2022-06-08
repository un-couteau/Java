package pw2;

class n10apr5 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        String x = MyUtils.STRput().toLowerCase();

        if (x.contains("жы") || x.contains("шы")) {
            System.out.println("Жи/Ши пиши с буквой и");
        } else {
            System.out.println("Молодец");
        }
    }
}
// Ёжык