package shop.tshrits;

public class LargeTShirt extends TShirt {

    public LargeTShirt() {
        super("large default t-shirt name");
    }

    @Override
    public TShirtSize getFormSize() {
        return TShirtSize.LARGE;
    }
}
