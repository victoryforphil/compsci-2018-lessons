package lessons.chapter7.lesson3;

public class Journal extends Reading {
    @Override
    public int getPageCount() {
        return 1111;
    }

    @Override
    public String[] getAuthors() {
        return new String[]{"Ruiz"};
    }

    @Override
    public String getTitle() {
        return "Journal of stuff i dont get";
    }
}
