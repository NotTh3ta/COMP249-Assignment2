package Fifth;
import Fourth.UAV;

public class AgriculturalDrone extends UAV{
    private String brand;
    private int carryCapacity;

    //Constructors
    public AgriculturalDrone(){
        super();
        brand = "Netflix";
        carryCapacity = 50;
    }

    public AgriculturalDrone(double _weight, double _price, String _brand, int _cap){
        super(_weight, _price);
        brand = _brand;
        carryCapacity = _cap;
    }

    public AgriculturalDrone(AgriculturalDrone a){
        super(a.weight, a.price);
        brand = a.brand;
        carryCapacity = a.carryCapacity;
    }

    //Accessors
    public String getBrand() {
        return this.brand;
    }
    
    public int getCarryCapacity() {
        return this.carryCapacity;
    }

    //Mutators
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCarryCapacity(int carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    //toString
    public String toString() {
        return super.toString() + " Its brand is "+brand+ " and its carry capacity is "+ carryCapacity+".";
    }
    
    //equals
    public boolean equals(Object x){
        if(x == null || this.getClass() != x.getClass()) return false;
        AgriculturalDrone a = (AgriculturalDrone) x;
        return (super.equals(a) && brand.equals(a.brand) && carryCapacity == a.carryCapacity);
    }
}
