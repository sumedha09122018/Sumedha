import java.util.Scanner;
class code3
{
int[ ] arr=new int[10];
public void test()
{
System.out.println("enter array elements:");
Scanner S=new Scanner(System.in);
for(int i=0;i<10;i++)
{
  arr[i]=S.nextInt();
}
int max=arr[0];
int s_max=arr[0];
for(int i=0;i<10;i++)
{
  if(arr[i]>max)
{
s_max=max;
max=arr[i];
}
else if(arr[i]>s_max)
{
s_max=arr[i];
}
}
System.out.println("second largest element in array is:"+s_max);
}
}
class mainclass
{
public static void main(String[ ] args)
{
code3 c=new code3();
c.test();
}
}