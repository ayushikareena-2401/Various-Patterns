For drawing a house~
#include <stdio.h>
int main() {
    int n=5;
    for(int i=0;i<=2*n;i++){
        if(i== n || i == 2*n) {
            for (int j =0;j<=2*n;j++) {
                printf("* ");
            }
        } else if(i>n){
            for(int j=0;j<=2*n;j++) {
               if(j==0 || j== 2*n) {
                   printf("* ");
               }else {
                   printf("  ");
               }
             
            }
        } else  {
           for(int j=0;j<=2*n-1;j++) {
               if(i==0) {
                   
                for(int j=0;j<n-1;j++) {
                printf("  ");
                }
                   printf("  * ");
                   break;
               }else {
                   if(j==i+n || j== n-i) {
                       printf("* ");
                   } else {
                       printf("  ");
                   }
               }
             
            }
         
        }
    printf("\n");
    }
    return 0;
}