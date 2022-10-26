package First;

import Second.*;
import Third.*;
import Fourth.*;
import Fifth.*;

public class DriverPart2 {
    // Takes an array as input and returns copy of this array
    public static FlyingObject[] copyFlyingObjects(FlyingObject[] _fo) {
        FlyingObject[] fo1 = new FlyingObject[_fo.length];

        for (int i = 0; i < fo1.length; i++) {
            fo1[i] = new FlyingObject(_fo[i]);
        }

        return fo1;

    }

    public static void main(String[] args) {
        FlyingObject[] fo1 = new FlyingObject[15]; // Flying objects 1 array
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
        fo1[14] = new Multirotor();
        FlyingObject[] fo1Copy = new FlyingObject[15];

        fo1Copy = copyFlyingObjects(fo1);

        // First array
        for (int i = 0; i < fo1.length; i++) {
            System.out.println(fo1[i].toString());
        }
        // Copy Array
        for (int i = 0; i < fo1Copy.length; i++) {
            System.out.println(fo1Copy[i].toString());
        }
    }
}
