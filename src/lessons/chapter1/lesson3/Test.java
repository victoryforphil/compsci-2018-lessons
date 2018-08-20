package lessons.chapter1.lesson3;

import java.util.Date;

/*
Written by Alex Carter
GTHS AP CompSci - Peroid 2

Lesson 1.3
*/
public class Test {
    private final static String   name = "Alex Carter";
    private final static Date     bday = new Date(2001,04,15);
    private final static String[] hobbies = {"Drone racing", "Gaming", "Swimming", "Programming", "Robotics"};
    private final static String   book = "Java Software Solutions"; // Yes this is on purpose :P
    private final static String   movie = "Martian";

    public static void main (String[] args){
        System.out.println("name: " + name);
        System.out.println("bday: " + bday.toString());
        System.out.println("hobbies: " + String.join(", ",hobbies));
        System.out.println("book: " + book.toString());
        System.out.println("movie: " + movie);
    }
}

/*
RESULTS:
- Compiled: Yes
- Console:
"name: Alex Carter
bday: Wed May 15 00:00:00 PDT 3901
hobbies: Drone racing, Gaming, Swimming, Programming, Robotics
book: Java Software Solutions
movie: Martian

Process finished with exit code 0"
*/