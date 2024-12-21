package shop.tshrits;

public class SmallTShirt extends TShirt {

    public SmallTShirt() {
        super("small default t-shirt name");
    }

    @Override
    public TShirtSize getFormSize() {
        return TShirtSize.SMALL;
    }
}
