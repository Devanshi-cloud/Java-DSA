import java.util.*;
public class Selection {
    public static void printArray(int arr[], int n)
    {
    for (int i= 0; i<n; i++)
    {
        System.out.print(arr[i]+ " ");
    }
    }
    public static void selection(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int smallest = i; //not a[i]
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[j - 1]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr,n);
    }
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size.");
    int n= sc.nextInt();
    System.out.println("Enter elements.");
    int arr[]= new int[n];
    for(int i=0;i<n;i++)
    {
    arr[i]=sc.nextInt();
    }
    selection(arr,n);
    }
}