class Mythread extends Thread{
  String msg[] ={"my","name","is","suraj"};
  Mythread(String name)
  {
    super(name);
  }
  public void run()
  {
    display(getName());
    System.out.println("Exited from "+getName());
  }
  synchronized void display(String name)
  {
    for(int i = 0 ; i < msg.length ;i++)
    {
      System.out.println(name+msg[i]);
    }
  }
}
public class Mysysnchro {
  public static void main(String[] args) {
    Mythread m1=new Mythread("Thread - 1 :");
    Mythread m2=new Mythread("Thread - 2 :");
    m1.start();
    m2.start();
    System.out.println("Main Thread exited ");
  }
}
