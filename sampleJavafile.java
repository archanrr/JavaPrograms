import java.util.*;
import java.*;

public class sampleJavafile
{
	public static void main(String[] args) {
		int k=0;
		try
		{
			int a=12/k;
			System.out.println(a);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally reached");
		}
	}
}
