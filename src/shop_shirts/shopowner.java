package shop_shirts;


public abstract class shopowner implements ShopObserver {
    public void update(){
     System.out.println("Shop Owner notified: Sold 1 T-Shirt of size ");
    }
}
