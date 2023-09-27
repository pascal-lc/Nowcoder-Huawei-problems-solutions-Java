public class Main5 {
    public static void main(String[] args) {
        double a, b, c, r1, r2;
        a = 1.0;
        b = -3.0;
        c = 2.0;

        r1 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        r2 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println(r1 == 1 && r2 == 2.0 ? "Pass" : "Filed");
    }
}
