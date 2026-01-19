import java.util.*;
public class Day2 {
  public static void main(String[] args){
   
/*1️⃣ Even or Odd
Input:
7
Output:
Odd
-----------------------------------answer-------------------
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n%2==0){
    System.out.print("even");
}
else{
    System.out.print("odd");
}*/


 /*
2️⃣ Positive, Negative or Zero
Input:
-12
Output:
Negative number*/
//-----------------------------------answer-------------------
/*Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n>0){
    System.out.print("positive number");
}
else if(n<0){
    System.out.print("negative number");
}
else{
    System.out.print("Zero");
}*/


/*3️⃣ Largest of Two Numbers
Input:
10 20
Output:
20 is the largest */
//-----------------------------------answer-------------------
/*Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
if(a>=b){
    System.out.print(a);
}
else{
    System.out.print(b);
}*/

/*4️⃣ Largest of Three Numbers
Input:
5 15 10
Output:
15 is the largest*/
  //-----------------------------------answer-------------------
  /*Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a>=b && a>=c){
    System.out.print(a);
}
else  if(b>=a && b>=c){
    System.out.print(b);
}
else{
    System.out.print(c);
}*/
                                                        // 🔹 Level 2 – Mathematical Logic
/*5️⃣ Leap Year
Input:
2024
Output:
Leap Year*/
//-----------------------------------answer-------------------
/*Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n%4==0){
    if(n%400==0 || n%100!=0){
        System.out.print("leap year");
    }
    else{
         System.out.print("not leap year");
    }
}
else{
 System.out.print("not leap year");
}*/


/*6️⃣ Divisible by 5 and 11
Input:
55
Output:
Divisible by both 5 and 11*/
//-----------------------------------answer-------------------
 /**Scanner s= new Scanner(System.in);
int n=s.nextInt();
if(n%5==0 && n%11==0){
    System.out.print("both");
}
else{
    System.out.print("not divisible both");
}*/


/*7️⃣ Valid Triangle
Input:
3 4 5
Output:
Valid triangle*/
//-----------------------------------answer-------------------
/*Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a+b>c && a+c>b && b+c>a){
    System.out.print("valid triangle");
}
else{
    System.out.print(" not valid triangle");
}*/


/*8️⃣ Triangle Type
Input:
5 5 5
Output:
Equilateral triangle*/
//-----------------------------------answer-------------------
/*Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a ==b && b==c && c==a){
    System.out.print("equlateral ");
}
else if(a==b && a==c && b!=c){
     System.out.print("issossless ");
}*/

/*🔹 Level 3 – Switch Case Problems
9️⃣ Menu-Driven Calculator
Input:
Enter choice: 1
Enter two numbers: 10 5

Output:
Addition = 15 */
//-----------------------------------answer-------------------

/*Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int choice=s.nextInt();
switch(choice){
        case 1:
            System.out.print("addition"+(a+b));
            break;
        case 2:
            System.out.print("sub"+(a-b));
            break;
        case 3:
            System.out.print("mul"+(a*b));
            break;
        case 4:
            System.out.print("div"+(a/b));
            break;
        case 5:
            System.out.print("mod"+(a%b));
            break;
        default:
            System.out.print("enter valid choice");
            break;
}*/

/*🔟 Day Number to Day Name
Input:
3
Output:
Wednesday*/
//----------------------------------answer-------------------

/*Scanner s=new Scanner(System.in);
int choice=s.nextInt();
switch(choice){
        case 1:
            System.out.print("Monday");
            break;
        case 2:
            System.out.print("tuesday");
            break;
        case 3:
            System.out.print("wednesday");
            break;
        case 4:
            System.out.print("thrusday");
            break;
        case 5:
            System.out.print("friday");
            break;
         case 6:
            System.out.print("saturday");
            break;
         case 7:
            System.out.print("sunday");
            break;
        default:
            System.out.print("enter valid choice");
            break;
}*/

/*1️⃣1️⃣ Month Days
Input:
2
Output:
28 or 29 days*/

//----------------------------------answer-------------------

/*Scanner s=new Scanner(System.in);
int choice=s.nextInt();
switch(choice){
        case 1:
            System.out.print("31 days-jan");
            break;
        case 2:
            System.out.print("28 or 29 days-feb-");
            break;
        case 3:
            System.out.print("31 days-march");
            break;
        case 4:
            System.out.print("30 days -april");
            break;
        case 5:
            System.out.print("31 days -may");
            break;
         case 6:
            System.out.print("30 days -june");
            break;
         case 7:
            System.out.print("31 days - july");
            break;
         case 8:
            System.out.print("30 days - august " ); 
            break;
         case 9:
            System.out.print("31 days - september");
            break;
         case 10:
            System.out.print("30 days - october");
            break;
         case 11:
            System.out.print("31 days - november");
            break;
         case 12:
            System.out.print("30 days -december");
            break;
        default:
            System.out.print("not vallid month");
            break;
  }  */
  }
}