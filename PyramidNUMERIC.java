import java.util.*;
public class PyramidNUMERIC {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of pattern");
        int n=sc.nextInt();
        for(int i=0; i<n; i++)
        { // for spaces:
            for(int j=n-1; j>i; j--)
            {
                System.out.print(" ");
            }
            // for numbers:
            int k=1;
            for(int j=0; j<=i; j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
