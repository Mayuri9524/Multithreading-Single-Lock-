import java.util.concurrent.Callable;

//Callable
public class MRPCalculator implements Callable<Integer> {
    private int productId;

    public MRPCalculator(int id)
    {
        this.productId=id;
    }

    public Integer call() throws Exception{
        //call doesn't accept input but return output
        Thread.sleep(500);
        System.out.println("productId");
        System.out.println(productId);
        return 100;
    }
}
