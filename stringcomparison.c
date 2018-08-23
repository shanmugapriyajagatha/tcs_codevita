#include<stdio.h>

int main()
{
  // Type your code here
   unsigned char s1[50],s2[50];
  scanf("%s %s",&s1,&s2);
  int a=0,i=0;
  for(i=0;i<s1[i]!='\0';i++)
  {
    if(s1[i]==s2[i])
    {
      a=1;
    }
  else
  {
    a=0;
  }
}
  printf("%d",a);
  return 0;
}
