import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class JavaProgramImportant implements Comparator<Integer> {


    @Override
    public int compare(Integer i1,Integer i2){
        if(i1>i2) return -1;
        else return 1;
    }

    public static void main(String[] args) {

        ArrayList <Integer> a1 = new ArrayList<>();
        a1.add(4);
        a1.add(3);
        a1.add(1);
        a1.add(5);

      Collections.sort(a1, new JavaProgramImportant());

        System.out.println(a1);

/*
        System.out.println("before sort"+a1);
        Collections.sort(a1,((i1,i2)->(i1>i2)?-1:1));
        System.out.println("after sort"+a1);
        Collections.sort(a1,((i1,i2)->(i1>i2)?1:-1));
        System.out.println("after sort"+a1);*/


        //Collections.sort(a1,(i1,i2)->(i1>i2)?-1:1);

    }



}
