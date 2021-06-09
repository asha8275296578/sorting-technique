

public class ThreadDemo2 implements Runnable{
    private Thread thread;
    public ThreadDemo2(String name) {
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
        ThreadDemo2 myRunnable1 = new ThreadDemo2("ONE");
        ThreadDemo2 myRunnable2 = new ThreadDemo2("TWO");
        ThreadDemo2 myRunnable3 = new ThreadDemo2("THREE");
    }
}

