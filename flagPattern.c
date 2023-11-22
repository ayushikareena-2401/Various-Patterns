For drawing a flag~
#include <stdio.h>
int main() {
    int n=5;
    for(int i=0;i<2*n;i++){
        if(i== n || i == 0) {
            for (int j =0;j<2*n;j++) {
                printf("* ");
            }
        } else if(i<n){
            for(int j=0;j<2*n;j++) {
               if(j==0 || j== 2*n-1) {
                   printf("* ");
               }else {
                   printf("  ");
               }
             
            }
        } else  {
           for(int j=0;j<2*n;j++) {
               if(j==0) {
                   printf("* ");
              
               }else {
                   printf("  ");
               }
             
            }
         
        }
    printf("\n");
    }
    return 0;
}