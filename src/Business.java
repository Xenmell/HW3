import java.util.Arrays;
import java.util.Objects;

public class Business {
    private String name;
    private Director director;
    private Employee[] employees;
    private String address;

    public Business(String name, Director director, Employee[] employeeList, String address){
        this.name = name;
        this.director = director;
        this.employees = employeeList;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\n\nБизнес: " + name +
                "\nВладелец: " + director.toString() +
                "\nСотрудники: " + Arrays.toString(employees) +
                "\nАдрес: " + address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Business business = (Business) o;
        return Objects.equals(name, business.name) && Objects.equals(director, business.director) && Objects.equals(employees, business.employees) && Objects.equals(address, business.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, director, employees, address);
    }
}
