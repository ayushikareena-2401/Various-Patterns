import java.io.*;
import java.util.*;
class pattern1{
  public static void pattern18(int n) {
    for(int i=0;i<n;i++) {
     for(int j=0;j<n-i;j++) {
      System.out.print("*");
     }
     for(int j=0;j<2*i;j++) {
       System.out.print(" ");
     }
     for(int j=0;j<n-i;j++) {
      System.out.print("*");
     }
     System.out.println();
    }
    for(int i=4;i>=0;i--) {
     for(int j=0;j<n-i;j++) {
      System.out.print("*");
     }
     for(int j=0;j<2*i;j++) {
       System.out.print(" ");
     }
     for(int j=0;j<n-i;j++) {
      System.out.print("*");
     }
     System.out.println();
    }
   }
    public static void pattern19(int n) {
    for(int i=1;i<=n;i++) {
     for(int j=0;j<i;j++) {
      System.out.print("*");
     }
     for(int j=0;j<2*(n-i);j++) {
       System.out.print(" ");
     }
     for(int j=0;j<i;j++) {
      System.out.print("*");
     }
     System.out.println();
    }
    for(int i=4;i>0;i--) {
     for(int j=0;j<i;j++) {
      System.out.print("*");
     }
     for(int j=0;j<2*(n-i);j++) {
       System.out.print(" ");
     }
     for(int j=0;j<i;j++) {
      System.out.print("*");
     }
     System.out.println();
    }
   }
  
  public static void pattern20(int n) {
    for(int i=0;i<n;i++) {
      for(int j=0;j<n;j++) {
        if(i==0 || i==n-1) {
          System.out.print("*");
        } else {
         if(j==0 || j==n-1) {
          System.out.print("*");
        } else {
           System.out.print(" "); 
        }
      }
    
      }
      System.out.println();
   } 
  }
  public static void pattern21(int n) {
    for(int i=1;i<=n;i++) {
      for(int j=1;j<=i;j++) {
          System.out.print(j +" ");
        }
        System.out.println();
      }
  }
  public static void pattern22(int n) {
  int k=1;
    for(int i=0;i<n;i++) {
      for(int j=0;j<=i;j++) {
          System.out.print(k +" ");
          k=k==0?1:0;
        }
        System.out.println();
      }
  }
  public static void pattern23(int n) {
   for(int i=1;i<=n;i++) {
    if(i==1) {
     for(int j=1;j<=n-i+1;j++) {
      System.out.print(" ");
     }
     System.out.print("*");
      for(int j=1;j<=2*(n-i)+2;j++) {
      System.out.print(" ");
     }
      System.out.print("*");
     } else {
     for(int j=1;j<=n-i;j++) {
      System.out.print(" ");
     }
      System.out.print("*");
    for(int j=1;j<=(2*i)-1;j++) {
      System.out.print(" ");
    }
     System.out.print("*");
   for(int j=1;j<=2*(n-i);j++) {
     System.out.print(" ");
   }
     System.out.print("*");
   for(int j=1;j<=(2*i)-1;j++) {
      System.out.print(" ");
   }
     System.out.print("*");
   }
    System.out.println();
   }
  }
  public static void pattern24(int n) {
   for(int i=0;i<n;i++) {
    for(int j=0;j<n-i;j++) {
     System.out.print(i+1" ");
    }
         System.out.println();
   }
  }
  public static void pattern25(int n) {
   for(int i=0;i<2*n;i++) {
    for(int j=0;j<n;j++) {
     System.out.print(i+1+" ");
    }
      if(i==0 || i==n-1) {
        for(int j=0;j<n;j++) {
         System.out.print("*");
        }
     } else {
       for(int j=0;j<n;j++) {
         if(j==0 || j==n-1) {
           System.out.print("*");
         } else {
           System.out.print(" ");
        }
     }
     System.out.println();
   }
  }
  public static void pattern26(int n) {
   for(int i=0;i<n;i++) {
    for(int j=0;j<n-i;j++) {
     System.out.print(i+1" ");
    }
         System.out.println();
   }
  }
  public static void main(String[] a) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the no of rows you want to print");
   int n=sc.nextInt();
   pattern18(n);
   System.out.println();
   pattern19(n);
   System.out.println();
   pattern20(n);
   System.out.println();
   pattern21(n);
   System.out.println();
   pattern22(n);
   System.out.println();
   pattern23(n);
   System.out.println();
   pattern25(n);
   System.out.println();
   pattern26(n);
  }
}

