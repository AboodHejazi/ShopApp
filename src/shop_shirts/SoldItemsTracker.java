package shop_shirts;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SoldItemsTracker {
   private static  SoldItemsTracker instance=new SoldItemsTracker();
   private Map<String, Integer> soldItems = new HashMap<>();
    private List<ShopObserver> observers = new ArrayList<>();
   private SoldItemsTracker(){
   soldItems.put("Small",0);
   soldItems.put("Medium",0);
   soldItems.put("Large",0);
   }
    public static  SoldItemsTracker getInstance() {
        return instance;
    }
    public void addObserver(ShopObserver observer) {
        observers.add(observer);
    }
    public  void incrementSold(String size){
    soldItems.put(size,soldItems.get(size) + 1);
    notifyObservers(size);
    }
   public  void notifyObservers(String size){
   for (ShopObserver observer : observers) {
            observer.update();
        }
   }
    public void displaySoldItems() {
        System.out.println("Sold Items Count:");
        soldItems.forEach((size, count) -> System.out.println(size + ": " + count));
    }
}
