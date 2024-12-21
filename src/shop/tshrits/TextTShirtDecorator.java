package shop.tshrits;

public class TextTShirtDecorator extends TShirtDecorator {

    public TextTShirtDecorator(IShirt tShirt) {
        super(tShirt);
    }

    @Override
    public String toString() {
        return tShirt.toString() + ", text:'Nice Day!'";
    }
}
