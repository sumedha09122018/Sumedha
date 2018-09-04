import java.util.Scanner;
class code3
{
int[ ] arr=new int[10];
public void test()
{
int i,temp,n=10;
System.out.print("Enter array elements:");
Scanner S=new Scanner(System.in);
for(i=0;i<10;i++)
{
  arr[i]=S.nextInt();
}
for(i=0;i<n;i+=2)
   {
     temp=arr[i];
     arr[i]=arr[i+1];
     arr[i+1]=temp; 
   } 
System.out.print("\nWaveForm Sorted Array : ");
 for (i=0; i<n; i++)
      System.out.print(+arr[i]+" ");
}
}
class Sort
{
public static void main(String[ ] args)
{
code3 c=new code3();
c.test();
}
}