public class NumberPrinter implements Runnable {
    private int x;

    public NumberPrinter(int Number){
        this.x=Number;
    }
    @Override
    public void run(){

        System.out.println("Number : "+x+" Print Thread:"+Thread.currentThread().getName());
    }
}
