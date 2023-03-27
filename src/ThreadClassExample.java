public class ThreadClassExample extends Thread {
  public void run(){
    System.out.println("running from run method   "+Thread.currentThread().getName());
  }

  public static void main(String[] args) {
    ThreadClassExample threadObj = new ThreadClassExample();
    threadObj.start();
    System.out.println(Thread.currentThread().getName());
  }
}
