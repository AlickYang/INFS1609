import java.util.*;

public class Question1 {
    final static int END_TIME = 100000000000; //Outside of int range
    final static int START_TIME = 1000;
    public static void main(String[] args) {
        Date date = new Date();
        int i;
        for (i = 100; i <= END_TIME; i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}
