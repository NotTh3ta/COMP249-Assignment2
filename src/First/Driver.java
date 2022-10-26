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
        FlyingObject [] fo2 = new FlyingObject[15];
        fo2[0] = new Airplane();
        fo2[1] = new Airplane("Bombardier", 100000, 75);
        fo2[2] = new Helicopter();
        fo2[3] = new Helicopter();
        fo2[4] = new Quadcopter();
        fo2[5] = new Quadcopter();
        fo2[6] = new Airplane();
        fo2[7] = new Airplane();
        fo2[8] = new Helicopter();
        fo2[9] = new Helicopter();
        fo2[10] = new Quadcopter();
        fo2[11] = new Quadcopter();
        fo2[12] = new Multirotor();
        fo2[13] = new Multirotor();
        fo2[14]  = new Multirotor();
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

                //If the number of Airplane objects is equal to the length of the array,
                //it implies that there are no UAV objects
                if(nOfAirplanes == f.length){
                        System.out.println("There are no UAVs in this array");
                        return;
                }

                //If the index is the same, that means taht nothing more expensive or less expensive
                //was found
                else if(indexOfLeastExpensive == indexOfMostExpensive){
                        System.out.println("There is nothing more expensive or less expensive than this flying object: ");
                        System.out.println(f[indexOfLeastExpensive]);
                        return;
                }

                //If neither of the cases above are true, print information of the least and most expensive
                else{
                        System.out.println("The most expensive UAV is:");
                        System.out.println(f[indexOfMostExpensive]);
                        System.out.println("The least expensive UAV is:");
                        System.out.println(f[indexOfLeastExpensive]);
                        return;
                }
        }

}
