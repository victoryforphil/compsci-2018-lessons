package lessons.chapter6.lesson11;

import java.text.NumberFormat;

public class CD implements Comparable<CD>{
    private String title, artist;
    private double cost;
    private int tracks;

    public CD(String title, String artist, double cost, int tracks) {
        this.title = title;
        this.artist = artist;
        this.cost = cost;
        this.tracks = tracks;
    }

    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String desc;
        desc = fmt.format(cost )+ "\t" + tracks + "\t";
        desc += title +"\t"+artist;
        return desc;
    }

    @Override
    public int compareTo(CD o) {
        if(title != null && o != null){
            return title.compareTo(o.title);
        }
        return 0;

    }
}
