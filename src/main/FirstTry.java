package main;

/**
 * Created by lukas on 22.09.2016.
 */
public class FirstTry {

    public static int actualCol;
    public static void main(String[] args) {

        actualCol=1;
        System.out.println("Ahoj");
        Thread1 tt1 = new Thread1("Vlakno");
        tt1.start();
        Thread1 tt2 = new Thread1("SuperVlakno0");
        tt2.start();
        Thread1 tt3 = new Thread1("SuperVlakno1");
        tt3.start();
        Thread1 tt4 = new Thread1("SuperVlakno2");
        tt4.start();
        System.out.println("The End");
    }
}
