package lessons.chapter7.lesson3;

public class Textbook extends Reading{
    @Override
    public int getPageCount() {
        return 1111;
    }

    @Override
    public String[] getAuthors() {
        return new String[]{"Elon Musk", "Dean Kamen", "Mrs.Swing", "Not Steve Jobs"};
    }

    @Override
    public String getTitle() {
        return "How to make something actually useful";
    }
}
