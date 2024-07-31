public class ApplyThrea implements Runnable{
    public void run()
    {
        System.out.println("Hello world!");
        System.out.println("Thread name:"+Thread.currentThread().getName());

    }
}
