For drawing a rectangle pattern~
#include <stdio.h>
int main() {
    int n=5;
    for(int i=0;i<n;i++){
        if(i==0 || i== n-1) {
            for(int j=0;j<n+3;j++) {
                printf("* ");
            }
        } else {
            for(int j=0;j<n+3;j++) {
                if(j== 0 || j== n+2) {
                    printf("* ");
                } else {
                    printf("  ");
                }
        }
    }
    printf("\n");
    }
    return 0;
}