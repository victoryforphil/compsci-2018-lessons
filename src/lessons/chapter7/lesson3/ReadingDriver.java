package lessons.chapter7.lesson3;

import lessons.chapter7.lesson2.*;

import java.util.ArrayList;
import java.util.List;

public class ReadingDriver {
    public static List<Reading> readings = new ArrayList<>();
    public static void main (String[] args){
        readings.add(new Book());
        readings.add(new Journal());
        readings.add(new Newspaper());
        readings.add(new Textbook());

        for(Reading e : readings){
            System.out.println("Reading: " + e.getTitle() + " \t " + e.getAuthors()[0] + "\t" + e.getPageCount() + " pages");


        }
    }
}
//Output
/*
Reading: Turn me into a movie 	 Steven McBookFace	512 pages
Reading: Journal of stuff i dont get 	 Ruiz	1111 pages
Reading: Please buy us fake news 	 CNN	1111 pages
Reading: How to make something actually useful 	 Elon Musk	1111 pages


 */