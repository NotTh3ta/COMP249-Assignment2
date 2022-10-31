package Fifth;

import Fourth.UAV;

//Agricultural drone class
public class AgriculturalDrone extends UAV {
    //Brand attribute
    private String brand;
    //carry capacity attribute
    private int carryCapacity;

    // Constructors
    /**
     * Default constructor sets carry capacity to 50 and brand to Netflix
     */
    public AgriculturalDrone() {
        super();
        brand = "Netflix";
        carryCapacity = 50;
    }
    /**
     * Parametrized constructor
     * @param _weight A.Drone weight
     * @param _price A.Drone price
     * @param _brand A.Drone brand
     * @param _cap A.Drone carry capacity
     */
    public AgriculturalDrone(double _weight, double _price, String _brand, int _cap) {
        super(_weight, _price);
        brand = _brand;
        carryCapacity = _cap;
    }
    /**
     * Copy constructor 
     * @param a Object to be copied into new A. Drone
     */
    public AgriculturalDrone(AgriculturalDrone a) {
        super(a.weight, a.price);
        brand = a.brand;
        carryCapacity = a.carryCapacity;
    }

    // Accessors
    /**
     * Access this object's brand
     * @return A. Drone brand
     */
    public String getBrand() {
        return this.brand;
    }
    /**
     * Access this object's carry capacity
     * @return A.Drone carry capacity
     */
    public int getCarryCapacity() {
        return this.carryCapacity;
    }

    // Mutators
    /**
     * Modifies this object's brand
     * @param brand new brand to be changed
     */
    public void setBrand(String _brand) {
        brand = _brand;
    }
    /**
     * Modifies carry capacity 
     * @param _carryCapacity new carry capacity
     */
    public void setCarryCapacity(int _carryCapacity) {
        carryCapacity = _carryCapacity;
    }

    // toString
    /**
     * to String method
     * @return String containing all the information about this A. Drone including its attributes
     */
    public String toString() {
        return super.toString() + " Its brand is " + brand + " and its carry capacity is " + carryCapacity + ".";
    }

    // equals
    /** 
     * Equals method
     * @return true if object is an A.Drone and has the same attributes and false for any other case.
     */
    public boolean equals(Object x) {
        if (x == null || this.getClass() != x.getClass())
            return false;
        AgriculturalDrone a = (AgriculturalDrone) x;
        return (super.equals(a) && brand.equals(a.brand) && carryCapacity == a.carryCapacity);
    }
}
