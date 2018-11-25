package lessons.chapter6.lesson11;

import java.text.NumberFormat;

public class CDCollection {
    private CD[] collection;
    private int count;
    private double totalCost;

    public CDCollection(){
        collection = new CD[100];
        count = 0;
        totalCost = 0.0;
    }

    public void addCD(String title, String artist, double cost, int tracks){
        if(count == collection.length){
            increaseSize();
        }

        collection[count] = new CD(title, artist, cost, tracks);
        totalCost += cost;
        count++;

    }

    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String report = "********************************\n";
        report += "My CD Collection:\n\n";
        report += "Number of CD's: " + count + "\n";
        report += "Total Cost: " + fmt.format(totalCost) + "\n";
        report += "Avg Cost: " + fmt.format(totalCost/count) + "\n";
        report += "\n\n CD List: \n\n";

        for(CD cd : collection){
            if(cd == null){ // Null Check
                continue;
            }
            report += cd.toString() + "\n";
        }

        return report;
    }

    public void increaseSize(){

    }

}
