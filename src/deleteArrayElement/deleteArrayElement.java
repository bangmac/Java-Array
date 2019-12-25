package deleteArrayElement;

import java.util.Scanner;

public class deleteArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.print("Enter value need to delete: ");
        int value = sc.nextInt();
        int position = find(array, value);

        if (position < 0) {
            System.out.println("value is not exist in array");
        } else {
            if (array.length - 1 - position >= 0)
                System.arraycopy(array, position + 1, array, position, array.length - 1 - position);
        }

        for (int element : array) {
            System.out.print(element + "\t");
        }
        sc.close();
    }

    private static int find(int[] arr, int value) {
        if (arr == null)
            return -1;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == value)
                return i;
            else i++;
        }
        return -1;
    }
}