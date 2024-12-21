package shop.tshrits;

import java.util.ArrayList;

public class ShopApplication implements Subject {

    private static ShopApplication application;

    private final ArrayList<SoldTShirtObserver> observers;

    {
        observers = new ArrayList<>();
    }

    public void sell(Order order) {

        IShirt soldShirt = order.getTShirt();
        notifyObservers(soldShirt);

        System.out.println("order sold out, order details is " + soldShirt.toString());
    }

    public static ShopApplication getApplication() {

        if (application == null) {
            application = new ShopApplication();
        }
        return application;
    }

    @Override
    public void registerObserver(SoldTShirtObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(IShirt soldShirt) {

        for (SoldTShirtObserver observer : observers) {
            observer.update(soldShirt);
        }
    }
}
