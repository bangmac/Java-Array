import java.util.Scanner;

public class SumNumberOfCollum {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter column u want to calcute sum: ");
        int column = sc.nextInt();
        int sum = 0;
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                if (j == column)
                    sum += ints[j];
            }
        }
        System.out.println("Sum = " + sum);
    }
}