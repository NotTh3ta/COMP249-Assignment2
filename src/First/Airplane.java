package First;

public class Airplane extends FlyingObject{
    protected String brand;
    protected int horsepower;

    //Constructors
    public Airplane(){
        brand = "Boeing";
        price = 10000000.0;
        horsepower = 2000;
    }

    public Airplane(String _brand, double _price, int hp){
        brand =_brand;
        price = _price;
        horsepower = hp;
    }

    public Airplane(Airplane a){
        brand = a.brand;
        price = a.price;
        horsepower = a.horsepower;
    }

    //Accessors
    public String getBrand(){
        return brand;
    }

    public double getPrice(){
        return price;
    }

    public int getHorsepower(){
        return horsepower;
    }

    //Mutators
    public void setBrand(String s){
        brand = s;
    }

    public void setPrice(double p){
        price = p;
    }

    public void setHorsepower(int h){
        horsepower = h;
    }

    //toString
    public String toString(){

        String fullClassName = this.getClass().toString();
        String simpleClassName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);

        return "This "+ simpleClassName +" is manufactured by " + brand + ". It costs " + price + "$."
                + " It has " + horsepower + " HP.";
    }

    //equals
    public boolean equals(Object x){
        if(x == null || this.getClass() != x.getClass()) return false;
        Airplane a = (Airplane) x;
        return (brand.equals(a.brand) && price == a.price && horsepower == a.horsepower);
    }
}
