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

        public static void findLeastAndMostExpensiveUAV(FlyingObject[] f){
                double max = f[0].price;
                double min = f[0].price;
                int indexOfMostExpensive = 0;
                int indexOfLeastExpensive = 0;
                int nOfAirplanes = 0;

                //Main loop where we go through every index of the array.
                for(int i = 0; i < f.length; i++){
                        //If the object at the index is an airplane, we increase the number of airplanes
                        //and continue to the next object
                        if(f[i] instanceof Airplane){
                                nOfAirplanes++;
                                continue;
                        }
                        if(f[i].price > max){
                                max = f[i].price;
                                indexOfMostExpensive = i;
                        }
                        if(f[i].price < min){
                                min = f[i].price;
                                indexOfLeastExpensive = i;
                        }        
                }


                if(indexOfLeastExpensive == indexOfMostExpensive){
                        System.out.println("Here is the ");
                }
        }

}
