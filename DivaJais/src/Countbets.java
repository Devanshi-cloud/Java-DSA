import java.util.*;
public class Countbets {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        int c, l=s.length();
        System.out.println("Character \t Frequency");
        String str=s.toUpperCase();
        for(char ch ='A'; ch <= 'Z'; ch++)
        {
            c = 0;
            for(int i = 0; i < l; i++)
            {
                if(ch == str.charAt(i))
                    c++;
            }
            if(c>0)
            {
                System.out.println(ch+ "\t \t \t \t" +c);
            }
        }
    }
}
