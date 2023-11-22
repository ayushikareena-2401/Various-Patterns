import java.io.*;
import java.util.*;
class patterns{
 public static void pattern15(int n) {
   for(int i=0;i<2*n-1;i++) {
     if(i==0 || i==2*n-2) {
       for(int j=0;j<2*n-1;j++) {
         if(j==n) {
           System.out.print("*");
         }else {
           System.out.print(" ");
         }
       }
     }
     else if(i==n-1) {
        for(int j=0;j<2*n-1;j++) {
         if(j==0 ) {
           System.out.print("*");
        } else if(j==2*n-2) {
           System.out.print(" *");
        }else {
           System.out.print(" ");
        }
     }
   } else if(i<n) {
     for(int j=0;j<2*n-1;j++) {
         if(j==n-i-1 ||j==n+i) {
           System.out.print("*");
          } else {
            System.out.print(" ");
         }
        }
     } else {
        for(int j=0;j<2*n-1;j++){
           if(j==i-n+1 || j==2*n-i+3) {
                 System.out.print("*");
          } else {
            System.out.print(" ");
         }
       }
     }
  System.out.println();
}
}
public static void pattern16(int n) {
 for(int i=0;i<n;i++) {
  for(int j=0;j<n-i;j++) {
   System.out.print(" ");
  }
  for(int j=0;j<=i;j++) {
  System.out.print("1 ");
  }
  System.out.println();
 }
}
public static void pattern17(int n) {
    int j;
 for(int i=0;i<n;i++) {
   for(j=0;j<n-i;j++) {
     System.out.print(" ");
   }
   for (j = i; j >= 1; j--) { 
        System.out.print(j + " "); 
    } 
        for (j = 2; j <= i; j++) { 
            System.out.print(j + " "); 
        }
            System.out.println(); 
        } 
    }
 public static void main(String[] a) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the no of rows you want to print");
   int n=sc.nextInt();
   pattern15(n);
   pattern16(n);
   pattern17(n);
 }
}