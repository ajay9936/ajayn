#include<stdio.h>
#include<math.h>

int main()
{
 double base,exponent,result;
    scanf("%lf",&base);
    scanf("%lf",&exponent);
       printf("\nAnswer for entered base and exponent is: ");

  result=pow(base,exponent);
  printf("%.lf^%.lf=%.2lf",base,exponent,result);
}
