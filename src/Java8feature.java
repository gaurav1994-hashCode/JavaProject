import Model.Empployee;
import Model.Person;

import javax.print.attribute.standard.RequestingUserName;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8feature{

    //public static void main(String[] args) {
        /*ArrayList a = new ArrayList();
        a.add(123);
        a.add("123");
        System.out.println("1st"+a);
        a.remove(1);
        System.out.println("2nd"+a);
        a.add("1234");
        System.out.println("3rd"+a);*/

        /*LinkedList linkedList= new LinkedList();

        linkedList.add(123);
        linkedList.add("12344");
        System.out.println(linkedList);
        linkedList.remove();
        System.out.println(linkedList);
        linkedList.remove(0);
        linkedList.add(null);
        System.out.println(linkedList);
        linkedList.add(0,"java");
        System.out.println(linkedList);
        linkedList.set(0,"gaurav");
        System.out.println(linkedList);*/

        /*LinkedList<String> linkedList= new LinkedList<>();
        linkedList.add(new String("GauReva"));
        System.out.println(linkedList);
        System.out.println(linkedList.size());*/



        /*Vector<String> vector= new Vector<>();
        vector.add("GauReva");
        vector.add(new String("gaurav"));
        System.out.println(vector);
        System.out.println(vector.size());*/


        /*Stack<Double> stack= new Stack<>();
        stack.add(20.2);
        stack.push(10.01);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.peek();
        System.out.println(stack);*/

      /*  ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("11");
        arrayList.add("12");
        arrayList.add("13");

       java.util.Iterator<String> iterator =arrayList.iterator();
       while (iterator.hasNext()){
          java.lang.String s = iterator.next();
           System.out.println(s);
       }
       java.util.ListIterator<String>  listIterator =arrayList.listIterator();
       while (listIterator.hasNext()){
       java.lang.String s =listIterator.next();
           System.out.println(s);
       }*/

       /* Vector<String> vector= new Vector();
        vector.add("123");
        vector.add("1234");

       java.util.Enumeration elements =vector.elements();
       while (elements.hasMoreElements()){
           System.out.println(elements.nextElement());
       }*/
       /* HashSet<Integer> hashSet = new HashSet();
        hashSet.add(123);
        hashSet.add(1234);
        System.out.println(hashSet.size());
        for (Integer i:hashSet){
            System.out.println(i);

        }*/

        // comparator and comparable remain


        /*HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(1, "reva");
        hashMap.put(2, "Gaurav");
        System.out.println(hashMap.size());
        System.out.println(hashMap);
        System.out.println(hashMap.keySet());
        Set<Integer> i = hashMap.keySet();
        System.out.println(i);
        System.out.println(hashMap.values());
        Collection<String> s = hashMap.values();
        System.out.println(s);
        Set<?> s1 = hashMap.entrySet();
        System.out.println(s1);
        boolean containsKey = hashMap.containsKey(1);
        System.out.println(containsKey);*/


        /*Hashtable<String,Integer> hashtable= new Hashtable();
        hashtable.put("Reva",200);
        hashtable.put("Gaurav",100);
      java.util.Enumeration elements = hashtable.elements();
      while (elements.hasMoreElements()){
          System.out.println(elements.nextElement());
      }

      java.util.Enumeration enumeration =hashtable.keys();
      while (enumeration.hasMoreElements()){
          System.out.println(enumeration.nextElement());
      }

        Set<String> enumeration1 =hashtable.keySet();
        System.out.println(enumeration1);*/

       // e->e.getName();

/*Java8feature java8feature =new Java8feature();
java8feature.m1();*/

      /* Predicate <Integer> p  = i->i>10;
        System.out.println(p.test(11));//true false
*/

       /* String [] names = {"Reva","Gaurav","vivek","vimal","nilu aai"};
        Predicate<String> predicate= p->p.charAt(0)=='v';

        for (String name :names){

            //System.out.println( predicate.test(name));//res   false false false false  true
            if (predicate.test(name)){

                System.out.println(name);
            }


        }*/


       /* Person person= new Person("123","gaurav",11);
        Person person1= new Person("123","vivek",11);
        Person person2= new Person("123","vimal",11);
        Person person3= new Person("123","Nilu",11);
        Person person4= new Person("123","Reva",11);
        Person person5= new Person("123","Suresh",11);
        Person person6= new Person("123","shatakshi",11);

        List<Person> personList=Arrays.asList(person,person1,person2,person3,person4,person5,person6);
        *//*Predicate<Person> predicate= p->p.getAge()>=3;
*//*
        *//*Predicate<Person> predicate1 = p->p.getPersonName().equalsIgnoreCase("gaurav");*//*
        Predicate<Person> predicate=p->p.getPersonName().startsWith("v");


        for (Person p:personList){

            if(predicate.test(p)){

                System.out.println("this person  "+p.getPersonName());
            }
        }
*/


       /* Empployee empployee1= new Empployee("Gaurav","physics","amt");
        Empployee empployee2= new Empployee("Vivek","physics","Nag");
        Empployee empployee3= new Empployee("Reva","physics","pune");
        Empployee empployee4= new Empployee("Gaurav","physics","amt");
        Empployee empployee5= new Empployee("Gaurav","physics","amt");

        java.util.List<Empployee> empployeeList =Arrays.asList(empployee1,empployee2,empployee3,empployee4,empployee5);
        Predicate<Empployee> predicate=p->p.getEName().startsWith("R");
        Predicate<Empployee> predicate1=p->p.getLocation().equalsIgnoreCase("pune");
        Predicate<Empployee> predicate2=predicate.and(predicate1);

        for(Empployee empployee:empployeeList){
            if(predicate2.test(empployee)){
                System.out.println(empployee.getEName() +"  " +empployee.getLocation());

            }

        }*/


       /* Supplier<String> s=()->{
          String otp = "";
          for(int i=1;i<=6;i++){
              otp=otp+ (int)(Math.random()*10);
          }
          return otp;
        };
        System.out.println(s.get());*/


        /*Function<String,Integer> function=(namw)->namw.length();
        System.out.println( function.apply("gaurav"));
*/


        /*for (int i=1;i<=10;i++){
            System.out.println(" no prints "+i);

        }*/


       /* Runnable r=()->{
          for(int i=1;i<2;i++){

              System.out.println(i);
          }

        };

        Thread thread=new Thread(r);
        thread.start();*/







  //  }



    /*public  class Thread234 implements Runnable{
        @Override
        public void run(){

            for(int i=1;i<=10;i++){
                System.out.println(i);

            }
        }

        public  void main(String[] args) {
            Thread234 thread12= new Thread234();
            Thread thread= new Thread(thread12);
            thread.start();


        }
    }*/

   /* @Override
    public void m1() {
        System.out.println("this is my interface");
    }*/
}
