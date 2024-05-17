package discount;

public class FiftyPercentDiscount implements DiscountType{

    @Override
    public double getDiscountMultiplier() {
        return 0.5;
    }
}
