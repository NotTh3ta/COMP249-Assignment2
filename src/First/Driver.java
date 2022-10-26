package First;
import Second.*;
import Third.*;
import Fourth.*;
import Fifth.*;
public class Driver {

	public static void main(String[] args) {

        /* Create 15 objects inside an array of FlyingObject */
       FlyingObject [] fo1 = new FlyingObject[15]; // Flying objects 1 array
       fo1[0] = new Airplane();
       fo1[1] = new Airplane("Bombardier", 100000, 75);
       fo1[2] = new Helicopter();
       fo1[3] = new Helicopter();
       fo1[4] = new Quadcopter();
       fo1[5] = new Quadcopter();
       fo1[6] = new UAV();
       fo1[7] = new UAV();
       fo1[8] = new AgriculturalDrone();
       fo1[9] = new AgriculturalDrone();
       fo1[10] = new MAV();
       fo1[11] = new MAV();
       fo1[12] = new Multirotor();
       fo1[13] = new Multirotor();
       fo1[14]  = new Multirotor();
       //Displays the information of all flying objects in the array
        for (int i = 0; i < fo1.length; i++) {
        System.out.println(fo1[i].toString());
        }
        //Testing equality
        System.out.println("Testing equality with two different airplanes");
        System.out.println(fo1[0].equals(fo1[1]));
        System.out.println("Testing two equal airplanes");
        System.out.println(fo1[0].equals(fo1[0]));
        System.out.println("Testing equality of Airplane and Helicopter (Father and Child)");
        System.out.println(fo1[0].equals(fo1[2]));
        System.out.println("Testing equality of Quadcopter and Helicoper (Child and Father)");
        System.out.println(fo1[4].equals(fo1[2]));
        System.out.println("Testing Multirotor and quadcopter (Brothers)");
        System.out.println(fo1[4].equals(fo1[12]));
        }

        FlyingObject [] fo2 = new FlyingObject[15];
        

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
