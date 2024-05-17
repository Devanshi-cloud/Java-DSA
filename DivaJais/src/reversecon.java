import java.util.Scanner;
public class reversecon {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
            String[] arr = s.split(" ");
            String ret = "";
            for(int i = arr.length - 1; i >= 0; i--){
                ret = ret.concat(arr[i]).trim();
                ret = ret.concat(" ");
            }
        System.out.print(ret.trim());
        }
    }
