import java.util.concurrent.Callable;

public class DiscountCalculator implements Callable<Double> {
    private Double discount;

    public DiscountCalculator(Double discount)
    {
        this.discount = discount;
    }

    public Double call() throws Exception{
        Thread.sleep(500);
        System.out.println("Discount");
        System.out.println(discount);
        return 20.00;
    }

}
