import Model.Empployee;
import Model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamm {


    public static void main(String[] args) {

      /*  java.util.stream.Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        Stream<Integer> integerStreamm = integers.stream();*/


        List<Integer> integerList = Arrays.asList(1, 2, 3, 5);
        // for (Integer i:integerList){
           /* if(i>2){
                System.out.println(i);

            }*/

          /*Stream<Integer> integerStream= integerList.stream();
         Stream<Integer> integerStream1= integerStream.filter(a-> a>1);

            //System.out.println(integerStream1);//java.util.stream.ReferencePipeline$2@5b480cf9
        integerStream1.forEach(b-> System.out.println(b));*/

        //  integerList.stream().filter(i->i>1).forEach(i-> System.out.println(i));

       /* java.util.List<String> stringList=Arrays.asList("Gaurav","Reva");
        stringList.stream().filter(i->i.startsWith("R")).forEach(i-> System.out.println(i));*/

       /* Student s1 = new Student("1", "Reva", 101);
        Student s2 = new Student("3", "Guarav", 103);
        Student s3 = new Student("5", "Vivek", 111);
        Student s4 = new Student("1344", "aaju", 121);
        Student s5 = new Student("10", "Nilu", 141);

        java.util.List<Student> studentList = Arrays.asList(s1, s2, s3, s3, s4, s5);
        //  studentList.stream().filter(s->s.getRollNo()>1).forEach(s-> System.out.println(s));
        // studentList.stream().filter(s->s.getRollNo()>103).forEach(s-> System.out.println(s.getName()));
        //studentList.stream().filter(s -> s.getRollNo() >= 141).forEach(s -> System.out.println(s.getId()));
        //studentList.stream().filter(s->s.getName().startsWith("R") && s.getId().equalsIgnoreCase("1")).forEach(s-> System.out.println(s));
        studentList.stream().filter(s -> s.getId().equalsIgnoreCase("3")).filter(s -> s.getName().startsWith("G")).forEach(s -> System.out.println(s));
*/
        java.util.List<String> stringList = Arrays.asList("gaurav", "Reva", "vivel", "ankush");
        /*stringList.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
        stringList.stream().mapToInt(s -> s.length()).forEach(s -> System.out.println(s));*/

       // stringList.stream().filter(s->s.startsWith("g")).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));


       /* Empployee empployee= new Empployee("Gaurav","IT","pune");
        Empployee empployee1= new Empployee("Reva","MBA","Mubai");
        Empployee empployee2= new Empployee("Dadu","govt","delhi");
        java.util.List<Empployee> empployeeList =Arrays.asList(empployee,empployee1,empployee2);
        empployeeList.stream().filter(e->e.getEName().startsWith("D")).map(e->e.getLocation()+"-"+e.getDept()).forEach(e-> System.out.println(e));
 */

             /*  java.util.List<String> c1= Arrays.asList("a","b","c","d");
               java.util.List<String> c2 =Arrays.asList("a","d","e","f");
      java.util.List<List<String>> listList =Arrays.asList(c1,c2);
      Stream<String> stringStream =listList.stream().flatMap(s->s.stream());
        stringStream.forEach(s-> System.out.println(s));*/

        java.util.List<String> c1= Arrays.asList("a","a","c","d");
       // c1.stream().limit(1).forEach(c-> System.out.println(c));
        //c1.stream().skip(1).forEach(c-> System.out.println(" "+c));

        //c1.stream().distinct().forEach(s-> System.out.println(s));










    }

}



