package main;

/**
 * Created by lukas on 25.09.2016.
 */
public class ThreadTest implements Runnable {
    protected Thread t;
    protected String threadName;

    ThreadTest(String name){
        threadName=name;
        System.out.println("Vytvara sa: "+threadName);
    }

    public void run(){
        System.out.println("Bezi: "+threadName);
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Vlakno: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        }
        catch (InterruptedException e){
            System.out.println("Vlakno sa pokazilo: "+threadName);
        }
        System.out.println("Vlakno konci: "+threadName);
    }

    public void start(){
        System.out.println("Spusta sa: "+threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}

