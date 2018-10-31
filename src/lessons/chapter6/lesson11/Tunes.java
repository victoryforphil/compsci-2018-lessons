package lessons.chapter6.lesson11;

public class Tunes {
    public static void main(String[] args){
        CDCollection music = new CDCollection();
        music.addCD("By the Way", "Red Hot Chilli Peppers", 14.95, 10);
        music.addCD("Play", "Someone", 140.95, 5);
        music.addCD("Worst Song", "Best Artist", 1.95, 1);
        music.addCD("Best Song", "Worst Artist", 10.95, 8);

        System.out.println(music);

    }
}
