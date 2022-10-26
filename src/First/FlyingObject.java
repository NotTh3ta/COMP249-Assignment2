package First;
/**
 * Flying object class with a toString method and price attribute. Contains default constructor and copy constructor
 */
public class FlyingObject {
    // Price attribute
    protected double price;

<<<<<<< HEAD
    /**Default constructor sets price to 1000;
     */
    public FlyingObject(){
        price = 1000;
    }
    /**
     * Copy constructor copies passed object and calling object.
     * @param fo passed object to be copied.
     */
    public FlyingObject( FlyingObject fo){
        price = fo.price;
    }
    /**ToString method prints the attributes of the flying object
     */
    public String toString(){
        return "This is a flying object and it costs"+price;
=======
    public FlyingObject() {
        price = 1000;
    }

    public FlyingObject(FlyingObject fo) {
        price = fo.price;
    }

    public String toString() {
        return "This is a flying object and it costs" + price;
>>>>>>> 5217fc79844364c6ff75b1658671a88915adf473
    }
}
