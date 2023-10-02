import java.util.Scanner;

public class HJ1_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        String lastWord = strArr[strArr.length - 1];
        System.out.println(lastWord.length());
    }
}