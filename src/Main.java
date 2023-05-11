import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Николай", "Сифонов", 20, "ПГУ", 20000),
                new Employee("Саня", "Подлый", 29, "ПНИПУ", 25000),
                new Employee("Марина", "Зебест", 49, "ПГТУ", 30000),
                new Employee("Авдотья", "Самурай", 29, "АГАОК", 10000),
                new Employee("Самбади", "Ванстолдми", 29, "Зе ВОРЛД", 50000)
        };

        Director[] directors = {
                new Director("Николай", "Сифонов", 20, "120-151-655", 200000),
                new Director("Саня", "Подлый", 29, "123-456-789", 250000),
                new Director("Марина", "Зебест", 48, "321-654-987", 300000),
                new Director("Авдотья", "Самурай", 27, "159-354-745", 100000),
                new Director("Самбади", "Ванстолдми", 19, "148-156-962", 500000)
        };

        List<Business> businesses = new ArrayList<>();
        businesses.add(new Cafe("Пальчики откусим", directors[1], employees, "Полевая, 10", "Пальчики"));
        businesses.add(new Shop("Пальчики приделаем", directors[3], employees, "Саратовская, 101", "Деревяшки, одёжки"));
        businesses.forEach(System.out::println);

    }
}

