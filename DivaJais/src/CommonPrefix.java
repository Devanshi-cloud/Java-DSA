import java.util.Arrays;
import java.util.*;
public class CommonPrefix {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String[] v = new String[3];
        StringBuilder str = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for(int i = 0; i<Math.min(first.length(), last.length()); i++)
        {
            if(first.charAt(i) != last.charAt(i)){
                System.out.print(str.toString());
            }
            str.append(first.charAt(i));
        }
        System.out.println(str.toString());
    }
}
