For drawing  an arrow ~
#include <stdio.h>
int main() {
    int n=5;
    int k=n;
    int p=2*n-2;
    for(int i=0;i<2*n;i++){
        if(i== n-1) {
            for (int j =0;j<2*n;j++) {
                printf("* ");
            }
        } else if(i<n){
            for(int j=0;j<2*n;j++) {
               if(j==k) {
                   printf("* ");
               }else {
                   printf("  ");
               }
             
            }
            k++;
        } else  {
for(int j=0;j<2*n;j++) {
               if(j==p) {
                   printf("* ");
               }else {
                   printf("  ");
               }
             
            }
            p--;
        }
    printf("\n");
    }
    return 0;
}