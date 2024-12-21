package shop.tshrits;

public class ShopFactory {

    public static Order createOrder(Region clientRegion, Color tShirtColor, boolean addText, boolean addLogo) {

        if (clientRegion == null) {
            throw new ShopException("Could not process your order without client region");
        }

        IShirt tShirt;
        switch (clientRegion) {
            case CHINA:
                tShirt = new MediumTShirt();
                break;
            case MIDDLE_EAST:
                tShirt = new LargeTShirt();
                break;
            default:
                tShirt = new SmallTShirt();
                break;
        }

        if (tShirtColor != null) {
            tShirt = new ColorTShirtDecorator(tShirt, tShirtColor);
        }
        if (addLogo) {
            tShirt = new LogoTShirtDecorator(tShirt);
        }
        if (addText) {
            tShirt = new TextTShirtDecorator(tShirt);
        }

        return new Order(tShirt);
    }
}
