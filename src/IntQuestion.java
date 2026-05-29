import Model.Person;
import Model.Teachers;

import java.util.*;
import java.util.stream.Collectors;


public class IntQuestion {

    public static void main(String[] args) {

        Teachers t1 = new Teachers("T101", "Rahul Sharma", 50000, "Math", "Pune", "Male", 35);
        Teachers t2 = new Teachers("T102", "Anjali Verma", 55000, "Science", "Mumbai", "Female", 32);
        Teachers t3 = new Teachers("T103", "Vikas Mehta", 60000, "Math", "Delhi", "Male", 40);
        Teachers t4 = new Teachers("T104", "Sneha Patil", 52000, "History", "Nagpur", "Female", 29);
        Teachers t5 = new Teachers("T105", "Amit Joshi", 58000, "Math", "Bangalore", "Male", 38);

       java.util.List<Teachers> teachersList = Arrays.asList(t2,t1,t2,t5,t4,t3);
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

        Map<String, List<Teachers>> collect = teachersList.stream().collect(Collectors.groupingBy(e -> e.getDept()));

        //System.out.println(collect);
        Set<Map.Entry<String, List<Teachers>>> entries = collect.entrySet();
               for(Map.Entry<String,List<Teachers>> listEntry :collect.entrySet()){
                    java.lang.String dept =listEntry.getKey();
                  // System.out.println(dept);

                   List<Teachers> teachers=listEntry.getValue();
                  /* for(Teachers teachers1:teachers){
                      // System.out.println(dept+"-"+teachers1.);
                     //  System.out.println(dept+"-"+teachers1.getName());
                       System.out.println(dept+"-"+teachers1.getName()+"_"+teachers1.getAge());
                   }*/

                   //finding avg salary of each dept

                   java.lang.Double aDouble =teachers.stream().collect(Collectors.averagingDouble(e->e.getSalary()));
                   System.out.println("department |"+dept+"-"+"Avg salary | "+aDouble);


                   /*ObjectMapper mapper = new ObjectMapper();

                   String json = mapper.writerWithDefaultPrettyPrinter()
                           .writeValueAsString(result);

                   System.out.println(json);*/


               }

    }
}
