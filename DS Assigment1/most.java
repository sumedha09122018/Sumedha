import java.util.*;

public class most
{

       public static int mostFrequent(int arr[], int n)
    {

        Arrays.sort(arr);

        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }


       if (curr_count > max_count)
        {
            max_count = curr_count;
            res = arr[n - 1];
        }

        return res;
    }


    public static void main (String[] args) {
          Scanner in = new Scanner(System.in);
int a = in.nextInt() ;
        int arr[] = new int[a];
  for(int i = 0;i<a;i++)
{
arr[i]=in.nextInt();
}
        int n = arr.length;

        System.out.println(mostFrequent(arr,n));

    }

}