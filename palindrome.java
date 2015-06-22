/**
 * Created by Abram on 6/22/2015.
 */
public class palindrome {
    public static void main(String[] args) {
         /*Palindrome test*/
        String input = args[0];
        char[] inputArray = input.toCharArray();
        int inputLength = inputArray.length;
        char[] backwards = new char[inputLength];

        for(int i = 0, j = inputArray.length - 1; i < inputLength; i++, j--) {
            backwards[i] = inputArray[j];
        }

        String reverseInput = new String(backwards);

        if (reverseInput.equals(input)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("Not a palindrome!");
        }
    }
}
