import Model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class J8Programs {


    public static void main(String[] args) {

        Person person = new Person("11", "Gaurav", 45);
        Person person1 = new Person("10", "Reva", 40);
        Person person2 = new Person("12", "Dadu", 40);
        Person person3 = new Person("13", "vimal", 43);


        java.util.List<Person> personList = Arrays.asList(person1, person2, person3, person);

      /*java.lang.Boolean b = personList.stream().anyMatch(p->p.getPersonName().equalsIgnoreCase("Reva"));

        System.out.println(b);*///nothing

       /* java.lang.Boolean b =personList.stream().anyMatch(p-> p.getPersonName().equals("Gaurav"));
        System.out.println("hi   "+b);
        java.lang.Boolean b1 =personList.stream().allMatch(p-> p.getPersonName().equals("Gaurav"));
        System.out.println("hi   "+b1);
        java.lang.Boolean b2 =personList.stream().noneMatch(p-> p.getPersonName().equals("Gaurav"));
        System.out.println("hi   "+b2);*/

       /* java.util.Optional<Person> first = personList.stream().filter(p -> p.getPersonName().equals("vimal")).findFirst();
        if (first.isPresent()) {
            System.out.println(first.get());
        }*/

        /*java.util.Optional<Person> first = personList.stream().filter(p -> p.getPersonName().equals("vimal")).findAny();
        if (first.isPresent()) {
            System.out.println(first.get());
        }*/



     /* List <Person> personList1 = personList.stream().filter(p->p.getAge().equals(40)).collect(Collectors.toList());

        personList1.forEach(p-> System.out.println(p));*/

        /*List <String> personList1 = personList.stream().filter(p->p.getAge().equals(40)).map(p->p.getPersonName()).collect(Collectors.toList());

        personList1.forEach(p-> System.out.println(p));*/

    }


}

