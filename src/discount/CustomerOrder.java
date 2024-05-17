package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private final DiscountType discountType;

    public CustomerOrder(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = switch (discountType) {
            case 'S', 's' -> new TenPercentDiscount();
            case 'D', 'd' -> new FiftyPercentDiscount();
            case 'L', 'l' -> new SeventyFivePercentDiscount();
            default -> new NoDiscount();
        };
    }

    public double getBillAmount() {
        return this.billAmount * discountType.getDiscountMultiplier();
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountType
                + '}';
    }
}
