
package shop_shirts;


public class Shop {

   
    public static void main(String[] args) {
        
          
           shopowner shopOwner = new shopowner(){};
        SoldItemsTracker tracker = SoldItemsTracker.getInstance();
        tracker.addObserver(shopOwner);

        TShirtFactory factory = new TShirtFactory();
        
        T_shirt ChinaTShirt = factory.createTShirt("China", "Medium");
        ChinaTShirt = new ColorDecorator(ChinaTShirt, "Blue");
        ChinaTShirt = new logoDecorater(ChinaTShirt);
        System.out.println(ChinaTShirt.getDescription());
        tracker.incrementSold("Medium");
           T_shirt middleEastTShirt = factory.createTShirt("MiddleEast", "Large");
        middleEastTShirt = new ColorDecorator(middleEastTShirt, "Red");
        middleEastTShirt = new TextDecorater(middleEastTShirt);
        System.out.println(middleEastTShirt.getDescription());
        tracker.incrementSold("Large");
         T_shirt middleEastTShirt2 = factory.createTShirt("MiddleEast", "Large");
        middleEastTShirt2 = new ColorDecorator(middleEastTShirt2, "Red");
        middleEastTShirt2 = new TextDecorater(middleEastTShirt2);
        System.out.println(middleEastTShirt2.getDescription());
        tracker.incrementSold("Large");
        System.out.println();
        tracker.displaySoldItems();
        
    }
    
}
/*CODE 1 IS package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Observer Interface
public interface ShopObserver {
    void update(String size);
}

// Abstract T-shirt class
abstract class TShirt {
    protected String name;
    protected String description;
    protected String size;

    public TShirt(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getDescription() {
        return name + " - " + description + ", Size: " + size;
    }

    public abstract void displaySize();
}

// T-shirt Variants
class AsiaTShirt extends TShirt {
    public AsiaTShirt(String name, String size) {
        super(name, size);
        this.description = "Asia T-Shirt";
    }

    public void displaySize() {
        System.out.println("Asia T-Shirt, Size: " + size);
    }
}

class ChinaTShirt extends TShirt {
    public ChinaTShirt(String name, String size) {
        super(name, size);
        this.description = "China T-Shirt";
    }

    public void displaySize() {
        System.out.println("China T-Shirt, Size: " + size);
    }
}

class MiddleEastTShirt extends TShirt {
    public MiddleEastTShirt(String name, String size) {
        super(name, size);
        this.description = "Middle East T-Shirt";
    }

    public void displaySize() {
        System.out.println("Middle East T-Shirt, Size: " + size);
    }
}

// Decorator Pattern
abstract class TShirtDecorator extends TShirt {
    protected TShirt tShirt;

    public TShirtDecorator(TShirt tShirt) {
        super(tShirt.name, tShirt.size);
        this.tShirt = tShirt;
    }

    public String getDescription() {
        return tShirt.getDescription();
    }
}

class ColorDecorator extends TShirtDecorator {
    private String color;

    public ColorDecorator(TShirt tShirt, String color) {
        super(tShirt);
        this.color = color;
    }

    public String getDescription() {
        return super.getDescription() + " + Color: " + color;
    }
}

class TextDecorator extends TShirtDecorator {
    public TextDecorator(TShirt tShirt) {
        super(tShirt);
    }

    public String getDescription() {
        return super.getDescription() + " + Text: 'Nice Day!'";
    }
}

class LogoDecorator extends TShirtDecorator {
    public LogoDecorator(TShirt tShirt) {
        super(tShirt);
    }

    public String getDescription() {
        return super.getDescription() + " + Logo: Bird";
    }
}

// Factory Pattern
class TShirtFactory {
    public TShirt createTShirt(String region, String size) {
        switch (region.toLowerCase()) {
            case "middleeast":
                return new MiddleEastTShirt("MiddleEast", size);
            case "china":
                return new ChinaTShirt("China", size);
            case "asia":
                return new AsiaTShirt("Asia", size);
            default:
                throw new IllegalArgumentException("Unknown region: " + region);
        }
    }
}

// Singleton and Observer Pattern
class SoldItemsTracker {
    private static SoldItemsTracker instance;
    private Map<String, Integer> soldItems = new HashMap<>();
    private List<ShopObserver> observers = new ArrayList<>();

    private SoldItemsTracker() {
        soldItems.put("Small", 0);
        soldItems.put("Medium", 0);
        soldItems.put("Large", 0);
    }

    public static SoldItemsTracker getInstance() {
        if (instance == null) {
            instance = new SoldItemsTracker();
        }
        return instance;
    }

    public void addObserver(ShopObserver observer) {
        observers.add(observer);
    }

    public void incrementSold(String size) {
        soldItems.put(size, soldItems.get(size) + 1);
        notifyObservers(size);
    }

    private void notifyObservers(String size) {
        for (ShopObserver observer : observers) {
            observer.update(size);
        }
    }

    public void displaySoldItems() {
        System.out.println("Sold Items Count:");
        soldItems.forEach((size, count) -> System.out.println(size + ": " + count));
    }
}

// Shop Owner (Observer Implementation)
class ShopOwner implements ShopObserver {
    @Override
    public void update(String size) {
        System.out.println("Shop Owner notified: Sold 1 T-Shirt of size " + size);
    }
}

// Main Class
public class Shop {
    public static void main(String[] args) {
        SoldItemsTracker tracker = SoldItemsTracker.getInstance();
        ShopOwner shopOwner = new ShopOwner();
        tracker.addObserver(shopOwner);

        TShirtFactory factory = new TShirtFactory();

        TShirt chinaTShirt = factory.createTShirt("China", "Medium");
        chinaTShirt = new ColorDecorator(chinaTShirt, "Blue");
        chinaTShirt = new LogoDecorator(chinaTShirt);
        System.out.println(chinaTShirt.getDescription());
        tracker.incrementSold("Medium");

        TShirt middleEastTShirt = factory.createTShirt("MiddleEast", "Large");
        middleEastTShirt = new ColorDecorator(middleEastTShirt, "Red");
        middleEastTShirt = new TextDecorator(middleEastTShirt);
        System.out.println(middleEastTShirt.getDescription());
        tracker.incrementSold("Large");

        tracker.displaySoldItems();
    }
}*/
