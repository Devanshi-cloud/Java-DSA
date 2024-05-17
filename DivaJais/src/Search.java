import java.util.Arrays;
import java.util.Scanner;
public class Search {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of elements.");
            int a = sc.nextInt();
            int[] arr = new int[a];
            System.out.println("Enter elements");
            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter key.");
            int key = sc.nextInt();
            //sc.nextLine();
            Arrays.sort(arr);
            int ind = Arrays.binarySearch(arr, key);
            if (ind < 0) {
                ind = -(ind + 1);
            }
            System.out.println(Arrays.toString(arr) + " ");

            System.out.println(ind);
            //sc.nextLine();
            int[] newArr = addPos(ind, arr, key);

            System.out.println(Arrays.toString(newArr) + " ");
        }

        public static int[] addPos(int ind, int[] arr, int key) {
            int[] newArr = new int[arr.length + 1];
            System.arraycopy(arr, 0, newArr, 0, ind);
            newArr[ind] = key;
            System.arraycopy(arr, ind, newArr, ind + 1, arr.length - ind);
            return newArr;
        }
    }

