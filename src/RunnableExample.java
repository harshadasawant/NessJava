public class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Calling from run method..." + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        RunnableExample obj = new RunnableExample();
        Thread t = new Thread(obj);
        t.start();
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(new RunnableExample());
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Calling from runnable anonymous class  " + Thread.currentThread().getName());
            }
        });
        t2.start();
        Thread t3 = new Thread(() -> {
            System.out.println("Calling from lambda class  " + Thread.currentThread().getName());
        });
        t3.start();


    }
}
