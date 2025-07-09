package Threads;

public class Thread02Task extends Thread{
    @Override
    public void run() {
        System.out.println(super.getState());
        for(int i = 0; i <= 100; i++){
            if (i == 99) System.out.println(this.getState());
        }
    }
}
