import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Elements ");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.print("Enter 2nd Array Elements ");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                b[i][j]= sc.nextInt();
            }
        }
        System.out.print("Matrix: \n");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Matrix 2: \n");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Sum of Matrix: \n");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                c[i][j]= a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
