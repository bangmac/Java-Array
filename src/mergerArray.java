public class mergerArray {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6, 7, 8, 9};
        int[] resultArray = new int[firstArray.length + secondArray.length];
        int i;
        for (i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }

        for (; i < resultArray.length; i++) {
            resultArray[i] = secondArray[i - firstArray.length];
        }

        for (int value : resultArray) {
            System.out.print(value + "\t");
        }
    }
}

