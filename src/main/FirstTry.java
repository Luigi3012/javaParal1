package main;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lukas on 22.09.2016.
 */
public class FirstTry {

    public static int actualCol;
    public static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {

        actualCol=1;
//        System.out.println("Ahoj");
//        Thread1 tt1 = new Thread1("Vlakno");
//        tt1.start();
//        Thread1 tt2 = new Thread1("SuperVlakno0");
//        tt2.start();
//        Thread1 tt3 = new Thread1("SuperVlakno1");
//        tt3.start();
//        Thread1 tt4 = new Thread1("SuperVlakno2");
//        tt4.start();
        for(int i=0;i<10;i++){
            new Thread1("SuperVlakno"+i).start();
        }
        //System.out.println("The End");
    }

    public static int semafor(String threadName){
        //System.out.println(FirstTry.actualCol);
        FirstTry.lock.lock();
        if (FirstTry.actualCol == 1){
            System.out.println("zelena");
            FirstTry.actualCol=0;
        }
        else{
            System.out.println("cervena");
            FirstTry.actualCol=1;
        }
        //System.out.println("Vlakno pise: " + threadName);
        FirstTry.lock.unlock();
        return FirstTry.actualCol;

    }
}
