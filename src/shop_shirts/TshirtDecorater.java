package shop_shirts;


public abstract class TshirtDecorater extends T_shirt  {
    protected T_shirt tshirt;
    public TshirtDecorater(T_shirt tshirt){
    super(tshirt.name, tshirt.size);
        this.tshirt = tshirt;
    }
     public String getDescription() {
        return tshirt.getDescription();
    }
     public  void formSize(){
         tshirt.formSize();
     }
}
