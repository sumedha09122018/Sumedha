import java.util.*;
class fiborec
{
 int fib(int n)
 {
  if(n==0)
  {
   return 0;
  }
  else if(n==1)
  {
    return 1;
  }
  else
  {
    return fib(n-1)+fib(n-2);
  }
 }
}

public class recfib
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int a;
   System.out.println("Enter the position");
   a=in.nextInt();
   fiborec f = new fiborec();
   int i=f.fib(a);
   System.out.println("The number is");

   System.out.println(i);
  }
}