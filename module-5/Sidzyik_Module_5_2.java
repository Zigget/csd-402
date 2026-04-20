/*
Made by: Samuel Sidzyik
Module 5.2
Start Date April 19, 2026

Returning arrays for largest and smallest values

https://github.com/Zigget/csd-402/blob/main/module-5/Sidzyik_Module_5_2.java
*/
public class Sidzyik_Module_5_2 {
    
    public static int [ ] locateLargest (int [ ][ ] intArray){
        int maxRow = 0;
        int maxColumn = 0;
        int maxValue = intArray[0][0]; // give max value starter number
        for (int i = 0; i < intArray.length; i++){
            for (int j = 0; j < intArray[i].length; j++){
                if (intArray[i][j] > maxValue){
                    maxValue = intArray[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        return new int[]{maxRow, maxColumn};
    }
    public static int [ ] locateLargest (double [ ][ ] doubleArray){
        int maxRow = 0;
        int maxColumn = 0;
        double maxValue = doubleArray[0][0]; // give max value starter number
        for (int i = 0; i < doubleArray.length; i++){
            for (int j = 0; j < doubleArray[i].length; j++){
                if (doubleArray[i][j] > maxValue){
                    maxValue = doubleArray[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        return new int[]{maxRow, maxColumn};
    }
    public static int [ ] locateSmallest (double [ ][ ] doubleArray){
        int minRow = 0;
        int minColumn = 0;
        double minValue = doubleArray[0][0]; // give min value starter number
        for (int i = 0; i < doubleArray.length; i++){
            for (int j = 0; j < doubleArray[i].length; j++){
                if (doubleArray[i][j] < minValue){
                    minValue = doubleArray[i][j];
                    minRow = i;
                    minColumn = j;
                }
            }
        }
        return new int[]{minRow, minColumn};
    }
    public static int [ ] locateSmallest (int [ ][ ] intArray){
        int minRow = 0;
        int minColumn = 0;
        int minValue = intArray[0][0]; // give min value starter number
        for (int i = 0; i < intArray.length; i++){
            for (int j = 0; j < intArray[i].length; j++){
                if (intArray[i][j] < minValue){
                    minValue = intArray[i][j];
                    minRow = i;
                    minColumn = j;
                }
            }
        }
        return new int[]{minRow, minColumn};
    }



    public static void main(String[] args) {
        int[][] intMultiArray = {{1,2},{3,4},{5,6},{7,8}};
        double[][] doubleMultiArray = {{1000,2},{3,40000},{500000,6000000}};
        int[] Location = new int[2];


        System.out.println("Int Array:" );
        for (int[] intMultiArray1 : intMultiArray) {
            for (int j = 0; j < intMultiArray1.length; j++) {
                System.out.print(intMultiArray1[j]);
                if ((j+1) != intMultiArray1.length) {
                    System.out.print(",");
                }
            }
            System.out.print("\n");
        }

        System.out.println("\nDouble Array:"); 

        for (double[] doubleMultiArray1 : doubleMultiArray) {
            for (int j = 0; j < doubleMultiArray1.length; j++) {
                System.out.print(doubleMultiArray1[j]);
                if ((j+1) != doubleMultiArray1.length) {
                    System.out.print(",");
                }
            }
            System.out.print("\n");
        }


        //Call methods and print 
        Location = locateLargest(intMultiArray);
        System.out.println("\nLargest INT array locale = (" + Location[0] + "," + Location[1] + ")");

        Location = locateLargest(doubleMultiArray);
        System.out.println("\nLargest Double array locale = (" + Location[0] + "," + Location[1] + ")");

        Location = locateSmallest(intMultiArray);
        System.out.println("\nSmallest INT array locale = (" + Location[0] + "," + Location[1] + ")");

        Location = locateSmallest(doubleMultiArray);
        System.out.println("\nSmallest Double array locale = (" + Location[0] + "," + Location[1] + ")");
    }

}