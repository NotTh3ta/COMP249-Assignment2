package Second;

public class Quadcopter extends Helicopter{
    private int maxFlyingSpeed;

    //Constructors
    public Quadcopter(){
        super();
        maxFlyingSpeed = 100;
    }

    public Quadcopter(String _brand, double _price, int hp, int nCyl, int cYear, int passCap, int maxS){
        super(_brand, _price, hp, nCyl, cYear, passCap);
        maxFlyingSpeed = maxS;
    }

    public Quadcopter(Quadcopter q){
        super(q.brand, q.price, q.horsepower, q.numberOfCylinders, q.creationYear, q.passengerCapacity);
        maxFlyingSpeed = q.maxFlyingSpeed;
    }
    
    //Accessors
    public int getMaxFlyingSpeed() {
        return this.maxFlyingSpeed;
    }

    //Mutators
    public void setMaxFlyingSpeed(int maxFlyingSpeed) {
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    //toString
    public String toString() {
        return super.toString() + " Its max flying speed is "+ maxFlyingSpeed;
    }

    public boolean equals(Object x){
        if(x == null || this.getClass() != x.getClass()) return false;
        Quadcopter q = (Quadcopter) x;
        return (super.equals(q) && maxFlyingSpeed == q.maxFlyingSpeed);
    }
}
