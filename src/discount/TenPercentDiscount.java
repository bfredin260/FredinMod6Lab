package discount;

public class TenPercentDiscount implements DiscountType{
    @Override
    public double getDiscountMultiplier() {
        return 0.9;
    }
}
