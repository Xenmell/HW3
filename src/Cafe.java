import java.util.List;
import java.util.Objects;

public class Cafe extends Business{

    private String menu;

    public Cafe(String name, Director director, Employee[] employeeList, String address, String menu) {
        super(name, director, employeeList, address);
        this.menu = menu;
    }


    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return super.toString() + "\nМеню: " + menu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cafe cafe = (Cafe) o;
        return Objects.equals(menu, cafe.menu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), menu);
    }
}
