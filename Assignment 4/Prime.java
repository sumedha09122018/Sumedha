import java.util.Scanner;
class Prime
{
public static void main (String[] args)
{		
Scanner scanner = new Scanner(System.in);
int i=0;
int num=0;
String  PrimeNumbers="";
System.out.print("Enter the value of n:");
int n=scanner.nextInt();
scanner.close();
for (i=1;i<=n;i++)  	   
{ 		 		  
int counter=0; 		  
for(num =i;num>=1;num--)
{
if(i%num==0)
{
counter=counter+1;
}
}
if (counter==2)
{	    
PrimeNumbers=PrimeNumbers +i+ " ";
}	
}	
System.out.print("Prime numbers are: "); 
System.out.println(PrimeNumbers);

   }
}