package Model;

public class EbookDiscount extends Discount{
    private double procent;

    public EbookDiscount(String description, int procentDiscount, int fixedDiscount, int minimumAmount, DiscountType discountType, double procent) {
        super(description, procentDiscount, fixedDiscount, minimumAmount, discountType);
        this.procent = procent;
    }
}
