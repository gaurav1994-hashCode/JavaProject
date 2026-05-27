import java.util.*;

public class Java8feature {

    public static void main(String[] args) {
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
    }

}
