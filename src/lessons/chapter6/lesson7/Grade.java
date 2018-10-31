package lessons.chapter6.lesson7;

public class Grade {
    private String gradeLetter = "N/A";
    private double gradeCuttoff = 0;

    public Grade(String gradeLetter, double gradeCuttoff) {
        this.gradeLetter = gradeLetter;
        this.gradeCuttoff = gradeCuttoff;
    }

    public String getGradeLetter() {
        return gradeLetter;
    }

    public double getGradeCuttoff() {
        return gradeCuttoff;
    }

}
