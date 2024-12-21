package shop.tshrits;

public class LogoTShirtDecorator extends TShirtDecorator {

    public LogoTShirtDecorator(IShirt tShirt) {
        super(tShirt);
    }

    @Override
    public String toString() {
        return tShirt.toString() + ", logo:Bird";
    }
}
