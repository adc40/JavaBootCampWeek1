/**
 * Created by Abram on 6/22/2015.
 */

public class Grouping_Arrays {

    public static void main(String[] args) {

     /*group the ages into 3 arrays*/

        int age[] = new int[]{32, 25, 56, 12, 65, 20, 56, 22, 19, 54, 300, 22};
        int minor[] = new int[age.length];
        int major[] = new int[age.length];
        int senior[] = new int[age.length];
        int min = 0, maj = 0, s = 0;

        for (int i = 0; i < age.length; i++) {
            if (age[i] < 18) {
                minor[min++] = age[i];
            } else if (age[i] < 65) {
                major[maj++] = age[i];
            } else {
                senior[s++] = age[i];
            }
        }

        System.out.print("Minors:  ");
        for (int i = 0; i < min; i++) {
            System.out.print(minor[i] + " ");
        }

        System.out.print("\nMajors:  ");
        for (int i = 0; i < maj; i++) {
            System.out.print(major[i] + " ");
        }

        System.out.print("\nSeniors:  ");
        for (int i = 0; i < s; i++) {
            System.out.print(senior[i] + " ");
        }
    }
}
