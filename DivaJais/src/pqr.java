import java.util.*;
public class pqr {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word1.");
        String w1 = sc.nextLine();
        System.out.println("Enter word2.");
        String w2 = sc.nextLine();
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < w1.length() || i < w2.length())
        {
            if(i < w1.length()) {
                result.append(w1.charAt(i));
            }
            if(i < w2.length()) {
                result.append(w2.charAt(i));
            }
            i++;
        }
        System.out.print(result.toString());
    }
}
