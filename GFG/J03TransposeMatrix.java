import java.util.ArrayList;

public class J03TransposeMatrix {
    // [Approach 1] Brute Force Matrix Transposition O(n*m) Time and O(n*m) Space

    public static ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> transposed = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                transposed.add(mat[j][i]);
            }
            result.add(transposed);
        }
        return result;
    }

    // [Approach 2] Using constant space for Square Matrix O(n*n) Time and O(1)
    // Space
    public static int[][] usingSwaping(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;
    }

    public static void main(String args[]) {
        int[][] mat = {
                { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 }
        };

        ArrayList<ArrayList<Integer>> result = transpose(mat);

        // Print result
        for (ArrayList<Integer> row : result) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
        // using swapping
        System.out.println(transpose(mat));
    }
}
