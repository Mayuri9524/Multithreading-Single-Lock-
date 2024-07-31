import java.util.concurrent.locks.ReentrantLock;

public class Subtractor implements Runnable{

    /*private Count count;
    private ReentrantLock Mutex;

    public Subtractor(Count count,ReentrantLock Mutex)
    {
        this.count=count;
        this.Mutex=Mutex;
    }

    public void run()
    {
        System.out.println("Inside Subtractor's run Method");
        Mutex.lock();
        for(int i=0;i<1000;i++)
        {
            count.setVariable(count.getVariable()-1);
        }
        Mutex.unlock();

     */

    /* Synchronized Block
    private Count count;
    public Subtractor(Count count)
    {
        this.count=count;

    }

    public void run()
    {
        System.out.println("Inside Subtractor's run Method");
       synchronized (Count.class){
        for(int i=0;i<1000;i++)
        {
            count.setVariable(count.getVariable()-1);
        }}

     */

    }
}
