package lessons.chapter7.lesson3;

public class Book extends Reading{
    @Override
    public int getPageCount() {
        return 512;
    }

    @Override
    public String[] getAuthors() {
        return new String[]{"Steven McBookFace"};
    }

    @Override
    public String getTitle() {
        return "Turn me into a movie";
    }
}
