public class even_20 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        while(i < 100) {
            i = i + 1;
            if(i%2 != 0)
                continue;
            System.out.print(i + " ");
            j++;
            if(j%10 == 0)
                System.out.println();
        }
    }
}