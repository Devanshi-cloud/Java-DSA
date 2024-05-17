import java.util.*;
public class Marks {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of exams");
        int n = sc.nextInt();
        int []marks = new int[n];
        System.out.println("Enter your marks obtained in subjects:");
        for(int i=0; i<n; i++) {
            marks[i] = sc.nextInt();
        }

        int t = 0;
        for(int mark : marks){
            t += mark;
        }

        double p = ((double) t / (n*100)) * 100;
        System.out.println("Total Marks");
        System.out.println(t);
        System.out.println("Percentage");
        System.out.println(String.format("%.1f", p));
    }
}
