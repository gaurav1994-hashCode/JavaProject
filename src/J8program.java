import java.util.*;

public class J8program {


    public Optional<String> getUserName(Integer id){
        String name = null;
        if(id==1){
           name ="Gaurav";
        } else if (id==2) {
            name = "Reva";
        } else if (id==3) {
            name =  "aaji";
        }else name = "nothing";

        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {
       /* ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);*/

       /* for (int i=1;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
            //System.out.println("hi "+arrayList.get(0));//
        }*/

       /* for (Integer i : arrayList) {
            System.out.println(i);
        }
*/

/*
        StringJoiner stringJoiner = new StringJoiner("_");
        stringJoiner.add("gaurav");
        stringJoiner.add("Chimote");

        System.out.println(stringJoiner);*/


       /* StringJoiner stringJoiner = new StringJoiner("_","(",")");
        stringJoiner.add("gaurav");
        stringJoiner.add("Chimote");

        System.out.println(stringJoiner);*/
        System.out.println("enter user id");
        Scanner scanner= new Scanner(System.in);
      int id = scanner.nextInt();

        J8program j8program= new J8program();
       /*java.lang.String name =j8program.getUserName(id);

       if(name!=null){ System.out.println(name.toUpperCase()+", hello");}
       else {
           System.out.println("hello");
       }*/

              Optional<String>  userName= j8program.getUserName(id);

              if(userName.isPresent()){
                String name=  userName.get();
                  System.out.println(name);
              }
              else {
                  System.out.println("no data found");
              }
    }
}
