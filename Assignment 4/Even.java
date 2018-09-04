import java.util.Scanner;
class Even
{
public static void main(String args[])
{
int i,n;
System.out.print("Enter the number:");
Scanner s= new Scanner(System.in);
n=s.nextInt();
if(n%2==0)
{
System.out.println("Number is even");
}
else
{
System.out.println("Number is odd");
}
}
}
