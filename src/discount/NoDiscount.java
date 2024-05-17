package discount;

public class NoDiscount implements DiscountType {

    @Override
    public double getDiscountMultiplier() {
        return 1;
    }
}
