package main;

/**
 * Created by lukas on 22.09.2016.
 */
public class FirstTry {
    public static void main(String[] args) {
        System.out.println("Ahoj");
        ThreadTest tt1 = new ThreadTest("Vlakno");
        tt1.start();
        ThreadTest tt2 = new ThreadTest("SuperVlakno");
        tt2.start();
        System.out.println("The End");
    }
}
