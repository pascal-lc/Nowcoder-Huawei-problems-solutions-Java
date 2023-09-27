import java.util.Scanner;

/* HJ72 百钱买百鸡问题
 * 描述
公元五世纪，我国古代数学家张丘建在《算经》一书中提出了“百鸡问题”：
鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
现要求你打印出所有花一百元买一百只鸡的方式。
输入描述：
输入任何一个整数，即可运行程序。

输出描述：
输出有数行，每行三个整数，分别代表鸡翁，母鸡，鸡雏的数量

示例1
输入：
1

输出：
0 25 75
4 18 78
8 11 81
12 4 84
 */

public class Main31 {
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