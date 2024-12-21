package shop.tshrits;

public abstract class TShirt implements IShirt {

    protected String name;

    public TShirt(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "TShirt name: " + name + ", formSize: " + getFormSize() + "";
    }
}
