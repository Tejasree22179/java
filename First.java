//add,sub,mul,div
/*import java.util.*;
public class First{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		double s1=s.nextDouble();
		double s2=s.nextDouble();
		System.out.println(s1+s2);
		System.out.println(s1-s2);
		System.out.println(s1*s2);
		System.out.println(s1/s2);
		System.out.println(s1%s2);
	}
}*/
//2.fahrenheit to celsius and celsius to fahrenheit
/*import java.util.*;
public class First{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		float fah=s.nextFloat();
		float cel=(fah-32)*5/9;
		System.out.println(String.format("%.2f", cel));
		//float cel=s.nextFloat();
		//float fah=(cel*9/5)+32;	
		//System.out.println(fah);
	}
}*/
//3.even or odd checker
/*import java.util.*;
public class First{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%2==0)
		{
		System.out.println("even"+n);
		}
		else
		{
		System.out.println("odd"+n);
		}
	}
}*/
//4.area of a circle and circumference
/*import java.util.*;
public class First{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		float r=s.nextFloat();
		System.out.println("area is"+3.14*r*r);
		System.out.println("the circumference is"+2*3.14*r); 
	}
}*/
//5.Largest of 3 numbers
/*import java.util.*;
public class First{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		float r=s.nextFloat();
		float s1=s.nextFloat();
		float t=s.nextFloat();
		if(r>s1 && r>t)
		{
		System.out.println(r);
		}
		else if(s1>r && s1>t)
		{
		System.out.println(s1);
		}
		else
		{
		 System.out.println(t);
		}
	}
}*/
//6.Average of n numbers
/*import java.util.*;
public class First{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int[] arr=new int[5];
float sum=0;
		for(int i=0;i<5;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<5;i++)
		{
		 sum=sum+arr[i];
		}
		
		System.out.println(String.format("%.0f",sum));
		System.out.println(String.format("%.2f",sum/5));

	}
}*/
//7.age category
/*import java.util.*;
public class First{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		if(age<13)
		System.out.println("child");
		else if(age>=13 && age<20)
		System.out.println("teen");
		else if(age>=20 && age<60)
		System.out.println("adult");
		else 
		System.out.println("senior citizen");

	}
}*/
//8.electricity bill caluculator
/*import java.util.*;
public class First{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		float units=s.nextInt();
		int bill=0;
		if (units<=100)
		{
			bill=units*1.5;
			System.out.println(bill);
		}
		else if(units>101 && units<200)
		{
			bill=units*2.5;
			System.out.println(bill);
		}
		else
			{
			bill=units*4;
			System.out.println(bill);
			}
	}
}*/		
//9.salary slip generator
/*import java.util.*;
public class First{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int salary=s.nextInt();
		int hra=salary*20/100;
		int da =salary *10/100;
		int gross=salary+hra+da;
System.out.println(hra);
System.out.println(da);
System.out.println(gross);
	}
}*/
//10.time converter
import java.util.*;
public class First{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int minutes=s.nextInt();
		int hour=minutes/60;
		int tm=minutes%60;
		System.out.println(hour+"hour"+tm+"minutes");
		
	}
}
		