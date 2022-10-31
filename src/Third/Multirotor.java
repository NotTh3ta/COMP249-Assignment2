package Third;

import Second.Helicopter;

public class Multirotor extends Helicopter {
    private int numberOfRotors;

    // Constructors
    
    /** 
     * Default constructor 
    */
    public Multirotor() {
        super();
        numberOfRotors = 6;
    }

    /**
     * Parametrized constructor
     * @param _brand Multirotor brand
     * @param _price Multirotor price
     * @param hp Multirotor horsepower
     * @param nCyl Multirotor number of cylinders
     * @param cYear Multirotor creation year
     * @param passCap Multirotor passenger capacity
     * @param nRotor Multirotor number of rotors
     */
    public Multirotor(String _brand, double _price, int hp, int nCyl, int cYear, int passCap, int nRotor) {
        super(_brand, _price, hp, nCyl, cYear, passCap);
        numberOfRotors = nRotor;
    }

    /**
     * Copy constructor
     * @param m Object that will be copied
     */
    public Multirotor(Multirotor m) {
        super(m.brand, m.price, m.horsepower, m.numberOfCylinders, m.creationYear, m.passengerCapacity);
        numberOfRotors = m.numberOfRotors;
    }

    // Accessors
    /**
     * Access the number of rotors for this object
     * @return the number of rotors 
     */
    public int getNumberOfRotors() {
        return this.numberOfRotors;
    }

    // Mutators
    /**
     * Modifies the number of rotors to the input value
     * @param numberOfRotors new number of rotors
     */
    public void setNumberOfRotors(int numberOfRotors) {
        this.numberOfRotors = numberOfRotors;
    }

    // To String method
    /** 
     * To string method
     * @return string with all the information on the object including its attributes
     */
    public String toString() {
        return super.toString() + " Its number of rotors is " + numberOfRotors;
    }

    
     /**
     * Equals method for comparing Quadcopter objects. 
     * @param x Object we want to compare equality with
     * @return True if objects are equal Quadcopters. False for any other object passed.
     */
    public boolean equals(Object x) {
        if (x == null || this.getClass() != x.getClass())
            return false;
        Multirotor m = (Multirotor) x;
        return (super.equals(m) && numberOfRotors == m.numberOfRotors);
    }
}
