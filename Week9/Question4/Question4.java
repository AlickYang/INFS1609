import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Question4 {
    public static void main(String[] args) {
        test1();
        test2();
    }

    //Test of 10 seconds
    public static void test1() {
        System.out.println("===Starting Test 1===");
        Stopwatch stopwatch1 = new Stopwatch();
        System.out.println(stopwatch1.getStartTime().toString());
        System.out.println("Starting stopwatch");
        stopwatch1.start();
        //Taken from stackoverflow, makes system wait 10 seconds
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
        stopwatch1.stop();
        System.out.println("Ending stopwatch");
        System.out.println("Elapsed time (in milliseconds) is: " + stopwatch1.getElapsedTime());
        System.out.println("===End Test 1===");
    }
    public static void test2() {
        System.out.println("===Starting Test 2===");
        Stopwatch stopwatch2 = new Stopwatch();
        stopwatch2.start(); //Start stopwatch
        selectionSortFunction(); //Imaginary function
        stopwatch2.stop(); //Start stopwatch
        System.out.println("Elapsed time (in milliseconds) is: " + stopwatch2.getElapsedTime());
    }
}
