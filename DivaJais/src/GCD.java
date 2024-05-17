import java.util.*;
public class GCD {
    private static int gcd(int c, int d) {
        while (d != 0) {
            int temp = c % d;
            c = d;
            d = temp;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1");
        String str1 = sc.nextLine().toUpperCase();
        System.out.println("Enter String2");
        String str2 = sc.nextLine().toUpperCase();
        if (!(str1 + str2).equals(str2 + str1)) {
            System.out.print("");
        } else {
            int result = gcd(str1.length(), str2.length());
            System.out.print(str1.substring(0, result));
        }
    }
}
