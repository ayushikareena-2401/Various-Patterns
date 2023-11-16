import java.util.*;
class pattern {
 public static void pattern1(int n) {
   for(int i=0;i<n;i++) {
     for(int j=0;j<n;j++) {
      System.out.print("*");
     }
     System.out.println();
   }
 }
 public static void pattern2(int n) {
   for(int i=0;i<n;i++) {
      for(int j=0;j<=i;j++) {
       System.out.print("*");
      }
    System.out.println();
  }
 }
 public static void pattern3 (int n) {
   for(int i=0;i<n;i++) {
      for(int j=1;j<=n-i;j++) {
       System.out.print("*");
      }
    System.out.println();
  }
 }
 public static void pattern4(int n) {
   for(int i=1;i<=n;i++) {
      for(int j=1;j<=i;j++) {
       System.out.print(j+" ");
      }
    System.out.println();
  }
 }
 public static void pattern5(int n) {
   for(int i=1;i<=2*n-1;i++) {
     int c=i>n?2*n-i:i;
      for(int j=0;j<c;j++) {
       System.out.print("*");
      }
    System.out.println();
  }
 }
 public static void pattern6(int n) {
   for(int i=1;i<=n;i++) {
      for(int j=0;j<n;j++) {
       if(j<n-i) {
          System.out.print(" ");
       } else {
          System.out.print("*");
       }
     }
    System.out.println();
  }
 }
 public static void pattern7(int n) {
   for(int i=1;i<=n;i++) {
      for(int j=1;j<=n;j++) {
       if(j<i) {
          System.out.print(" ");
       } else {
          System.out.print("*");
       }
      }
    System.out.println();
  }
 }
 public static void pattern8(int n) {
   for(int i=1;i<=n;i++) {
      for(int j=1;j<=n-i;j++) {
       System.out.print(" ");
      }
      for(int k=0;k<2*i-1;k++) {
       System.out.print("*");
      }
    System.out.println();
  }
 }
  public static void pattern9(int n) {
   for(int i=0;i<n;i++) {
      for(int j=1;j<=i;j++) {
       System.out.print(" ");
      }
      for(int k=0;k<2*(n-i)-1;k++) {
       System.out.print("*");
      }
    System.out.println();
  }
 }
  public static void pattern10(int n) {
   for(int i=1;i<=n;i++) {
      int p=n-i;
      for(int j=1;j<=p;j++) {
       System.out.print(" ");
      }
      for(int k=0;k<i;k++) {
       System.out.print("* ");
      }
    System.out.println();
  }
 }
 public static void pattern11(int n) {
   for(int i=0;i<n;i++) {
      int p=i;
      for(int j=1;j<=p;j++) {
       System.out.print(" ");
      }
      for(int k=0;k<n-i;k++) {
       System.out.print("* ");
      }
    System.out.println();
  }
 }
 public static void pattern12(int n) {
   for(int i=0;i<=2*n;i++) {
     int t,p;
      p=i>n?2*n-i:i;
      for(int j=0;j<p;j++) {
       System.out.print(" ");
      }
      t=i>n?i-n:n-i;
      for(int k=0;k<t;k++) {
        System.out.print("* ");
      }
    System.out.println();
  }
 }
 public static void pattern13(int n) {
   for(int i=1;i<=n;i++) {
     if(i==1) {
       for(int j=1;j<=n;j++) {
         if(j==n) {
            System.out.print("*");
         } else {
            System.out.print(" ");
         }
       }
     } else if(i==n) {
       for(int j=1;j<=2*n-1;j++) {
          System.out.print("*");
       }
     } else {
        for(int j=1;j<=2*n-1;j++){
           if(j==n-i || j== n+i){
               System.out.print("*");
          } else {
            System.out.print(" ");
         }
       }
     }
    System.out.println();
  }
 }
 public static void pattern14(int n) {
   for(int i=1;i<=n;i++) {
     if(i==n) {
       for(int j=1;j<=n;j++) {
         if(j==n) {
            System.out.print("*");
         } else {
            System.out.print(" ");
         }
       }
     } else if(i==1) {
       for(int j=1;j<=2*n-1;j++) {
          System.out.print("*");
       }
     } else {
        for(int j=1;j<=2*n-1;j++){
           if(j==i || j== 2*n-i) {
                 System.out.print("*");
          } else {
            System.out.print(" ");
         }
       }
     }
    System.out.println();
  }
 }
public static void main(String [] a) {
System.out.println("Enter the number of rows you want in the pattern.");
   Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
   pattern1(n);
   pattern2(n);
   pattern3(n);
   pattern4(n);
   pattern5(n);
   pattern6(n);
   pattern7(n);
   pattern8(n);
   pattern9(n);
   pattern10(n);
   pattern11(n);
   pattern12(n);
   pattern13(n);
   pattern14(n);
}
}