import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        // Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size of list: ");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        //Nhập giá trị cho các phần tử của mảng
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = sc.nextInt();
        }

        // in ra danh sach cac phan tu da nhap
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        //Duyệt các phần tử trong mảng để tìm GTLN và vị trí
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}