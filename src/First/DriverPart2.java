package First;
import Second.*;
import Third.*;
import Fourth.*;
import Fifth.*;
public class DriverPart2 {
    /**
     * Takes an array of flying objects and copies each elements into a new array that is returned
     * @param _fo Original array of flying objects to be copied.
     * @return the copy array of flying objects.
     */
    public static FlyingObject[] copyFlyingObjects ( FlyingObject[] _fo){
        FlyingObject[] fo1 = new FlyingObject[_fo.length];

        for (int i = 0; i < fo1.length; i++) {
            fo1[i] = new FlyingObject(_fo[i]);
        }

        return fo1;

    }
    /**
     * Main method. Creates an array of 15 flying objects and uses copyFlyingObjects method to 
     * copy this array into a copy array. Prints the contents of the original array and the copy.
     * @param args
     */
    public static void main(String[] args) {
    // Flying objects 1st array   
    FlyingObject [] fo1 = new FlyingObject[15]; 
       fo1[0] = new Airplane();
       fo1[1] = new Airplane("Bombardier", 100000, 75);
       fo1[2] = new Helicopter();
       fo1[3] = new Helicopter("Bell", 100000, 30, 15, 1, 7);
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

    // Flying object copy array
       FlyingObject [] fo1Copy = new FlyingObject[15]; 
    
    // Call copyFlyingObjects method 
        fo1Copy=copyFlyingObjects(fo1);
        
        //Print contents of first array
        for (int i = 0; i < fo1.length; i++) {
            System.out.println(fo1[i].toString());
        }
        //Print contents of second array
        for (int i = 0; i < fo1Copy.length; i++) {
            System.out.println(fo1Copy[i].toString());
        }
    }
}
