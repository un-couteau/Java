package pw2;

class n1apr5 {
    public static void main(String[] args) {
        System.out.print("Введите государство: ");
        String x1 = MyUtils.STRput();
        System.out.print("Введите столицу: ");
        String x2 = MyUtils.STRput();
        System.out.println("Столица государства " + x1 + " — город " + x2 + '.');
    }
}