/* Mirror Matrix Using 2D Array */
import java.util.Scanner;
class A 
{
    public static void main(String[] args) {
        
        int a[][]=new int[2][2];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Array Data ");
        for(int i=0;i<=1;i++) // rows
        {
            for(int j=0;j<=1;j++) // columns
            {
                a[i][j]=r.nextInt();
            }
        }
        System.out.print("Array Matrix:\n");
        for(int i=0;i<=1;i++) // rows
        {
            for(int j=0;j<=1;j++) // columns
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("Mirror Matrix:\n");
        for(int i=0;i<=1;i++) // rows
        {
            for(int j=1;j>=0;j--) // columns
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
