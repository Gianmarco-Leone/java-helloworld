import model.Person;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World, nice to meet you");

        Person johnny = new Person("johnny", "smith", LocalDate.of(2000, 11, 1));
        System.out.format("The person first name is: %s.", johnny.getFirstName());
        johnny.setLastName("smith");
        System.out.format("The person last name is: %s.", johnny.getLastName());
        johnny.setDob(LocalDate.of(1969, 3, 23));
        System.out.format("The person date of birth is: %s.", johnny.getDob());
    }
}
