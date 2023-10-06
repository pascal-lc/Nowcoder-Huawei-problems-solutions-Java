import java.util.Scanner;
import java.util.Stack;

public class HJ54 {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Integer> vals = new Stack<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            str = str.replaceAll(" ", "");
            String[] strs = str.split("");
            boolean lastVal = true;
            for (String s : strs) {
                if (isOps(s)) {
                    lastVal = false;
                    if (s.equals("("))
                        ;
                    else if (s.equals("+")) {
                        ops.push(s);
                    } else if (s.equals("-")) {
                        ops.push(s);
                    } else if (s.equals("*")) {
                        ops.push(s);
                    } else if (s.equals("/")) {
                        ops.push(s);
                    } else if (s.equals("sqrt")) {
                        ops.push(s);
                    } else if (s.equals(")")) {
                        String op = ops.pop();
                        int v = vals.pop();
                        if (op.equals("+")) {
                            v = vals.pop() + v;
                        } else if (op.equals("-")) {
                            v = vals.pop() - v;
                        } else if (op.equals("*")) {
                            v = vals.pop() * v;
                        } else if (op.equals("/")) {
                            v = vals.pop() / v;
                        } else if (op.equals("sqrt")) {
                            v = (int) Math.sqrt(v);
                        }
                        vals.push(v);
                    }
                } else {
                    if (vals.isEmpty()) {
                        vals.push(Integer.parseInt(s));
                        lastVal = true;
                    } else {
                        if (lastVal) {
                            int temp = 10 * vals.pop() + Integer.parseInt(s);
                            vals.push(temp);
                        } else {
                            vals.push(Integer.parseInt(s));
                        }
                        lastVal = true;
                    }
                }
            }
            System.out.println(vals.pop());
        }
    }

    private static boolean isOps(String s) {
        boolean check;
        switch (s) {
            case "+":
            case "-":
            case "*":
            case "/":
            case "(":
            case ")":
                check = true;
                break;
            default:
                check = false;
                break;
        }

        return check;
    }
}
