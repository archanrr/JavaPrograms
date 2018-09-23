import java.util.*;
class single
{
	private single(){}
	private static final single instance=null;
	private static final single getInstance()
	{
		if(instance==null)
		{
			System.out.println("Instance class created");
			return new single();
		}
		return instance;
	}

}
public class SerialSingleton
{
	public static void main(String[] args) {
		single.getInstance();
	}
}