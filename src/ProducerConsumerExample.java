import java.util.LinkedList;

public class ProducerConsumerExample {
    public static void main(String[] args) throws InterruptedException {
        ProdConsume pc = new ProdConsume();
        Thread prodThread  =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumerThread  =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        prodThread.start();
        consumerThread.start();
        prodThread.join();
        consumerThread.join();
    }
}
class ProdConsume{
    LinkedList<Integer> list = new LinkedList<Integer>();
    int capacity = 2;
   void produce() throws InterruptedException{
       int value = 0;
       while(true){
           synchronized (this) {
               while(list.size() == capacity){
                   wait();
               }
               System.out.println("produce value - " + value);
               list.add(value++);
               notify();
               Thread.sleep(1000);
           }
       }

   }

   void consume() throws InterruptedException {
       while(true){
           synchronized (this) {
               while(list.size() == 0){
                   wait();
               }
               int val = list.removeFirst();
               System.out.println("Consume value - " + val);
               notify();
               Thread.sleep(1000);
           }
       }
   }
}