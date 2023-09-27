public class Main1 {
    public static void main(String[] args) {
        int n1 = 1024;
        long l2 = 2048;
        long l3 = 4096L;

        try {
            l2 = l3;
            n1 = l2;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


        System.out.println(n1);
        System.out.println(l2);

        // 1024
    }
}
