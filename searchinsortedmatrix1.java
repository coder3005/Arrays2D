package Arrays2D;

public class searchinsortedmatrix1 {
    public static boolean staircaseSearch(int matrix[][], int key) {
        int col=0,row=matrix[0].length-1;
        while(col<matrix.length && row>=0) { // starting at last row 1st column
            if(matrix[row][col]==key) {
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]) {
                row--;
            }
            else {
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=30;
        staircaseSearch(matrix,key);
    }
}
