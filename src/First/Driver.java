package First;
import Second.*;
import Third.*;
import Fourth.*;
import Fifth.*;
public class Driver {

	public static void main(String[] args) {

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
