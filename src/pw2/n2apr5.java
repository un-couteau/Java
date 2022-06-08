package pw2;

class n2apr5 {
    public static void main(String[] args) {
        System.out.print("Введите длину PIN-кода: ");
        int n = MyUtils.INTput();

        System.out.print("PIN-код получится: ");
        for (int i = 0; i < n; i++) {
            System.out.print((int) (Math.random() * 10));
//            System.out.print(Math.round(Math.random() * 9));
        }
    }
}