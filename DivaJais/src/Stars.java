import java.util.*;
public class Stars {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with *");
        String str = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(c != '*'){
                res.append(c);
            }
            else if(i > 0 && c == '*') {
                res.deleteCharAt((res.length()) - 1);
            }
        }
        System.out.print(res.toString());
    }
}
