package First;
<<<<<<< HEAD
  //Airplane object
public class Airplane extends FlyingObject{

    protected String brand; // Airplane brand
    protected int horsepower;// Airplane power 

    //Constructors
    /** Default constructor
     * Creates an Airplane brand Boeing, price 1000 000 and horsepower 2000
     */
    public Airplane(){
=======

public class Airplane extends FlyingObject {
    protected String brand;
    protected int horsepower;

    // Constructors
    public Airplane() {
>>>>>>> 5217fc79844364c6ff75b1658671a88915adf473
        brand = "Boeing";
        price = 10000000.0;
        horsepower = 2000;
    }
<<<<<<< HEAD
    /** Parametrized Constructor
     * Creates an airplane with chosen brand, price and horsepower
     * @param _brand The brand of the airplane
     * @param _price The price of the airplane
     * @param hp The power of the airplane in horsepower.
     */
    public Airplane(String _brand, double _price, int hp){
        brand =_brand;
=======

    public Airplane(String _brand, double _price, int hp) {
        brand = _brand;
>>>>>>> 5217fc79844364c6ff75b1658671a88915adf473
        price = _price;
        horsepower = hp;
    }

<<<<<<< HEAD
    /**Copy Constructor
     * Creates airplane with the same attributes as the input airplane
     * @param a Input airplane to copy all attributes from.
     */
    public Airplane(Airplane a){
=======
    public Airplane(Airplane a) {
>>>>>>> 5217fc79844364c6ff75b1658671a88915adf473
        brand = a.brand;
        price = a.price;
        horsepower = a.horsepower;
    }

<<<<<<< HEAD
    //Accessors
    /**
     * Get brand accessor
     * @return airplane brand
     */
    public String getBrand(){
        return brand;
    }
/**
 * Get price accessor
 * @return airplane price
 */
    public double getPrice(){
        return price;
    }
/**
 * Get horsepower accessor
 * @return airplane horsepower
 */
    public int getHorsepower(){
        return horsepower;
    }

    //Mutators
    /**
     * Modifies the airplane brand
     * @param s New airplane brand
     */
    public void setBrand(String s){
        brand = s;
    }
    /**
     * Modifies airplane price
     * @param p new airplane price
     */
    public void setPrice(double p){
        price = p;
    }
    /**
     * Modifies airplane horsepower
     * @param h new airplane horsepower
     */
    public void setHorsepower(int h){
        horsepower = h;
    }

    /**toString method
     *@return String with the airplane attributes and class. For any children classes it displays their class instead.
     */
    public String toString(){
=======
    // Accessors
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getHorsepower() {
        return horsepower;
    }

    // Mutators
    public void setBrand(String s) {
        brand = s;
    }

    public void setPrice(double p) {
        price = p;
    }

    public void setHorsepower(int h) {
        horsepower = h;
    }

    // toString
    public String toString() {
>>>>>>> 5217fc79844364c6ff75b1658671a88915adf473

        String fullClassName = this.getClass().toString();
        String simpleClassName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);

        return "This " + simpleClassName + " is manufactured by " + brand + ". It costs " + price + "$."
                + " It has " + horsepower + " HP.";
    }
<<<<<<< HEAD
    /**Equals method that compares the attributes of the calling object and passed object to return true or false if all their attributes
     * are equal.
     * @return True if all attributes are the same between passed object and calling object. False if the passed object is null or if it
     * is not the same class as the calling object.
     */
    public boolean equals(Object x){
        if(x == null || this.getClass() != x.getClass()) return false;
=======

    // equals
    public boolean equals(Object x) {
        if (x == null || this.getClass() != x.getClass())
            return false;
>>>>>>> 5217fc79844364c6ff75b1658671a88915adf473
        Airplane a = (Airplane) x;
        return (brand.equals(a.brand) && price == a.price && horsepower == a.horsepower);
    }
}
