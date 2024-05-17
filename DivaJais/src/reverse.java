import java.util.*;
class Solution {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String reversed = "";
        for(int i = words.length-1; i>=0; i--){
            reversed += words[i] + " ";
        }
        System.out.print( reversed.replaceAll("\\s+", " ").trim());
    }
}