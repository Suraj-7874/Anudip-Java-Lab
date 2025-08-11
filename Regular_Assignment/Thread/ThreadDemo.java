public class ThreadDemo {
  public static void main(String args[])
  {
    Thread t=Thread.currentThread();
    System.out.println("Current thread name is :- "+t);
    t.setName("New One");
    System.out.println("After change thread name is :- "+ t);
    t.setPriority(3);
    System.out.println(t.getPriority());
    try {
      for(int i = 0 ; i < 50 ; i++)
      {
        System.out.println(i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
    System.out.println(e.getMessage());
    }
  }
}
