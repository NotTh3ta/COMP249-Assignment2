package Fifth;

import Fourth.UAV;

public class MAV extends UAV {
    private String model;
    private double size;

    // Constructors
    public MAV() {
        super();
        model = "Micro";
        size = 10.0;
    }

    public MAV(double _weight, double _price, String _model, double _size) {
        super(_weight, _price);
        model = _model;
        size = _size;
    }

    public MAV(MAV m) {
        super(m.weight, m.price);
        model = m.model;
        size = m.size;
    }

    // Accessors
    public String getModel() {
        return this.model;
    }

    public double getSize() {
        return this.size;
    }

    // Mutators
    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(double size) {
        this.size = size;
    }

    // toString
    public String toString() {
        return super.toString() + " This amazing device is of model " + model + " and comes in the size " + size
                + "cm.";
    }

    // equals
    public boolean equals(Object x) {
        if (x == null || this.getClass() != x.getClass())
            return false;
        MAV m = (MAV) x;
        return (super.equals(m) && model.equals(m.model) && size == m.size);
    }
}
