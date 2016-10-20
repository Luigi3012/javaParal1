package main;

/**
 * Created by lukas on 14.10.2016.
 */
public class Thread1 implements Runnable {

    protected Thread t;
    protected String threadName;
    //protected int actualCol;

    Thread1(String name){
        threadName=name;
        //System.out.println("Vytvara sa: "+threadName);
    }

    public void run() {

        try {
            FirstTry.semafor(threadName);
                Thread.sleep(50);

        } catch (InterruptedException e) {
            System.out.println("Vlakno sa pokazilo: " + threadName);
        }
        //System.out.println("Vlakno konci: " + threadName);
    }


    public void start(){
        //System.out.println("Spusta sa: "+threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }


}

