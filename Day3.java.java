import java.util.*;
public class Pattern {
   public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
   /*
*
**
***
****
*****
 
for(int i=0;i<n;i++){
    for(int j=0;j<=i;j++){
        if(i==n-1||j==0||j==i){
             System.out.print("*");
        }
        else{
             System.out.print(" ");
        }
       
    }
    System.out.println();
}*/
/*
*****
****
***
**
*
for(int i=0;i<n;i++){
    for(int j=0;j<n-i;j++){
        if(i==0||j==0||j==n-i){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
}*/
 /*
   *
   **
  ***
 ****
*****

for(int i=0;i<n;i++){
    for(int j=0;j<n-i-1;j++){
        System.out.print(" ");
    }
    for(int j=0;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
} */ 
/* 
*****
 ****
  ***
   **
    *

for(int i=n;i>=0;i--){
    for(int j=0;j<n-i;j++){
        System.out.print(" ");
    }
    for(int j=0;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
*/
/*
   *
  ***
 *****
*******
 
for(int i=n-1;i>=0;i--){
    for(int j=0;j<n-i-1;j++){
        System.out.print(" ");
    }
    for(int j=0;j<2*i+1;j++){
        if(i==n-1||j==0||j==2*i){
            System.out.print("*");
        }
        else{
                 System.out.print(" ");
        }
           
        }
       
    System.out.println();
}*/
/* 
*
  ***
 *****
*******
 *****
  ***
   *
for(int i=0;i<n;i++){
    for(int j=0;j<n-i-1;j++){
        System.out.print(" ");
    }
    for(int j=0;j<2*i+1;j++){
        System.out.print("*");
    }
    System.out.println();
}
for(int i=n-1;i>=1;i--){
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
}*/
/* 
    *
   * *
  *   *
 *     *
*********
*/
/* 
for(int i=0;i<n;i++){
    for(int j=0;j<n-i-1;j++){
        System.out.print(" ");
    }
    for(int j=0;j<2*i+1;j++){
        if(j==0||j==2*i){
            System.out.print("*");
        }
        else{
        System.out.print(" ");

        }
    }
    System.out.println();
}
for(int i=n-1;i>=1;i--){
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
          if(j==1||j==2*i-1){
            System.out.print("*");
        }
        else{
        System.out.print(" ");

        }
    }
    System.out.println();
}*/
/* 
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        if(j==1||j==i){
        System.out.print("*");

        }
        else{
                System.out.print(" ");
        }
        
    }
     for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
    }
        for(int j=1;j<=i;j++){
        if(j==1||j==i){
        System.out.print("*");

        }
        else{
            System.out.print(" ");
        }
    }
    
System.out.println();
}

for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
        if(j==1||j==i){
        System.out.print("*");

        }
        else{
                System.out.print(" ");
        }
        
    }
     for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
    }
        for(int j=1;j<=i;j++){
        if(j==1||j==i){
        System.out.print("*");

        }
        else{
            System.out.print(" ");
        }
    }
    
System.out.println();
}*/


/*for(int i=n;i>=1;i--){
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
}
for(int i=1;i<n;i++){
    for(int j=0;j<n-i-1;j++){
        System.out.print(" ");
    }
    for(int j=0;j<2*i+1;j++){
        System.out.print("*");
    }
    System.out.println();
}*/
/*
*    
 **  
  *** 
   ****
    *****

   for(int i=0;i<n;i++){
    for(int j=0;j<i;j++){
        System.out.print(" ");
    }
    for(int j=0;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
   }*/
  /*
      1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
 
  // number of rows

for (int i = 1; i <= n; i++) {

    int val = 1;   // reset for every row

    // spaces for alignment
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }

    // print values in the row
    for (int j = 1; j <= i; j++) {
        System.out.print(val + " ");
        val = val * (i - j) / j;   // correct Pascal formula
    }

    System.out.println();
}*/
/* 1
12
123
1234
12345 
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
}*/
/* 
12345
1234
123
12
1
for(int i=n;i>=1;i--){
for(int j=1;j<=i;j++){
    System.out.print(j);
}
System.out.println();
}*/
/*
1
22
333
4444
55555

for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(i+" ");
    }
    System.out.println();
}*/
/*
1
21
321
4321
54321

for(int i=1;i<=n;i++){
    for(int j=i;j>=1;j--){
        System.out.print(j);
    }
    System.out.println();
}*/
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

int num=1;
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
    System.out.print(num);
    num++;
}
System.out.println();
}*/
/* 
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4

for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        System.out.print(j);
    }
    System.out.println();
}*/
/*
   1
  121
 12321
1234321
*/
for(int i=1;i<=n;i++){
for(int j=1;j<=n-i;j++){
    System.out.print(" ");
}
for(int j=1;j<=2*i-1;j++){
    System.out.print(j);
}
System.out.println();
}


}
