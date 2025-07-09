package Threads;

public class Thread01Task implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i <= 100; i++){
            System.out.println(i);
        }
    }
}
