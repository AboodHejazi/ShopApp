package shop_shirts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abood
 */
public class RedDecorater extends TshirtDecorater {

    private String color;

    public RedDecorater(T_shirt tshirt, String color) {
        super(tshirt);
        this.color = color;
    }
      public String getDescription() {
        return super.getDescription()+"color:"+this.color;
    }
}
/*// Base TShirt Class
abstract class TShirt {
    protected String name;
    protected String description;
    protected String size;

    public TShirt(String name, String size) {
        this.name = name;
        this.size = size;
        this.description = "Basic T-Shirt";
    }

    public String getDescription() {
        return name + " - " + description + ", Size: " + size;
    }

    public abstract void formSize(); // To indicate type-specific form
}

// Regional TShirt Subclasses
class MiddleEastTShirt extends TShirt {
    public MiddleEastTShirt(String name, String size) {
        super(name, size);
        this.description = "Middle East T-Shirt";
    }

    @Override
    public void formSize() {
        System.out.println("Middle East T-Shirt, Size: " + size);
    }
}

class ChinaTShirt extends TShirt {
    public ChinaTShirt(String name, String size) {
        super(name, size);
        this.description = "China T-Shirt";
    }

    @Override
    public void formSize() {
        System.out.println("China T-Shirt, Size: " + size);
    }
}

class AsiaTShirt extends TShirt {
    public AsiaTShirt(String name, String size) {
        super(name, size);
        this.description = "Asia T-Shirt";
    }

    @Override
    public void formSize() {
        System.out.println("Asia T-Shirt, Size: " + size);
    }
}

// Factory Class for Creating T-Shirts
class TShirtFactory {
    public TShirt createTShirt(String region, String size) {
        switch (region.toLowerCase()) {
            case "middleeast":
                return new MiddleEastTShirt("MiddleEast Exclusive", size);
            case "china":
                return new ChinaTShirt("China Exclusive", size);
            case "asia":
                return new AsiaTShirt("Asia Exclusive", size);
            default:
                throw new IllegalArgumentException("Unknown region: " + region);
        }
    }
}

// Decorator Pattern for Adding Features
abstract class TShirtDecorator extends TShirt {
    protected TShirt tshirt;

    public TShirtDecorator(TShirt tshirt) {
        super(tshirt.name, tshirt.size);
        this.tshirt = tshirt;
    }

    @Override
    public String getDescription() {
        return tshirt.getDescription();
    }

    @Override
    public void formSize() {
        tshirt.formSize();
    }
}

class LogoDecorator extends TShirtDecorator {
    public LogoDecorator(TShirt tshirt) {
        super(tshirt);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Bird Logo";
    }
}

class TextDecorator extends TShirtDecorator {
    public TextDecorator(TShirt tshirt) {
        super(tshirt);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Text: 'Nice Day!'";
    }
}

class ColorDecorator extends TShirtDecorator {
    private String color;

    public ColorDecorator(TShirt tshirt, String color) {
        super(tshirt);
        this.color = color;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Color: " + color;
    }
}

// Observer Pattern for Shop Owner Tracking Sold Items
interface Observer {
    void update(String size);
}

class ShopOwner implements Observer {
    @Override
    public void update(String size) {
        System.out.println("Shop Owner notified: Sold 1 T-Shirt of size " + size);
    }
}

class SoldItemsTracker {
    private static SoldItemsTracker instance;
    private Map<String, Integer> soldItems = new HashMap<>();
    private List<Observer> observers = new ArrayList<>();

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

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void incrementSold(String size) {
        soldItems.put(size, soldItems.get(size) + 1);
        notifyObservers(size);
    }

    private void notifyObservers(String size) {
        for (Observer observer : observers) {
            observer.update(size);
        }
    }

    public void displaySoldItems() {
        System.out.println("Sold Items Count:");
        soldItems.forEach((size, count) -> System.out.println(size + ": " + count));
    }
}

// Test Code
public class Main {
    public static void main(String[] args) {
        // Initialize shop owner observer
        ShopOwner shopOwner = new ShopOwner();
        SoldItemsTracker tracker = SoldItemsTracker.getInstance();
        tracker.addObserver(shopOwner);

        // Create Factory for T-shirt creation
        TShirtFactory factory = new TShirtFactory();

        System.out.println("Customer Orders:");

        // Customer 1: A person from China orders a blue medium T-shirt with a bird logo
        TShirt chinaTShirt = factory.createTShirt("China", "Medium");
        chinaTShirt = new ColorDecorator(chinaTShirt, "Blue");
        chinaTShirt = new LogoDecorator(chinaTShirt);
        System.out.println(chinaTShirt.getDescription());
        tracker.incrementSold("Medium");

        // Customer 2: A person from the Middle East orders a red large T-shirt with text
        TShirt middleEastTShirt = factory.createTShirt("MiddleEast", "Large");
        middleEastTShirt = new ColorDecorator(middleEastTShirt, "Red");
        middleEastTShirt = new TextDecorator(middleEastTShirt);
        System.out.println(middleEastTShirt.getDescription());
        tracker.incrementSold("Large");

        System.out.println();

        // Display sold items summary
        tracker.displaySoldItems();
    }
}
*/