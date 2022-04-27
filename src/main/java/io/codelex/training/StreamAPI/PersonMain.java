package io.codelex.training.StreamAPI;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class PersonMain {
    public static void main(String[] args) {
        List<Person> employee = new ArrayList<>();

        Person firstPerson = new Person("Janis", "Vanags", 18, BigDecimal.valueOf(180.00));
        Person secondPerson = new Person("Andris", "Berzins", 23, BigDecimal.valueOf(200.00));
        Person thirdPerson = new Person("Ieva", "Loka", 45, BigDecimal.valueOf(590.00));
        Person fourthPerson = new Person("Juris", "Biezins", 36, BigDecimal.valueOf(340.00));
        Person fifthPerson = new Person("Liga", "Skulme", 24, BigDecimal.valueOf(790.00));
        Person sixstPerson = new Person("Zane", "Grieta", 27, BigDecimal.valueOf(890.00));
        Person seventhPerson = new Person("Ivars", "Namejs", 32, BigDecimal.valueOf(456.00));

        employee.add(firstPerson);
        employee.add(secondPerson);
        employee.add(thirdPerson);
        employee.add(fourthPerson);
        employee.add(fifthPerson);
        employee.add(sixstPerson);
        employee.add(seventhPerson);


        List<String> names = employee.stream()
                .map(Person::getName).toList();
        System.out.println(names);

        BigDecimal newNumber = new BigDecimal(200);
        BigDecimal numberForMuliply = new BigDecimal(20);
        BigDecimal money = employee.stream()
                .filter(cash -> cash.getMoneyInBank().compareTo(newNumber) > 0)
                .map(cash -> cash.getMoneyInBank().multiply(numberForMuliply))
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
        System.out.println(money);


        List<Person> numbers = employee.stream()
                .filter(person -> person.getAge() > 20).toList();

        BigDecimal calc = employee.stream()
                .map(Person::getMoneyInBank)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        numbers.forEach(System.out::println);
        System.out.println(calc);

        List<Person> newPerson = employee.stream().toList();
        newPerson.forEach(System.out::println);
    }

}
