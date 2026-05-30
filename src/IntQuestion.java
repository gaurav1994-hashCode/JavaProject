import Model.Person;
import Model.Teachers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class IntQuestion {

    public static void main(String[] args) {

       /* Teachers t1 = new Teachers("T101", "Rahul Sharma", 50000, "Math", "Pune", "Male", 35);
        Teachers t2 = new Teachers("T102", "Anjali Verma", 55000, "Science", "Mumbai", "Female", 32);
        Teachers t3 = new Teachers("T103", "Vikas Mehta", 60000, "Math", "Delhi", "Male", 40);
        Teachers t4 = new Teachers("T104", "Sneha Patil", 52000, "History", "Nagpur", "Female", 29);
        Teachers t5 = new Teachers("T105", "Amit Joshi", 58000, "Math", "Bangalore", "Male", 38);

       java.util.List<Teachers> teachersList = Arrays.asList(t2,t1,t2,t5,t4,t3);*/


       /*java.util.Optional<Teachers> max =teachersList.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.getAge())));
        System.out.println(max.get().getAge());
        System.out.println(max.get());*/

       /* java.util.Optional<Teachers> max =teachersList.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.getSalary())));
        System.out.println(max.get().getSalary());*/

      /* java.util.Optional<Teachers> min = teachersList.stream().collect(Collectors.minBy(Comparator.comparing(e->e.getSalary())));
        System.out.println(min.get().getSalary());
        System.out.println(min.get());*/

     /* Double aDouble =teachersList.stream().collect(Collectors.averagingDouble(e-> e.getAge()));
        System.out.println(aDouble);*/

        //Map<String, List<Teachers>> collect = teachersList.stream().collect(Collectors.groupingBy(e -> e.getDept()));

        //System.out.println(collect);
       /* Set<Map.Entry<String, List<Teachers>>> entries = collect.entrySet();
               for(Map.Entry<String,List<Teachers>> listEntry :collect.entrySet()){
                    java.lang.String dept =listEntry.getKey();
                  // System.out.println(dept);

                   List<Teachers> teachers=listEntry.getValue();
                  *//* for(Teachers teachers1:teachers){
                      // System.out.println(dept+"-"+teachers1.);
                     //  System.out.println(dept+"-"+teachers1.getName());
                       System.out.println(dept+"-"+teachers1.getName()+"_"+teachers1.getAge());
                   }*//*

                   //finding avg salary of each dept

                   java.lang.Double aDouble =teachers.stream().collect(Collectors.averagingDouble(e->e.getSalary()));
                   System.out.println("department |"+dept+"-"+"Avg salary | "+aDouble);
*/

                   /*ObjectMapper mapper = new ObjectMapper();

                   String json = mapper.writerWithDefaultPrettyPrinter()
                           .writeValueAsString(result);

                   System.out.println(json);*/


        //}


        //question
        Teachers t1 = new Teachers("T101", "Rahul Sharma", 50000, "Math", "Pune", "Male", 35);
        Teachers t2 = new Teachers("T102", "Anjali Verma", 55000, "Science", "Mumbai", "Female", 32);
        Teachers t3 = new Teachers("T103", "Vikas Mehta", 60000, "Math", "Delhi", "Male", 40);
        Teachers t4 = new Teachers("T104", "Sneha Patil", 52000, "History", "Nagpur", "Female", 29);
        Teachers t5 = new Teachers("T105", "Amit Joshi", 58000, "Math", "Bangalore", "Male", 38);

        java.util.List<Teachers> teachersList = Arrays.asList(t2, t1, t2, t5, t4, t3);

       /* java.util.Map<String,Double> doubleMap =teachersList.stream().filter(t->t.getDept().equalsIgnoreCase("Math")).collect(Collectors.groupingBy(Teachers::getGender,Collectors.averagingDouble(t->t.getSalary())));
        System.out.println(doubleMap);*/

       /* java.util.Map<String,Long>doubleMap =teachersList.stream().filter(t->t.getDept().equalsIgnoreCase("Math")).collect(Collectors.groupingBy(t->t.getGender(),Collectors.counting()));
        System.out.println(doubleMap);*/

        //teachersList.stream().collect(Collectors.groupingBy(t->t.getGender(),Collectors.counting()));
        /*Map<String,Long> doubleMap=teachersList.stream().collect(Collectors.groupingBy(Teachers::getGender,Collectors.counting()));

        System.out.println(doubleMap);*/

       /* Stream<String> distinct = teachersList.stream().map(t->t.getDept()).distinct();
        Stream<String> distinct = teachersList.stream().map(Teachers::getDept).distinct();
        distinct.forEach(s-> System.out.println(s));*/

      /* java.util.Map<String,Double> doubleMap =teachersList.stream().collect(Collectors.groupingBy(Teachers::getGender,Collectors.averagingDouble(Teachers::getAge)));
        System.out.println(doubleMap);*/
        /*java.util.Optional<Teachers> optionalTeachers = teachersList.stream().collect(Collectors.maxBy(Comparator.comparing(Teachers::getSalary)));
        if (optionalTeachers.isPresent()) {
            Model.Teachers teachers = optionalTeachers.get();
            System.out.println(teachers.getName());
            System.out.println(teachers);*/


        /* teachersList.stream().filter(t->t.getAge()>30).map(t->t.getName()).forEach(t-> System.out.println(t));
         */



/*java.util.Map<String,Double> doubleMap =teachersList.stream().collect(Collectors.groupingBy(Teachers::getDept,Collectors.averagingDouble(Teachers::getSalary)));
        System.out.println(doubleMap);*/
  /*java.util.Optional<Teachers> optionalTeachers =teachersList.stream().filter(t->t.getGender().equals("Male") && t.getDept().equals("Math")).min(Comparator.comparing(t->t.getAge()));

       if (optionalTeachers.isPresent()){
          Model.Teachers teachers = optionalTeachers.get();
           System.out.println(teachers);
           System.out.println(teachers.getName());
       }*/


        /*java.util.Optional<Teachers> optionalTeachers = teachersList.stream().collect(Collectors.minBy(Comparator.comparing(Teachers::getAge)));
        if (optionalTeachers.isPresent()) {
            Model.Teachers teachers = optionalTeachers.get();
            System.out.println(teachers.getName());
            System.out.println(teachers);*/

        /*java.util.Optional<Teachers> first = teachersList.stream().sorted(Comparator.comparing(Teachers::getSalary).reversed()).skip(1).findFirst();
        if (first.isPresent()) {
            System.out.println("descenind |" + first.get());
        }

        java.util.Optional<Teachers> first1 = teachersList.stream().sorted(Comparator.comparing(Teachers::getSalary)).skip(1).findFirst();
        if (first1.isPresent()) {
            System.out.println("ascending |" + first1.get());
        }*/

//       java.util.stream.Stream<Teachers> sorted = teachersList.stream().sorted(Comparator.comparing(Teachers::getSalary));
//       // sorted.forEach(s-> System.out.println(s.getSalary()));
//        //sorted.forEach(s-> System.out.println(s));
//        sorted.forEach(s-> System.out.println(s.getName()));

        /*java.util.List<Teachers> list =teachersList.stream().sorted(Comparator.comparing(Teachers::getSalary)).collect(Collectors.toList());
        System.out.println(list.get(1));
        System.out.println(list);
        System.out.println(list.get(3));*/

    }
}


