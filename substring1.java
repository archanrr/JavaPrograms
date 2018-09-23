import java.util.*;
public class substring1
{
	public static void main(String[] args) {
		String str="CZHAN";
		Arrays.sort(str.toCharArray());
		String small=str.substring(0,4);
		String large=str.substring(0,str.length());
		for(int k=2;k<str.length();k++)
		for(int i=0;i<str.length()-k+1;i++)
		{
			//System.out.println( str.substring(i,i+k));
			if(str.substring(i,i+k).compareTo(small)<0)
			{
				small=str.substring(i,i+k);
			}
			if (str.substring(i,i+k).compareTo(large)>0) {
				large=str.substring(i,i+k);
			}
		}
		System.out.println("Smallest:" +small+"\n"+"Largest:"+large);
	}

}