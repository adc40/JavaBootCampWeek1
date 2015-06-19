/**
 * Created by Abram on 6/19/2015.
 */
public class JavaBootCampWeek1 {
    public static void main(String[] args) {

        /*find junior*/

        int age[] = new int[]{32,25,56,12,65,20,56,22,19,54,300,22};
        int junior = age[0];

        for (int i = 1; i < age.length; i++) {
            if (age[i] < junior) {
                junior = age[i];
            }
        }

        System.out.println(junior);

        /*sorts array*/

        int temp;

        for (int i = 0; i < age.length; i++) {
            for (int j = 0; j < age.length - 1; j++) {
                if (age[j] > age[j + 1]) {
                    temp = age[j + 1];
                    age[j + 1] = age[j];
                    age[j] = temp;
                }
            }
        }

        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }
        System.out.print("\n");


        /*group the ages into 3 arrays*/

        int minor[] = new int[age.length];
        int major[] = new int[age.length];
        int senior[] = new int[age.length];
        int mi = 0, ma = 0, s = 0;

        for (int i =0; i < age.length; i++){
            if (age[i] < 18) {
                minor[mi] = age[i];
                mi++;
            } else if (age[i] < 65) {
                major[ma] = age[i];
                ma++;
            } else {
                senior[s] = age[i];
                s++;
            }
        }

        System.out.print("Minors:  ");

        for (int i = 0; i < mi; i++) {
            System.out.print(minor[i] + " ");
        }
        System.out.print("\nMajors:  ");

        for (int i = 0; i < ma; i++) {
            System.out.print(major[i] + " ");
        }
        System.out.print("\nSeniors:  ");

        for (int i = 0; i < s; i++) {
            System.out.print(senior[i] + " ");
        }
        System.out.print("\n");


        /*/Capitalize first letter of every word in sentence*/

        String input = args[0];
        System.out.println("input = " + args[0]);
        String[] words = input.split(" ");
        System.out.print("Capitalized: ");

        for (int i = 0; i < words.length; i++) {
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

        /*Palindrome test*/

        char[] input2 = input.toCharArray();
        char[] backwards = new char[input2.length];

        for(int i = 0, j = input2.length - 1; i < input2.length; i++, j--) {
            backwards[i] = input2[j];
        }

        String reverseInput = new String(backwards);

        if (reverseInput.equals(input)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("Not a palindrome!");
        }
    }
}
