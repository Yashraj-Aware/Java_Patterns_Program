import java.util.*;
public class HollowSquarePattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of pattern");
        int n_row=sc.nextInt();
        System.out.println("Enter the number of columns");
        int n_col=sc.nextInt();
        for(int i=0;i<n_row;i++)
        {
            for(int j=0;j<n_col;j++)
            {
                if(i == 0 || j == 0 || i == n_row-1 || j == n_col-1){ // holow rectangle
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
