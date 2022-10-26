package Second;

import First.Airplane;

public class Helicopter extends Airplane {
    protected int numberOfCylinders;
    protected int creationYear;
    protected int passengerCapacity;

    // Constructors
    public Helicopter() {
        super();
        numberOfCylinders = 10;
        creationYear = 2000;
        passengerCapacity = 10;
    }

    public Helicopter(String _brand, double _price, int hp, int nCyl, int cYear, int passCap) {
        super(_brand, _price, hp);
        numberOfCylinders = nCyl;
        creationYear = cYear;
        passengerCapacity = passCap;
    }

    public Helicopter(Helicopter h) {
        super(h.brand, h.price, h.horsepower);
        numberOfCylinders = h.numberOfCylinders;
        creationYear = h.creationYear;
        passengerCapacity = h.passengerCapacity;
    }

    // Accessors
    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    // Mutators
    public void setNumberOfCylinders(int n) {
        numberOfCylinders = n;
    }

    public void setCreationYear(int y) {
        creationYear = y;
    }

    public void setPassengerCapacity(int p) {
        passengerCapacity = p;
    }

    // toString
    public String toString() {
        return super.toString() + " It has " + numberOfCylinders + " cylinders. It was made in " + creationYear
                + ". Its passenger capacity is " + passengerCapacity + ".";
    }

    // equals
    public boolean equals(Object x) {
        if (x == null || this.getClass() != x.getClass())
            return false;
        Helicopter h = (Helicopter) x;
        return (super.equals(x) && numberOfCylinders == h.numberOfCylinders && creationYear == h.creationYear
                && passengerCapacity == h.passengerCapacity);
    }
}
