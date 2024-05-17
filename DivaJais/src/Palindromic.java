import java.util.*;
public class Palindromic {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String ans = longest(s);
        System.out.println("Longest-" + ans.length());
    }
    public static String longest(String s){
        if(s == null || s.length()<1) return "";
        int start = 0, end = 0;
        for(int i = 0; i<s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i+1);
            int len = Math.max(len1, len2);

            if(len> end - start) {
                start = i- (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end+1);
    }

    public static int expandAroundCenter(String s, int left, int right){
        int l = left, R = right;
        while(l >= 0 && R < s.length() && s.charAt(l) == s.charAt(R)){
            l--;
            R++;
        }
        return R-l-1;
    }
}
