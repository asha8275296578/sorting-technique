public class Resource
{
	public synchronized void printMsg(String msg)
	{
		System.out.println("["+msg);
		try
		{
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
			
		}
		System.out.println("]");
	}
}




