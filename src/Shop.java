import java.util.List;
import java.util.Objects;

public class Shop extends Business {
    private String products;

    public Shop(String name, Director director, Employee[] employeeList, String address, String products) {
        super(name, director, employeeList, address);
        this.products = products;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return super.toString() + "\nТовары: " + products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Shop shop = (Shop) o;
        return Objects.equals(products, shop.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), products);
    }
}
