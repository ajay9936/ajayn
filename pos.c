#include<stdio.h>
int main()
{
double number;
scanf("%lf",&number);
 if(number>0)
   printf("\nThe number %lf is a positive number.",number);
else if(number<0)
   printf("\nThe number %lf is a negative number.",number);
else
   printf("\nThe entered number %lf is neither a positive number nor negative number.",number);
return 0;
}