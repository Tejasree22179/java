import java.util.*;
public class Second
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);


char ch=s.next().charAt(0);
	if(ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U'||ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')
	{
		System.out.println(ch+"is a vowel");
	}
	else
	{
	System.out.println(ch+"is not an vowel");
	}



	//indiviual sum
	/*int year=s.nextInt();
	if(year%4==0 && year%100!=0||year%400==0)
		{
			System.out.println(year+"is a leap year");
		}
		else
		{
			System.out.println(year+"is not leap year");
		}*/



		/*int n=s.nextInt();
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.print(sum);*/


		/*int n=s.nextInt();
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.print(rev);*/



		/*int n=s.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.print(fact);*/


		/*int n=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			int s1=n*i;
		System.out.println(s1);
		}*/


		//fibonocci series
		/*int n=s.nextInt();
		int a=0,b=1;
		System.out.print(a+" "+b);
		for(int i=1;i<n;i++)
		{	
			int c=a+b;
			System.out.print(" "+c+" ");
			a=b;
			b=c;
		}*/


		//Armstrong
		/*int n=s.nextInt();
		int temp=n;
		int len=0;
		while(n!=0)
		{
			len++;
			n=n/10;
		}
		temp=n;
		int sum=0;
		while(n!=0)
		{
		int rem=n%10;
		sum += Math.pow(rem,len);
		n=n/10;
		}
		if(temp==sum)
			System.out.print("yes");
		else
			System.out.print("no");*/

}
}