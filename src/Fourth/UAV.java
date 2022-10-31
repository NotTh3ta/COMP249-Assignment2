package Fourth;

import First.*;
//UAV class 
public class UAV extends FlyingObject {
    //Weight attribute
    protected double weight;

    /** 
     * Default constructor sets weight to 5000 and price to 100k 
     */
    public UAV() {
        weight = 5000.0;
        price = 1000000.0;
    }
/**
 * Parametrized constructor
 * @param _weight UAV weight
 * @param _price UAV price
 */
    public UAV(double _weight, double _price) {
        weight = _weight;
        price = _price;
    }
/**
 * Copy constructor
 * @param u Object to be copied into new UAV object
 */
    public UAV(UAV u) {
        weight = u.weight;
        price = u.price;
    }

    // Accessors
    /**
     * Access this object's weight
     * @return UAV weight
     */
    public double getWeight() {
        return this.weight;
    }
    /**
     * Access this object's price
     * @return UAV price
     */
    public double getPrice() {
        return this.price;
    }

    // Mutators
    /**
     * Sets weight to input value
     * @param weight new weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    /**
     * Sets price to input value
     * @param price new price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /** 
     * toString method 
     * @return returns all the information about this UAV including its attributes
     */
    public String toString() {
        String fullClassName = this.getClass().toString();
        String simpleClassName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);

        return "This " + simpleClassName + " weights " + weight + " kgs and its price is " + price + "$CAD.";
    }

    // equals
    /** 
     * equals method
     * @return true if the UAV object has the same attributes and false if the object isn't an UAV and/or doesnt have the same attributes
     */
    public boolean equals(Object x) {
        if (x == null || this.getClass() != x.getClass())
            return false;
        UAV u = (UAV) x;
        return (weight == u.weight && price == u.price);
    }
}
