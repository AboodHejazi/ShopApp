package shop.tshrits;

public interface Subject {
    void registerObserver(SoldTShirtObserver observer);
    void notifyObservers(IShirt soldShirt);
}
