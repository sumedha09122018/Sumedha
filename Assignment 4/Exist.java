import java.util.Scanner;
class Exist
{
public static void main(String args[])
{
int i,n,num,flag=1 ;
int arr[]=new int[]{1,4,6,7,8,9,10};
Scanner obj=new Scanner(System.in);
System.out.print("Enter element to found:");
num=obj.nextInt();
for(i=0;i<arr.length;i++)
{
if(arr[i]==num)
{
flag=0;
}
}
if(flag==0)
{
System.out.println("Element is found in this Array");
}
else
{
System.out.println("Element is not found in this Array");
}
}
}