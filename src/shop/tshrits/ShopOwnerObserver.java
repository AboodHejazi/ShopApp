package shop.tshrits;

public class ShopOwnerObserver implements SoldTShirtObserver {

    private String ownerName;

    private Integer smallSoldShirts;
    private Integer mediumSoldShirts;
    private Integer largeSoldShirts;


    public ShopOwnerObserver(String ownerName) {

        smallSoldShirts = 0;
        mediumSoldShirts = 0;
        largeSoldShirts = 0;

        this.ownerName = ownerName;
    }

    @Override
    public void update(IShirt shirt) {

        switch (shirt.getFormSize()) {
            case SMALL -> smallSoldShirts++;
            case MEDIUM -> mediumSoldShirts++;
            case LARGE -> largeSoldShirts++;
            default -> throw new ShopException("couldn't track the t-shirt size.");
        }
    }

    public Integer getSmallSoldShirts() {
        return smallSoldShirts;
    }
    public Integer getMediumSoldShirts() {
        return mediumSoldShirts;
    }
    public Integer getLargeSoldShirts() {
        return largeSoldShirts;
    }
}
