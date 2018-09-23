import java.util.*;

class Duplicate1
{
	public static void findDuplicate(String str)
	{
		char[] newStr=str.toCharArray();
		Map<Character,Integer>m=new HashMap<Character,Integer>();
		for(Character ch:newStr)
		{
			if(m.containsKey(ch))
			{
				m.put(ch,m.get(ch)+1);
			}
			else
			{
				m.put(ch,1);
			}
		}
		for(Character ch:newStr)
		{
			if(m.get(ch)>1)
			{
				System.out.println(ch+"-"+m.get(ch));
				m.put(ch,0);
			}
		}
	}
}


public class duplicate{
	public static void main(String[] args) {
		Duplicate1.findDuplicate("archanrajaramramadevi15017@it.ssn.edu.in");
	}
}