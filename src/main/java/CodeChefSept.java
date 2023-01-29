import java.util.Scanner;

public class CodeChefSept {

    public static void main(String[] args) {
        airline();
    }

    private static void airline() {
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();
        while(tc--> 0) {
            int a,b,c,d,e;

            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            d = input.nextInt();
            e = input.nextInt();
            int max = Math.max(d,e);
            if(a+b+c <= d+e && d >= (Math.max(a,b)+Math.max(b,c))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
