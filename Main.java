import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        System.out.println("Hello world!");
        System.out.println("Thread name:"+Thread.currentThread().getName());

/*
        ApplyThrea o = new ApplyThrea();
        Thread t2= new Thread(o);
//        t1.run(); it will run the thread in same thread if you are using run method
//       t1.start(); for this method it will start new thread and will start run method.
//        for ApplyThrea


        t2.start();}

*/


/*
        NumberPrinter
        Executor executor = Executors.newFixedThreadPool(10);
         Executor gives access to thread pool
        for(int i=0;i<100;i++)
        {

            NumberPrinter np= new NumberPrinter(i);
            executor.execute(np);
        }
        }
*/

       /*
        MRPCalculator MRP = new MRPCalculator(10);
        DiscountCalculator Dis = new DiscountCalculator(20.00);

        // Executor Service has multiple methods to execute which should be used when callable is used.
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> futureMrp = executor.submit(MRP);
        Future<Double> futureDis = executor.submit(Dis);

        int mrp = futureMrp.get();
        double Discount = futureDis.get();

        double finalPrice = mrp -(mrp*Discount/100);
        System.out.print(finalPrice);
*/

        /* Using Mutex Lock and Unlock one of the solution for synchronization problem
        Count c = new Count(0);
        ReentrantLock Mutex= new ReentrantLock();



        Adder A= new Adder(c,Mutex);
        Subtractor s = new Subtractor(c,Mutex);

        Thread AdderTh = new Thread(A);
        Thread SubTh = new Thread(s);

        AdderTh.start();
        SubTh.start();

        AdderTh.join();
        SubTh.join();

        // Join makes your current thread wait until the thread at which join is called isn't completed
        //and killed
        System.out.println("Final Value is: "+c.getVariable());

         */

/* This for Synchronized block
        Count c = new Count(0);

        Adder A= new Adder(c);
        Subtractor s = new Subtractor(c);

        Thread AdderTh = new Thread(A);
        Thread SubTh = new Thread(s);

        AdderTh.start();
        SubTh.start();

        AdderTh.join();
        SubTh.join();

        // Join makes your current thread wait until the thread at which join is called isn't completed
        //and killed
        System.out.println("Final Value is: "+c.getVariable());

 */
    }}
