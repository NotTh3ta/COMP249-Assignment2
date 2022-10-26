package First;

public class FlyingObject {
    protected double price;

    public FlyingObject() {
        price = 1000;
    }

    public FlyingObject(FlyingObject fo) {
        price = fo.price;
    }

    public String toString() {
        return "This is a flying object and it costs" + price;
    }
}
