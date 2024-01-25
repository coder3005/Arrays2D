package Arrays2D;
import java.util.*;

public class basic {
    public static boolean search(int matrix[][], int key) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length;j++) {
                if(matrix[i][j]==key) {
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=3,m=3; // n=matrix.length, m=matrix.length
        Scanner r=new Scanner(System.in);
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                matrix[i][j]=r.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,5);
        r.close();
    }
}
