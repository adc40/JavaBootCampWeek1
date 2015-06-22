/**
 * Created by Abram on 6/22/2015.
 */
public class Capitalize {
    public static void main(String[] args) {
         /*/Capitalize first letter of every word in sentence*/

        String input = args[0];
        System.out.println("input = " + args[0]);
        String[] words = input.split(" ");
        System.out.print("Capitalized: ");
        int wordsLength = words.length;

        for (int i = 0; i < wordsLength; i++) {
            char[] chars = words[i].toCharArray();
            for (int j  = 0; j < chars.length; j++) {
                if (j == 0) {
                    System.out.print(Character.toUpperCase(chars[j]));
                } else {
                    System.out.print(chars[j]);
                }
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
