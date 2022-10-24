package Third;
import Second.Helicopter;

public class Multirotor extends Helicopter{
    private int numberOfRotors;

    //Constructors
    public Multirotor(){
        super();
        numberOfRotors = 6;
    }

    public Multirotor(String s, double d, int i, int x, int y, int z, int r){
        super(s, d, i, x, y, z);
        numberOfRotors = r;
    }
    
    public Multirotor(Multirotor m){
        super(m.brand, m.price, m.horsepower, m.numberOfCylinders, m.creationYear, m.passengerCapacity);
        numberOfRotors = m.numberOfRotors;
    }

    //Accessors
     public int getNumberOfRotors() {
        return this.numberOfRotors;
    }

    //Mutators
    public void setNumberOfRotors(int numberOfRotors) {
        this.numberOfRotors = numberOfRotors;
    }

    //To String method
      public String toString() {
        return super.toString() +" Its number of rotors is " +numberOfRotors;
    }

    //equals
    public boolean equals(Object x){
        if(x == null || this.getClass() != x.getClass()) return false;
        Multirotor m = (Multirotor) x;
        return (super.equals(m) && numberOfRotors == m.numberOfRotors);
    }
}
