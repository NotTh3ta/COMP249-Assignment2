package Second;

public class Quadcopter extends Helicopter {
    //Maximum flying speed attribute
    private int maxFlyingSpeed;

    // Constructors
    /**
     * Default Constructor sets max flying speed to 100
     */
    public Quadcopter() {
        super();
        maxFlyingSpeed = 100;
    }
    /**
     * Parametrized constructor for quadcopter
     * @param _brand Quadcopter brand
     * @param _price Quadcopter price
     * @param hp Quadcopter horsepower
     * @param nCyl Quadcopter number of Cylinders
     * @param cYear Quandcopter creation year
     * @param passCap Quadcopter passanger capacity
     * @param maxS Quadcopter maximum flying speed
     */
    public Quadcopter(String _brand, double _price, int hp, int nCyl, int cYear, int passCap, int maxS) {
        super(_brand, _price, hp, nCyl, cYear, passCap);
        maxFlyingSpeed = maxS;
    }
    /**
     * Quadcopter copy constructor
     * @param q Quadcopter to copy
     */
    public Quadcopter(Quadcopter q) {
        super(q.brand, q.price, q.horsepower, q.numberOfCylinders, q.creationYear, q.passengerCapacity);
        maxFlyingSpeed = q.maxFlyingSpeed;
    }

    // Accessors
    /**
     * returns max flying speed
     * @return
     */
    public int getMaxFlyingSpeed() {
        return this.maxFlyingSpeed;
    }

    // Mutators
    public void setMaxFlyingSpeed(int maxFlyingSpeed) {
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    // toString
    public String toString() {
        return super.toString() + " Its max flying speed is " + maxFlyingSpeed;
    }

    public boolean equals(Object x) {
        if (x == null || this.getClass() != x.getClass())
            return false;
        Quadcopter q = (Quadcopter) x;
        return (super.equals(q) && maxFlyingSpeed == q.maxFlyingSpeed);
    }
}
