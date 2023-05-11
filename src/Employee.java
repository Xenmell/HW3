public class Employee extends Person {
    private String education;
    private int salary;

    public Employee(String name, String surname, int age, String education, int salary) {
        super(name, surname, age);
        this.education = education;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", образование: " + education +
                ", зарплата: " + salary + "\n";
    }
}
