import java.util.Scanner;
import java.util.Stack;

public class HJ54_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String strExpr = sc.nextLine();
            String[] strsExpr = ("$" + strExpr + "$").replaceAll(" ", "").split("");
            Stack<String> stOper = new Stack<>();
            Stack<Integer> stNum = new Stack<>();
            int result = evalExpr(strsExpr, stOper, stNum);

            System.out.println(result);
        }
    }

    private static int evalExpr(String[] strsExpr, Stack<String> stOper, Stack<Integer> stNum) {
        int len = strsExpr.length;
        boolean lastDigit = true;
        int index = 0;
        while (index < len) {
            String s = strsExpr[index];
            if (isOper(s)) {
                // 操作符
                lastDigit = false;
                if (stOper.isEmpty() && s.equals("$")) {
                    stOper.push(s);
                    index++;
                }
                else {
                    switch (compareOper(stOper.peek(), s)) {
                        case "<":
                            stOper.push(s);
                            index++;
                            break;
                        case "=":
                            stOper.pop();
                            index++;
                            break;
                        case ">":
                            int temp = operate(stOper.pop(), stNum.pop(), stNum.pop());
                            stNum.push(temp);
                            // stOper.push(s);
                            break;
                    }
                }

            } else {
                // 操作数
                if (stNum.isEmpty()) {
                    stNum.push(Integer.parseInt(s));
                    lastDigit = true;
                } else {
                    if (lastDigit) {
                        int temp = 10 * stNum.pop() + Integer.parseInt(s);
                        stNum.push(temp);
                    } else {
                        stNum.push(Integer.parseInt(s));
                    }
                    lastDigit = true;
                }
                index++;
            }
        }
        return stNum.pop();
    }

    private static boolean isOper(String s) {
        boolean check;
        switch (s) {
            case "+":
            case "-":
            case "*":
            case "/":
            case "(":
            case ")":
            case "$":
                check = true;
                break;
            default:
                check = false;
                break;
        }

        return check;
    }

    private static String compareOper(String inStackOper, String outOfStackOper) {
        String result = "";
        switch (inStackOper) {
            case "+":
            case "-":
                switch (outOfStackOper) {
                    case "*":
                    case "/":
                    case "(":
                        result = "<";
                        break;
                    default:
                        result = ">";
                        break;
                }
                break;
            case "*":
            case "/":
                switch (outOfStackOper) {
                    case "(":
                        result = "<";
                        break;
                    default:
                        result = ">";
                        break;
                }
                break;
            case "(":
                switch (outOfStackOper) {
                    case ")":
                        result = "=";
                        break;
                    default:
                        result = "<";
                        break;
                }
                break;
            case ")":
                switch (outOfStackOper) {
                    default:
                        result = ">";
                        break;
                }
                break;
            case "$":
                switch (outOfStackOper) {
                    case "$":
                        result = "=";
                        break;
                    default:
                        result = "<";
                        break;
                }
                break;
            default:
                break;
        }
        return result;
    }

    private static int operate(String oper, int numRight, int numLeft) {
        int result;
        switch (oper) {
            case "+":
                result = numLeft + numRight;
                break;
            case "-":
                result = numLeft - numRight;
                break;
            case "*":
                result = numLeft * numRight;
                break;
            case "/":
                result = numLeft / numRight;
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }
}
