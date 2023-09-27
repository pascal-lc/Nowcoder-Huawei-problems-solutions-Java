public class Main2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // 原地交换
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
