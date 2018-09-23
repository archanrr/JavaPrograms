import java.util.*;
class singleton implements Runnable
{
	private singleton(){}

    private static singleton instance=null;
    private static int count=0;
	public static final singleton getInstance()
	{
		if(instance==null)
		{
			instance=new singleton();
			count++;
			System.out.println("Singleton class instance created for "+count+"  time ");
		}
		else
		{
			System.out.println("Only one instace can be created");
		}
		return instance;
	}
	public void run()
   {
   	singleton.getInstance();
    }
}
public class singletonPattern
{
	public static void main(String[] args) {
		Thread t=new Thread(singleton.getInstance());
        for (int i=0;i<20 ;i++){
		     t.run();
        }
        Thread t1=new Thread(singleton.getInstance());
        	for (int j=0;j<100;j++) {
        		t1.run();
        	}
        
		
	}
}