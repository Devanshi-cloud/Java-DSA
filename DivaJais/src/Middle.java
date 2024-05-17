import java.util.*;
public class Middle {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String name = sc.nextLine();
        String middle = findMiddle(name);
        System.out.println("Middle character is: " + middle);
    }
    public static String findMiddle(String name){
        int length = name.length();
        int mid = length/2;
        if(length % 2 == 0) {
            return name.substring(mid - 1, mid + 1);
        }
        else{
            return name.substring(mid, mid+1);
        }
    }
}
