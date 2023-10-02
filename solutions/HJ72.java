import java.util.Scanner;

public class HJ72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int xMax = 100 / 5;
        int yMax = 100 / 3;

        for (int x = 0; x <= xMax; x++) {
            for (int y = 0; y <= yMax; y++) {
                int z = 100 - x - y;
                if (z % 3 == 0 && x * 5 + y * 3 + z / 3 == 100) {
                    System.out.printf("%d %d %d", x, y, z);
                    System.out.println();
                }
            }
        }
    }
}