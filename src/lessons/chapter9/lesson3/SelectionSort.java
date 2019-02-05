package lessons.chapter9.lesson3;

import java.util.LinkedList;

public class SelectionSort
{
    static LinkedList<Integer> thatListIGottause = new LinkedList<>();



    // One by one move boundary of unsorted subarray
    public static void main(String[] args){
        thatListIGottause.add(1);
        thatListIGottause.add(1041);
        thatListIGottause.add(12);
        thatListIGottause.add(25);
        thatListIGottause.add(55);

        int n = thatListIGottause.size();

        for(int i : thatListIGottause){
            System.out.print(i +  " ");
        }
        System.out.println();
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (thatListIGottause.get(j) < thatListIGottause.get(min_idx))
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = thatListIGottause.get(min_idx);
            thatListIGottause.set(min_idx,thatListIGottause.get(i));
            thatListIGottause.set(i,temp);
        }

        for(int i : thatListIGottause){
            System.out.print(i +  " ");
        }
    }
}
/*
1 1041 12 25 55
1 12 25 55 1041
 */