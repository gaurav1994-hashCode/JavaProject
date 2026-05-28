package Model;

import lombok.Data;

import java.util.Date;
import java.util.Objects;

@Data
public class Person {
    String id;
    String personName;
     Integer age;

public Person(String id,String personName,Integer age){
    this.id=id;
    this.personName=personName;
    this.age=age;
}


public void setId(String id){
    this.id=id;

}

public void setPersonName(String personName){
    this.personName=personName;

}
    public  void setAge(Integer age){

    this.age=age;
    }
public String getId(){
    return id;

}

public String getPersonName(){

    return personName;
}
    public Integer getAge(){
    return age;

    }




}
