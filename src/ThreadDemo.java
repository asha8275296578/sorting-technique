

public class ThreadDemo extends Thread 
{
	public ThreadDemo(String name,int priority)
	{
		setName(name);
		setPriority(priority);
		start();
	}
public void run()
{
	for(int i=0;i<10;i++)
	{
		System.out.println(getPriority()+":"+getName()+":"+i);
	}
}
public static void main(String args[])
{
	ThreadDemo thread1=new ThreadDemo("ONE",9);
	ThreadDemo thread2=new ThreadDemo("Two",3);
	ThreadDemo thread3=new ThreadDemo("THREE",6);
	
}
}

