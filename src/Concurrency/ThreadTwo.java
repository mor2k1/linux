package Concurrency;

import static Concurrency.ThreadColor.ANSI_BLUE;

public class ThreadTwo extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from thread 2");
    }
}
