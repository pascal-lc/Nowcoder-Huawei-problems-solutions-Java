import java.util.Scanner;

public class HJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            //* 题目只有一个测试用例
            double num = sc.nextDouble();
            int numInt = (int)num;
            double fraction = num - numInt;
            if (fraction >= 0.5) {
                numInt++;
            }
            System.out.println(numInt);
        }
    }
}
