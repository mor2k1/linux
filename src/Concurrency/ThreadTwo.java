package Concurrency;

import static Concurrency.ThreadColor.ANSI_BLUE;

public class ThreadTwo extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("Something wrong.. ");
            return;
        }
            System.out.println("3 seconds passed and now I woke up");
    }
}
