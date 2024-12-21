package shop.tshrits;

public class ColorTShirtDecorator extends TShirtDecorator {

    private Color tShirtColor;

    public ColorTShirtDecorator(IShirt tShirt, Color tShirtColor) {
        super(tShirt);
        this.tShirtColor = tShirtColor;
    }

    @Override
    public String toString() {
        return tShirt.toString() + ", color:" + tShirtColor;
    }
}
