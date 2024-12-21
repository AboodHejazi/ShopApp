package shop.tshrits;

public class MediumTShirt extends TShirt {

    public MediumTShirt() {
        super("medium default t-shirt name");
    }

    public TShirtSize getFormSize() {
        return TShirtSize.MEDIUM;
    }

}
