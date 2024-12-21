
package shop_shirts;


class ColorDecorator extends TshirtDecorater {
    private String color;

    public ColorDecorator(T_shirt tshirt, String color) {
        super(tshirt);
        this.color = color;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Color: " + color;
    }
}