import java.util.*;
public class wave
{
    static void print(int [][] mat)
    {
        for (int i = 0; i < mat.length; i++)
        {

            if (i % 2 == 0)
            {
                for (int j = 0; j < mat[0].length; j++)
                    System.out.print(mat[i][j] +" ");


            }
            else
            {
                for (int j = mat[0].length - 1; j >= 0; j--)
                    System.out.print(mat[i][j] +" ");
            }
        }
    }

    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);
System.out.println("Enter row no ");
int n1  =in.nextInt();
System.out.println("Enter column no.");
int n2  =in.nextInt();
        int mat[][] = new int[n1][n2];
for(int i=0;i<n1;i++)
{
  for(int j=0;j<n2;j++)
{
   mat[i][j]=in.nextInt();

}
}

        print(mat);

    }
}