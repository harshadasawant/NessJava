public class ThreadClassExample extends Thread {
  ThreadClassExample(){

  }
  ThreadClassExample(String name){
    super(name);
  }
  public void run(){
    System.out.println("running from run method   "+Thread.currentThread().getName());
  }

  public static void main(String[] args) {
    ThreadClassExample threadObj = new ThreadClassExample("My Thread");
    threadObj.start();
    System.out.println(Thread.currentThread().getName());
  }
}
