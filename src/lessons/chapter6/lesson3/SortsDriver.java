package lessons.chapter6.lesson3;

public class SortsDriver {
    ///Create int arrays to sort
    public static int[] testArray1 = {10,7,6,9};
    public static int[] testArray2 = testArray1.clone(); // copy first array
    public static void main(String[] args){

        //Sort both arrays
        Sorts.selectionSort(testArray1);
        Sorts.insertionSort(testArray2);

        //Print results
        System.out.print("Selection (testArray1): ");
        for(int value : testArray1){
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.print("Insertion (testArray2): " );
        for(int value : testArray2){
            System.out.print(value + " ");
        }
    }
}


//Output:
/*
Selection (testArray1): 10 9 7 6
Insertion (testArray2): 10 9 7 6
 */