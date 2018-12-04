package lessons.chapter7.lesson3;

public class Newspaper extends Reading {
    @Override
    public int getPageCount() {
        return 1111;
    }

    @Override
    public String[] getAuthors() {
        return new String[]{"CNN"};
    }

    @Override
    public String getTitle() {
        return "Please buy us fake news";
    }
}
