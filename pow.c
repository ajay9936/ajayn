#include<stdio.h>
#include<math.h>

int main()
{
 double base,exponent,result;
  printf("\nAnswer for entered base and exponent is: ");
    scanf("%lf",&base);
    scanf("%lf",&exponent);

  result=pow(base,exponent);
  printf("%.lf^%.lf=%.2lf",base,exponent,result);
}
