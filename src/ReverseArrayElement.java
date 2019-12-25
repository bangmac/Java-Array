import java.util.Scanner;

public class ReverseArrayElement {
    public static void main(String[] args) {
        // Khai báo các biến, nhập và kiểm tra kích thước mảng
        int numElementOfArr;
        int [] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter number Element of array");
            numElementOfArr = sc.nextInt();
            if (numElementOfArr >20 ) {
                System.out.println("number Element of Array does not exceed 20");
            }
        }while (numElementOfArr>20);

        //Nhập giá trị cho các phần tử của mảng
        array = new int[numElementOfArr];
//        int i = 0;
//        while (i < array.length) {
//            System.out.println("enter Element " + (i + 1) + " : ");
//            array[i] = sc.nextInt();
//            i ++;
//        }
        for (int j=0; j<array.length;j++){
            System.out.println("enter Element " + (j + 1) + " : ");
            array[j] = sc.nextInt();
        }

        //In ra mang da nhap
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        //dao ngược thứ tự các phần tử của mảng
        for (int i=0;i<array.length/2;i++) {
            int temp = array[i];
            array [i] = array[numElementOfArr - 1 -i];
            array[numElementOfArr - 1 -i] = temp;
        }

        // in ra mang sau khi da dao nguoc cac phan tu
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
