import java.util.Scanner;

 public class CountCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = sc.nextLine();
        System.out.println("Enter character u need to find:");
        char character = sc.next().charAt(0);
        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == character)
                count++;
        }

        System.out.println(character + " appears in string " + count + " times");

    }
}