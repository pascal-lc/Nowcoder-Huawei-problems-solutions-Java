import java.util.Scanner;
import java.util.Stack;

public class HJ54_3 {
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
        int index = 0;
        while (index < len) {
            String s = strsExpr[index];
            if (isOper(s)) {
                // 操作符
                if (stOper.isEmpty() && s.equals("$")) {
                    stOper.push(s);
                    index++;
                } else {
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
                            break;
                    }
                }
            } else {
                String sp = strsExpr[index - 1];
                String spp = "";
                if (index - 2 >= 0) {
                    spp = strsExpr[index - 2];
                }

                int tempNum = 0;
                while (!isOper(s)) {
                    int digit = Integer.parseInt(s);
                    tempNum = tempNum * 10 + digit;
                    index++;
                    s = strsExpr[index];
                }
                if ((sp.equals("+") || sp.equals("-")) && (spp.equals("$") || spp.equals("("))) {
                    if (sp.equals("-")) {
                        stOper.pop();
                        tempNum *= -1;
                    }
                }

                stNum.push(tempNum);
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
