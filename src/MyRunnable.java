
public class MyRunnable implements Runnable{
    private Thread thread;
    public MyRunnable(String name) {
        thread = new Thread(this);
        thread.setName(name);
        thread.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(thread.getPriority() + " : " + thread.getName() + " : " + i);
        }
    }
    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable("ONE");
        MyRunnable myRunnable2 = new MyRunnable("TWO");
        MyRunnable myRunnable3 = new MyRunnable("THREE");
    }
}


