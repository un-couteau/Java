package pw2;

class n13apr5 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        String x = MyUtils.STRput().strip();

        System.out.print(x.replaceAll("[\\s]{2,}", " "));

    }
}
