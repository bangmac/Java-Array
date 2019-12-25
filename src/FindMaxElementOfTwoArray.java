public class FindMaxElementOfTwoArray {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 9, 6}, {15, 7, 12}};
        int indexX = 0, indexY = 0;
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    indexX = j;
                    indexY = i;
                }
            }
        }
        System.out.println("Max element of matrix is: matrix[" + indexY + "][" + indexX + "] = " + max);
    }
}