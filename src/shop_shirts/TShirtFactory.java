package shop_shirts;


public class TShirtFactory {
   public T_shirt createTShirt(String region, String size) {
        switch (region.toLowerCase()) {
            case "middleeast":
                return new MiddleEastTshirt("MiddleEast", size);
            case "china":
                return new ChinaTshirt("China", size);
            case "asia":
                return new AsiaTshirt("Asia", size);
            default:
                throw new IllegalArgumentException("Unknown region: " + region);
        }
    }
}

