package First;
import Second.*;
import Third.*;
import Fourth.*;
import Fifth.*;
public class Driver {

	public static void main(String[] args) {
        Airplane a1 = new Airplane();
        System.out.println("I just created an airplane");
        System.out.println(a1);
        Helicopter h1 = new Helicopter();
        Helicopter h2 = new Helicopter();
        System.out.println("I just created joe mother");
        System.out.println(h1);
        Quadcopter q1 = new Quadcopter(); 
        System.out.println(q1);
	
        System.out.println(h1.equals(h2));

        UAV uav1 = new UAV();
        System.out.println(uav1);
        MAV mav1 = new MAV();
        System.out.println(mav1);
        }

}
