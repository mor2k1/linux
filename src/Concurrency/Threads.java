package Concurrency;

import static Concurrency.ThreadColor.*;

public class Threads {
    public static void main(String[] args){
        System.out.println(ANSI_PURPLE + "Main program");
        Thread initializeThreadTwo = new ThreadTwo(); // referenced to the class name of the thread.

        initializeThreadTwo.start();

        new Thread(){
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class Thread" + ANSI_RESET);
                System.out.println("New line back to normal color");
            }
        }.start();
    }
}
