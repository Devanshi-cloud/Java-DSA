import java.util.*;
import java.util.Arrays;
public class binary_recursive {
    public static int binarySearch(int []a, int key, int high, int low)
    {
        int mid = (high + low)/2;
        if (low>high){
            return -1;
        }
        else if (key<a[mid]) {
            return binarySearch(a, key, high = mid-1, low);
        }
        else if (key>a[mid]) {
            return binarySearch(a, key, high, low= mid+1);
        }
        else{
            return a[mid];
        }
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements.");
        int a = sc.nextInt();
        int []arr= new int[a];
        System.out.print("Enter elements");
        for(int i = 0; i<a; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter key.");
        int key = sc.nextInt();
        Arrays.sort(arr);
        int high = arr.length -1;
        int low = 0;
        System.out.print(binarySearch(arr, key, high, low));
    }
}
