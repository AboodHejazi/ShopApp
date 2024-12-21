package shop.tshrits;

public class TShirtDecorator implements IShirt {

    protected IShirt tShirt;

    public TShirtDecorator(IShirt tShirt) {
        this.tShirt = tShirt;
    }

    @Override
    public TShirtSize getFormSize() {
        return tShirt.getFormSize();
    }
}
