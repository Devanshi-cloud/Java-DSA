import java.util.*;
import java.util.Arrays;
public class Binary
{
    public static int binarySearch(int[] a, int key)
        {
            int l = 0, h =a.length-1, mid=0;
            while(l <= h)
            {
                mid = (l+h)/2;
                if(mid == key)
                {
                    return mid;
                }
                else if(key<mid)
                {
                    h = mid-1;
                }
                else
                {
                    l = mid+1;
                }
            }
            return -1;
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
        System.out.print(binarySearch(arr, key));
    }
}
