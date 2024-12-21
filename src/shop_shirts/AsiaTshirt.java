package shop_shirts;


class AsiaTshirt  extends T_shirt{
     public AsiaTshirt(String name, String size) {
        super(name, size);
        this.description = "Asia T-Shirt";
    }
    public void formSize(){
         System.out.println("Asia T-Shirt, Size: " + size);
    }
}
