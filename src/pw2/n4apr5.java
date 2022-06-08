package pw2;

class n4apr5 {
    public static void main(String[] args) {
        System.out.print("Введите число A: ");
        int a = MyUtils.INTput();
        System.out.print("Введите число B: ");
        int b = MyUtils.INTput();

//        System.out.println("*".repeat(a));

        if (b == 1) {
            for (int i = 0; i < b; i++) {
                System.out.println("*".repeat(a));
            }
        } else {
            System.out.println("*".repeat(a));
            for (int i = 0; i < b - 2; i++) {
                System.out.println("*" + " ".repeat(a - 2) + "*");
            }
            System.out.print("*".repeat(a));
        }


    }
}