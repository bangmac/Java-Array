import java.util.Scanner;

 public class addElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int insertionValue;
        System.out.print("Enter value need to insert: ");
        insertionValue = sc.nextInt();
        System.out.print("Enter position u want to insert: ");
        int position = sc.nextInt();

        if (position <= 1 || position >= array.length) {
            System.out.println("Can not insert");
        } else {
            int temp = array[position];
            array[position] = insertionValue;
            for (int i = position + 1; i < array.length - 1; i++) {
                int temp2 = array[i];
                array[i] = temp;
                temp = temp2;
            }
        }

        for (int value : array) {
            System.out.print(value + "\t");
        }
    }
}