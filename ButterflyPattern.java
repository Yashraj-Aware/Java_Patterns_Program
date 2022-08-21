import java.util.*;
public class ButterflyPattern {
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of rows of pattern");
    int n=sc.nextInt();
         for(int i=1;i<=4;i++)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
             int spaces=2*(4-i);
             for(int j=1;j<=spaces;j++)
             {
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
         for(int i=4;i>=1;i--)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
             int spaces=2*(4-i);
             for(int j=1;j<=spaces;j++)
             {
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
