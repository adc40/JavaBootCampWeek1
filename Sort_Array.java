/**
 * Created by Abram on 6/22/2015.
 */
public class Sort_Array {
    public static void main(String[] args) {

        int age[] = new int[]{32, 25, 56, 12, 65, 20, 56, 22, 19, 54, 300, 22};
        int length = age.length;
        int temp;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (age[j] > age[j + 1]) {
                    temp = age[j + 1];
                    age[j + 1] = age[j];
                    age[j] = temp;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(age[i] + " ");
        }
        System.out.print("\n");
    }
}
