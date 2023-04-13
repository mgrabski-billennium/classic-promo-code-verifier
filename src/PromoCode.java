public class PromoCode {

    private String promoCode;

    private Integer discountAmount;

    public PromoCode(String promoCode, Integer discountAmount) {
        this.promoCode = promoCode;
        this.discountAmount = discountAmount;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }
}
