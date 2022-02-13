import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeScanner {
    public static void main(String[] args) {
        System.out.println("Vvedite slovo, chislo s plavajuschej tochkoj i boolean znachenije");

        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[scanner.nextInt()];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(ints));
    }
}
