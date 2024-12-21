package shop_shirts;


public  class TextDecorater extends TshirtDecorater {
   
    public TextDecorater(T_shirt tshirt) {
        super(tshirt);
    }
    public String getDescription() {
        return tshirt.getDescription()+"Text: 'Nice Day!";
    }
}
