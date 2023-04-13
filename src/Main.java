import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<PromoCode> AVAILABLE_PROMO_CODES = List.of(
        new PromoCode("SUMMER2023", 25),
        new PromoCode("SALE20", 20)
    );

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the promo code you want to validate:");
        String promoCode = input.nextLine();
        validatePromoCode(promoCode);
    }

    private static void validatePromoCode(String promoCode){
        AVAILABLE_PROMO_CODES.stream()
            .filter(availableCode -> availableCode.getPromoCode().equals(promoCode))
            .findFirst()
            .ifPresentOrElse(
                matchingCode -> System.out.println("Promo code " + matchingCode.getPromoCode() + " is valid for "
                                                       + matchingCode.getDiscountAmount() + " PLN discount"),
                () -> System.out.println("Promo code " + promoCode + " is not valid.")
            );
    }

}