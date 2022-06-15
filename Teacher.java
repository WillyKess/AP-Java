public class Teacher extends Person {
    public Teacher(String myName, int myAge, String myGender, String subject, double salary) {
        super(myName, myAge, myGender);
        this.subject = subject;
        this.salary = salary;
    }

    private String subject;
    private double salary;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: " + salary;
    }
}