package lessons.chapter6.lesson11;

public class Sorts {
    public static void selectionSort(int[] numbers){
        int min,temp;
        for(int i=0;i<numbers.length;i++){
            min = i;
            for(int scan=i+1;scan<numbers.length;scan++){
                if(numbers[scan] < numbers[min]){
                    min = scan;
                }
            }

            temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
    }

    public static void insertionSort(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            int key =  numbers[i];
            int position = i;

            while(position> 0 && numbers[position-1] < key){
                numbers[position] = numbers[position - 1];
                position--;
            }
            numbers[position] = key;
        }
    }

    public static void insertionSort(Comparable[] stuff){


        for(int i=0;i<stuff.length;i++){
            Comparable key =  stuff[i];
            int position = i;

            while(position> 0 && stuff[position-1].compareTo(key) > 0){
                stuff[position] = stuff[position - 1];
                position--;
            }
            stuff[position] = key;
        }
    }
}
