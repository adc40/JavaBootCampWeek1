/**
 * Created by Abram on 6/22/2015.
 */
public class Find_Junior {
    public static void main(String[] args) {

        /*find junior*/

        int age[] = new int[]{32, 25, 56, 12, 65, 20, 56, 22, 19, 54, 300, 22};
        int junior = age[0];
        int length = age.length;

        for (int i = 1; i < length; i++) {
            if (age[i] < junior) {
                junior = age[i];
            }
        }

        System.out.println(junior);
    }
}
