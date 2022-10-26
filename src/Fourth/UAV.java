package Fourth;

import First.*;

public class UAV extends FlyingObject {
    protected double weight;

    // Constructors
    public UAV() {
        weight = 5000.0;
        price = 1000000.0;
    }

    public UAV(double _weight, double _price) {
        weight = _weight;
        price = _price;
    }

    public UAV(UAV u) {
        weight = u.weight;
        price = u.price;
    }

    // Accessors
    public double getWeight() {
        return this.weight;
    }

    public double getPrice() {
        return this.price;
    }

    // Mutators
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString
    public String toString() {
        String fullClassName = this.getClass().toString();
        String simpleClassName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);

        return "This " + simpleClassName + " weights " + weight + " kgs and its price is " + price + "$CAD.";
    }

    // equals
    public boolean equals(Object x) {
        if (x == null || this.getClass() != x.getClass())
            return false;
        UAV u = (UAV) x;
        return (weight == u.weight && price == u.price);
    }
}
