import java.math.BigDecimal;

public class NewNetBuyingPrice {

    public static void main(String[] args) {
        BigDecimal bubp = new BigDecimal(5.76).setScale(4,BigDecimal.ROUND_UP);
        BigDecimal netBuyingPricePerPiece = new BigDecimal(4.75).setScale(4,BigDecimal.ROUND_UP);
        BigDecimal supplierDiscount = netBuyingPricePerPiece.subtract(bubp).negate();
        System.out.println(netBuyingPricePerPiece.subtract(bubp));
        System.out.println(netBuyingPricePerPiece.subtract(bubp).negate());
        BigDecimal update = new BigDecimal(6.40).setScale(4,BigDecimal.ROUND_UP);
        System.out.println(update.subtract(supplierDiscount));
        BigDecimal diff = update.subtract(bubp).divide(bubp, 5, BigDecimal.ROUND_HALF_UP);
        System.out.println(diff);

    }
}


//    private BigDecimal calculateNewNetBuyingPricePerPiece(BubpUpdate update, Article article) {
//        Optional<BigDecimal> bubp = article.attribute(PRICES, BUBP).flatMap(Attribute::bigDecimalValue);
//        Optional<BigDecimal> netBuyingPricePerPiece = article.attribute(PRICES, NET_BUYING_PRICE_PER_PIECE)
//                .flatMap(Attribute::bigDecimalValue);
//
//        if (bubp.isPresent() && netBuyingPricePerPiece.isPresent() && update.getUpdatedPrice() != null) {
//            BigDecimal supplierDiscount = netBuyingPricePerPiece.get().subtract(bubp.get()).negate();
//            return update.getUpdatedPrice().subtract(supplierDiscount);
//        }
//        return null;
//    }