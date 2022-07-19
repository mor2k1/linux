package Concurrency;

import static Concurrency.ThreadColor.*;

public class Threads {
    public static void main(String[] args){
        System.out.println(ANSI_PURPLE + "Main program");
        Thread initializeThreadTwo = new ThreadTwo(); // referenced to the class name of the thread.
        initializeThreadTwo.setName("== Initialize Thread Name ==");
        initializeThreadTwo.start();

        new Thread(){
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class Thread" + ANSI_RESET);
                System.out.println("New line back to normal color");
            }
        }.start();
        initializeThreadTwo.setPriority(Thread.MAX_PRIORITY); // priority is can be set between 1-10. 1=MIN, 5=NORMAL,
        // 10=MAX
        initializeThreadTwo.setPriority(9);
        System.out.println(initializeThreadTwo.getPriority());
//        Thread runnable = new Thread(new MyRunnable());
//        runnable.start();
//        initializeThreadTwo.interrupt();
            Thread myRunnableThread = new Thread(new MyRunnable(){
                @Override
                public void run() {
                    System.out.println(ANSI_PURPLE + "Hello from the anonymous class implementation of run()");
                    try{
                        initializeThreadTwo.join(); // The current thread will continue just when the join one will
                        // terminated. It is possible to add to the join sleeping time in milliseconds
                        System.out.println(ANSI_CYAN + "This is happening after the sleep");
                    }catch (InterruptedException e){
                        System.out.println(ANSI_RED + "Something was interrupted");
                    }
                }
            });
            myRunnableThread.start();


    }
}
