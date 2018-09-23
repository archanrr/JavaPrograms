import java.util.*;

class Anagram
{
	public String str1,str2;
	Anagram(String str1,String str2)
	{
		this.str1=str1;
		this.str2=str2;
	}
	public  boolean checkAnagram(){
		if(str1.length()!=str2.length())
		{
			return false;
		}
		else
		{
			char[] first=str1.toCharArray();
			StringBuilder sb=new StringBuilder(str2);
			for(char c:first)
			{
				int index=sb.indexOf(""+c);
				if(index==-1)
				{
					return false;
				}
				else
				{
					sb.deleteCharAt(index);
				}
			}
			if(sb.length()==0)
			{
			    return true;
			}
			else
			{
				return false;
			}
		}
	}
}

public class str
{
	public static void main(String[] args) {
		Anagram a=new Anagram("archan","nahcra");
		if(a.checkAnagram())
		{
			System.out.println("String is Anagram");
		}
		else
		{
			System.out.println("String is not Anagram");
		}
	}
}