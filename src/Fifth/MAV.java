//
// Part: 1
// Written by: Yash Patel, 40175454, David Ruiz, 40176885
//

package Fifth;

import Fourth.UAV;

//Micro Air vehicle class
public class MAV extends UAV {
    //Model attribute
    private String model;
    //Size attribute
    private double size;

    // Constructors
    /** 
     * Default constructor sets model to MicronatorXL3000
     * Size is set to 10 (cm)
     */
    public MAV() {
        super();
        model = "MicronatorXL3000";
        size = 10.0;
    }
    /**
     * Parametrized constructor
     * @param _weight MAV weight
     * @param _price MAV price
     * @param _model MAV model
     * @param _size MAV size
     */
    public MAV(double _weight, double _price, String _model, double _size) {
        super(_weight, _price);
        model = _model;
        size = _size;
    }
    /**
     * Copy constructor
     * @param m object to be copied into new MAV object
     */
    public MAV(MAV m) {
        super(m.weight, m.price);
        model = m.model;
        size = m.size;
    }

    // Accessors
    /**
     * Access this object's model
     * @return MAV model
     */
    public String getModel() {
        return this.model;
    }
    /**
     * Access this object's size
     * @return MAV size
     */
    public double getSize() {
        return this.size;
    }

    // Mutators
    /**
     * Modifies this object's model
     * @param model new model
     */
    public void setModel(String model) {
        this.model = model;
    }
    /**
     * Modifies this objects size
     * @param size new size
     */
    public void setSize(double size) {
        this.size = size;
    }

    // toString
    /**
     * To string method
     * @return string containing all the information about this MAV including its attributes
     */
    public String toString() {
        return super.toString() + " This amazing device is of model " + model + " and comes in the size " + size
                + "cm.";
    }

    // equals
    /**
     * Equals method
     * @return true if the input obejcts is also a MAV with the same attributes, false for all other cases.
     */
    public boolean equals(Object x) {
        if (x == null || this.getClass() != x.getClass())
            return false;
        MAV m = (MAV) x;
        return (super.equals(m) && model.equals(m.model) && size == m.size);
    }
}
