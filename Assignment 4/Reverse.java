import java.util.Scanner;
class Reverse 
{
public static void main(String[] args) 
{
int num,rev=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter number:");
num=s.nextInt();
while(num!=0)
{
int digit=num%10;
rev=rev*10+digit;
num/=10;
}
System.out.println("Reverse of a number is: " + rev);
}
}