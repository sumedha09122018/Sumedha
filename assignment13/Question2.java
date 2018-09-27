import java.util.*;
class Question2 {
  public static void main(String args[]) {
  HashMap<Integer,String> H1= new HashMap<Integer,String>();
  H1.put(1, "C");
  H1.put(2, "C++");
  H1.put(3, "JAVA");
  H1.put(4, "Python");
  H1.put(5, "JAVASCRIPT");

   for(Map.Entry x:H1.entrySet()){
   System.out.println(x.getKey()+" "+x.getValue());
}
}
}