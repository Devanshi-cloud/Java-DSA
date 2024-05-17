import java.util.*;
class test{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the investment amount:");
        int a = sc.nextInt();
        System.out.println("Input the rate of interest:");

        int b = sc.nextInt();
        System.out.println("Input number of years:");

        int c = sc.nextInt();
        System.out.println("Future investment-");

        double m = (double)a;
        double r = b/100.0;
        for(int i=0; i<c; i++){
            m = m * Math.pow((1+r/12), 12);
            System.out.println("Year-"+(i+1));
            System.out.printf("%.2f\n",m);
        }
    }}
