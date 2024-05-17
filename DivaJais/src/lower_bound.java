import java.util.*;
import java.util.Arrays;
public class lower_bound {
    public static int LowerBound(int []a, int ind, int x)
    {
        int high = ind-1, low = 0;
        int ans = ind;
        while(low<=high)
        {
            int mid = (high+low)/2;
            if(a[mid] >= x) // a[mid] > x = UpperBound
            {
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements.");
        int a = sc.nextInt();
        int[] arr= new int[a];
        System.out.print("Enter elements");
        for(int i = 0; i<a; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter key.");
        int key = sc.nextInt();
        Arrays.sort(arr);
        int ind = arr.length;
        System.out.print(Arrays.toString(arr)+" ");
        System.out.print(LowerBound(arr, ind, key));
    }
}
