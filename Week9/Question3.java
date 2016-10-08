import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
          System.out.println(cal.getTime());
          //cal.setTimeInMillis(1234)
          cal.setTimeInMillis(1234567898765L);
          System.out.println(cal.getTime());
    }
}
