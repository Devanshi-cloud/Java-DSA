import java.util.*;
import java.util.Arrays;

public class SearchInsert {

    public static int LowerBound(int[] arr, int ind, int key){
        int high = ind-1, low = 0, mid = 0;
        int ans = ind;
        while(high >= low)
        {
            mid = (high+low)/2;
            if(arr[mid]>= key)
            {
                ans = ind;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    static int[] addPos(int ind, int[] array, int pos, int value) {
        // initially set to value parameter so the first iteration, the value is replaced by it
        int prevValue = value;

        // Shift all elements to the right, starting at pos
        for (int i = pos; i < array.length-1; i++) {
            int tmp = prevValue;
            prevValue = array[i];
            array[i] = tmp;
        }
        return array;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements.");
        int a = sc.nextInt();
        int[] arr= new int[a];
        System.out.println("Enter elements");
        for(int i = 0; i<a; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter key.");
        int key = sc.nextInt();
        //sc.nextLine();
        Arrays.sort(arr);
        int ind = arr.length;
        System.out.println(Arrays.toString(arr)+" ");

        System.out.println(LowerBound(arr, ind, key));
        //sc.nextLine();
        int ans = LowerBound(arr, ind, key);

        System.out.println(Arrays.toString(addPos(ind, arr, key, ans))+" ");
    }
}
