import java.util.Objects;

public class Director extends Person{
    private String taxNumber;
    private int revenue;

    public Director(String name, String surname, int age, String taxNumber, int revenue) {
        super(name, surname, age);
        this.revenue = revenue;
        this.taxNumber = taxNumber;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nИНН: " + taxNumber +
                ", Выручка: " + revenue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Director director = (Director) o;
        return revenue == director.revenue && Objects.equals(taxNumber, director.taxNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), taxNumber, revenue);
    }
}
