#include<stdio.h>
 int main()
{
   int n,a= 0,b= 1,next,i;
 
   printf("Enter the number of terms\n");
   scanf("%d",&n);
 
   printf("First %d terms of Fibonacci series are :-\n",n);
 
   for (i=0;i<n;i++)
   {
      if (i<=1)
         next=i;
      else
      {
         next=a+b;
         a=b;
         b=next;
      }
      printf("%d\n",next);
   }
  return 0;
}