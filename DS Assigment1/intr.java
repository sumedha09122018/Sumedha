import java.util.*;
public class intr
{

    static void printIntersection(int arr1[], int arr2[], int m, int n)
    {
      int i = 0, j = 0;
      while (i < m && j < n)
      {
        if (arr1[i] < arr2[j])
          i++;
        else if (arr2[j] < arr1[i])
          j++;
        else
        {
          System.out.print(arr2[j++]+" ");
          i++;
        }
      }
    }

    public static void main(String args[])
    {
     Scanner in =new Scanner(System.in);
int a1,a2;
a1= in.nextInt();
a2= in.nextInt();
        int arr1[] = new int[a1];
        int arr2[] = new int[a2];
     for(int i=0;i<a1;i++)
  {
     arr1[i]=in.nextInt();
}
 for(int j=0;j<a2;j++)
  {
     arr2[j]=in.nextInt();
}
   int m = arr1.length;
        int n = arr2.length;
        printIntersection(arr1, arr2, m, n);
    }
}