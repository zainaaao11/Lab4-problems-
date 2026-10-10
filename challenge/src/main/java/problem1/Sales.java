package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        System.out.print("Print the number of salespeople: ");
        Scanner obj=new Scanner(System.in);
        final int SALESPEOPLE = obj.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (int)(i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxSale=sales[0];
        int maxSaleId=1;
        int minSale=sales[0];
        int minSaleId=1;
        for (int i=0; i<sales.length; i++)
        {
            if (sales[i]>maxSale) {
                maxSale=sales[i];
                maxSaleId=(int)(i+1);
            }
            if (sales[i]<minSale){
                minSale=sales[i];
                minSaleId=(int)(i+1);
            }
            System.out.println(" " + (int)(i+1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        double avgSale= (double) (sum/SALESPEOPLE);
        System.out.println("The average sale is $"+ avgSale);
        System.out.println("Salesperson "+maxSaleId+" has the highest sale with $"+maxSale);
        System.out.println("Salesperson "+minSaleId+" has the smallest sale with $"+minSale);
        Scanner scanner=new Scanner(System.in);
        System.out.print("Print an upper bound of the sales: ");
        int upperBound=scanner.nextInt();
        int counter=0;
        System.out.println("The Salespeople whose sales value exceeded $"+upperBound+" are: ");
        System.out.println("Id  Amount");
        for (int i=0; i<SALESPEOPLE; i++){
            if (sales[i]>upperBound){
                System.out.println(i+1+"   $"+sales[i]);
                counter++;
            }
        }
        System.out.println("the total number of people who exceeded $"+upperBound+" is "+counter);
    }
}