package discount;

public class SeventyFivePercentDiscount implements DiscountType {
    @Override
    public double getDiscountMultiplier() {
        return 0.25;
    }
}
