import java.util.Scanner;
import java.util.Random;
public class Question2 {
    public static void main(String[] args) {
        Random randomo = new Random(1000);
        for (int i = 0; i < 50; i++) {
            int j = randomo.nextInt(100);
            if (j <= 100 && j >= 0) {
                System.out.println(j);
            }
        }
    }
}
