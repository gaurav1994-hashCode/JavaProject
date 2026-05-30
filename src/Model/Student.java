package Model;

import lombok.Data;

@Data
public class Student {
    String id;
    String name;
    Integer rollNo;
    public Student(String id,String name,Integer rollNo){
        this.id=id;
        this.name=name;
        this.rollNo=rollNo;

    }

}
