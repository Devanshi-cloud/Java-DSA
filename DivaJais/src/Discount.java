import java.util.*;
public class Discount {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity");
        double q = sc.nextInt();
        double total = 100*q;
        double discount, Cost;
        if(total>1000)
        {
            discount = 0.1*total;
            System.out.println("Discount-"+discount);
            Cost = total - discount;
            System.out.print("Cost-"+Cost);
        }
        else
        {
            System.out.print("NO DISCOUNT");
        }
    }
}
