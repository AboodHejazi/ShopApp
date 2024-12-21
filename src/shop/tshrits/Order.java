package shop.tshrits;

public class Order {

    private IShirt tShirt;


    public Order(IShirt tShirt) {
        this.tShirt = tShirt;
    }

    public IShirt getTShirt() {
        return tShirt;
    }
}
