import java.util.*;
import java.io.*;
class Question1 
{
    public static void main(String[] args)
    {	
        int n;
    	try{
    	    FileInputStream f1 =new FileInputStream("abc.txt");
    	    FileOutputStream f2 =new FileOutputStream("ab.txt");

    	    byte[] b = new byte[10];
            n=f1.read(b);
    	    while (n!=-1){
    	    	f2.write(b,0,n);
                n=f1.read(b);
    	    }
    	    
    	    f1.close();
    	    f2.close();
    	    System.out.println("File copied successfully!!");
    	   }
           catch(IOException ioe)
{
    		ioe.printStackTrace();
           }
    }
}