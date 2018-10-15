class MyThread extends Thread
{
  private int start=0;
  private int end=0;
  MyThread(int start,int end)
  {
    this.start=start;
    this.end=end;
  }
  public void run()
  {
    count();
  }
  public synchronized void count()
  {
    for (int i=start;i<end;i++)
    {
      System.out.println(i);
    }
  }
}

class Threads
{
  public static void main(String[] args)throws InterruptedException
  {
    MyThread t1 = new MyThread (0,500);
    t1.start();
    t1.sleep(10);
    MyThread t2=new MyThread (500,1000);
    t2.start();
  }
}