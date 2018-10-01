import java.util.*;
class hotel
{
	String hotelname;
	int regWD;
	int regWE;
	int rewWD;
	int rewWE;

	void sethotel(String h,int a,int b,int c,int d)
	{
		this.hotelname=h;
		this.regWD=a;
		this.regWE=b;
		this.rewWD=c;
		this.rewWE=d;
	}
	public int sum=0;
	public int getTotal(String type,String day)
	{
		if(type=="Regular" && day=="MON" || day=="TUE" || day=="WED" || day=="THU" || day=="FRI")
		{
			sum=regWD;
		}
		else if(type=="Regular")
		{
			sum=regWE;
		}

		if(type=="Rewards" && day=="MON" || day=="TUE" || day=="WED" || day=="THU" || day=="FRI")
		{
			sum=rewWD;
		}
		else if(type=="Rewards")
		{
			sum=rewWE;
		}
		return sum;
	}
	String getName()
	{
		return this.hotelname;
	}
};
public class thought
{
	public static void main(String[] args) {
		int no_of_hotel=3;
		hotel h[]=new hotel[no_of_hotel];
		h[0]=new hotel();
		h[1]=new hotel();
		h[2]=new hotel();
		try
		{
		h[0].sethotel("LakeWood",503,100,25,75);
		h[1].sethotel("BakeWood",75,150,50,100);
		h[2].sethotel("lukeWood",215,150,20,40);
		}
		catch(Exception ex)
		{
			System.out.println("hi Archan"+ex);
		}
		int sum1=0,sum2=0,sum3=0;
		int min=1000;
		String hotel_Name="hi";
		for(int i=0;i<no_of_hotel;i++)
		{
			sum1+=h[i].getTotal("Regular","MON");
			sum1+=h[i].getTotal("Regular","SAT");
			sum1+=h[i].getTotal("Regular","SUN");
			if(min>sum1)
			{
				min=sum1;

				hotel_Name=h[i].getName();

			}
			sum1=0;
		}
		System.out.println("Hotel name is "+hotel_Name);
	}
}