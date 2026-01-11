                /*DAY 1 – CODING QUESTIONS (PLACEMENT STYLE)
                🟢 LEVEL 1 – VERY BASIC*/
import java.util.*;
class Day1{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
       /*1.Print “Hello Java"
        2.Print your name
        3.Print your name, age, city
        4.Add two numbers
        5.Subtract two numbers
        6.Multiply two numbers
        7.Divide two numbers
        8.Find remainder of two numbers
        9.Find square of a number
        10.Find cube of a number 
        */
             System.out.println("Tejasree");
            System.out.println("Tejasree"+"20"+"Madanapalle");
            int a=s.nextInt();
            int b=s.nextInt();
            System.out.println("Add"+(a+b));
            System.out.println("sub"+(a-b));
            System.out.println("mul"+(a*b));
            System.out.println("div"+(a/b));
            System.out.println("rem"+(a%b));
            System.out.println("square"+(a*2));
            System.out.println("cube"+ Math.pow(a,3)); 
           // LEVEL 2 – INPUT BASED
/* Read two numbers and print sum
Read radius and find area of circle
Convert Celsius to Fahrenheit
Convert Fahrenheit to Celsius
Find simple interest
Calculate average of 3 numbers
Find perimeter of rectangle
Swap two numbers (using temp)
Swap two numbers (without temp)
Convert minutes to seconds */
            int a1=s.nextInt();
            int b1=s.nextInt();
            System.out.print(a1+b1);
            int r=s.nextInt();
            System.out.println("radius:"+3.14*r*r);
            int cel=s.nextInt();
            int fah= cel*(9/5)+32;
            System.out.println("fah:"+fah);
            int fahren=s.nextInt();
            int celsius=(fahren-32)*5/9;
            System.out.println("cel:"+celsius);
            float princ=s.nextFloat();
            double rate=s.nextDouble();
            double time=s.nextDouble();
            System.out.println("ptr"+princ*rate*time/100);
            int c1=s.nextInt();
            System.out.println((a1+b1+c1)/3);
            int length=s.nextInt();
            int breadth=s.nextInt();
            System.out.println(length*breadth);
            System.out.println("swapping");
            int temp=a1;
            a1=b1;
            b1=temp;
            System.out.print(a1+" "+b1);
            System.out.println("swapping");
            a1=a1+b1;
            b1=a1-b1;
            a1=a1+b1;
            System.out.print(a1+" "+b1);

            int minutes=s.nextInt();
            System.out.println("secomds is"+minutes*60);
            /*
            Read marks of 5 subjects and calculate total
Calculate percentage
Find gross salary (basic + HRA + DA)
Convert days into years, months, days
Convert seconds into hours, minutes, seconds*/ 
int s1=s.nextInt();
int s2=s.nextInt();
int s3=s.nextInt();
int s4=s.nextInt();
int s5=s.nextInt();
int total=s1+s2+s3+s4+s5;
int percentage=total/500*100;
System.out.print(total+" "+percentage);
double hra=s.nextDouble();
double da=s.nextDouble();
int basic= s.nextInt();
double salary=hra+da+basic;
System.out.print(salary);
    }
}