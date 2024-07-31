import java.util.concurrent.locks.ReentrantLock;

public class Adder implements Runnable{
    /*
    private Count count;
    private ReentrantLock Mutex;

    public Adder(Count count,ReentrantLock Mutex)
    {
        this.count=count;
        this.Mutex= Mutex;
    }

    public void run()
    {
        System.out.println("Inside Adder's run Method");
        // Critical Section
        Mutex.lock();
        for(int i=0;i<1000;i++)
        {
            count.setVariable(count.getVariable()+1);
        }
        Mutex.unlock();
        // Critical Section ends

     */

     //Synchronized block
    private Count count;
    public Adder(Count count)
    {
        this.count=count;

    }
    public void run()
    {
        System.out.println("Inside Adder's run Method");
        // Critical Section
        synchronized (Count.class){
        for(int i=0;i<1000;i++)
        {
            count.setVariable(count.getVariable()+1);
        }}


    }
}
