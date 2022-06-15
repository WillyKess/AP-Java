public class CollegeStudent extends Student {
    private String major;
    private int year;

    public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, int year,
            String major) {
        super(myName, myAge, myGender, myIdNum, myGPA);
        this.major = major;
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}