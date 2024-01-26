import java.util.*;

public class tanspose {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int m=r.nextInt();
        int a[][]=new int[n][m];
        int t[][]=new int[m][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                a[i][j]=r.nextInt();
            }
        }
        
        // for(int i=0;i<nums[0].length;i++) {
        //     for(int j=0;j<nums.length;j++) {
        //         System.out.print(nums[j][i]+" ");
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                t[j][i]=a[i][j];
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        r.close();
    }
}
