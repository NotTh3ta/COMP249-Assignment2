//
// Part: 1
// Written by: Yash Patel, 40175454, David Ruiz, 40176885
//

package Second;

import First.Airplane;
//Helicopter class 
public class Helicopter extends Airplane{
    //Helicopter attributes
    protected int numberOfCylinders;
    protected int creationYear;
    protected int passengerCapacity;

    //Constructors

    /**
     * Helicopter constructor sets default values to number of cylinders  =10, creation year = 2000 and passenger Capacity =10.
     */
    public Helicopter(){
        super();
        numberOfCylinders = 10;
        creationYear = 2000;
        passengerCapacity = 10;
    }
    /**
     * Helicopter parametrized constructor
     * @param _brand Helicopter brand
     * @param _price Helicopter price
     * @param hp Helicopter power in horse power
     * @param nCyl Helicopter number of cylinders
     * @param cYear Helicopter creation year
     * @param passCap Helicopter passanger capacity
     */
    public Helicopter(String _brand, double _price, int hp, int nCyl, int cYear, int passCap){
        super(_brand, _price, hp);
        numberOfCylinders = nCyl;
        creationYear = cYear;
        passengerCapacity = passCap;
    }

    /**
     * Helicopter copy constructor
     * @param h  object to be copied.
     */
    public Helicopter(Helicopter h){
        super(h.brand, h.price, h.horsepower);
        numberOfCylinders = h.numberOfCylinders;
        creationYear = h.creationYear;
        passengerCapacity = h.passengerCapacity;
    }

    //Accessors
    /**
     * Returns Number of cylinders 
     * @return number of cylinders
     */
    public int getNumberOfCylinders(){
        return numberOfCylinders;
    }
    /**
     * Returns creation year
     * @return creation year
     */
    public int getCreationYear(){
        return creationYear;
    }
    /**
     * Returns passenger capacity
     * @return passenger capacity
     */
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    // Mutators

    /**
     * Sets number of cylinders to input value
     * @param n new number of cylinders
     */
    public void setNumberOfCylinders(int n) {
        numberOfCylinders = n;
    }

    /**
     * Sets creation year to input value
     * @param y new creation year
     */
    public void setCreationYear(int y) {
        creationYear = y;
    }

    /**
     * Sets passenger capacity to input value
     * @param p new passenger capacity
     */
    public void setPassengerCapacity(int p) {
        passengerCapacity = p;
    }

    // toString

    /**
     * To string method returns information about the helicopter including all its attributes.
     */
    public String toString() {
        return super.toString() + " It has " + numberOfCylinders + " cylinders. It was made in " + creationYear
                + ". Its passenger capacity is " + passengerCapacity + ".";
    }

    // equals

    /**
     * Equals method for comparing Helicopter objects. 
     * @param x Object we want to compare equality with
     * @return True if objects are equal helicopters. False for any other object passed.
     */
    public boolean equals(Object x) {
        if (x == null || this.getClass() != x.getClass())
            return false;
        Helicopter h = (Helicopter) x;
        return (super.equals(x) && numberOfCylinders == h.numberOfCylinders && creationYear == h.creationYear
                && passengerCapacity == h.passengerCapacity);
    }
}
