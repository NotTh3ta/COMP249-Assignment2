package First;

/**
 * Flying object class with a toString method and price attribute. Contains
 * default constructor and copy constructor
 */
public class FlyingObject {
    // Price attribute
    protected double price;

    /**Default constructor sets price to 1000;
     */
    public FlyingObject(){
        price = 1000;
    }
    /**
     * Copy constructor;
     * @param fo object that will be copied in the constructor
     */
    public FlyingObject( FlyingObject fo){
        price = fo.price;
    }
    /**ToString method prints the attributes of the flying object
     * @return returns string with the attributes of the flying object
     */
    public String toString(){
        return "This is a flying object and it costs"+price;
    }
}
