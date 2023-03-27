public class RunnableExample implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+ "   "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RunnableExample obj = new RunnableExample();
        Thread t = new Thread(obj, "My Thread");
//        t.setPriority(10);
        t.start();
        t.join();

        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(new RunnableExample());
        t1.start();
        Thread t2 = new Thread(new RunnableExample());
        t2.start();
        Thread t3 = new Thread(new RunnableExample());
        t3.start();

//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Calling from runnable anonymous class  " + Thread.currentThread().getName());
//            }
//        });
//        t2.start();
//        Thread t3 = new Thread(() -> {
//            System.out.println("Calling from lambda class  " + Thread.currentThread().getName());
//        });
//        t3.start();


    }
}
