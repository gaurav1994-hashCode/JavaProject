package Model;

import lombok.Data;

@Data
public class Teachers {
    String id;
    String name;
    Integer Salary;
    String dept;
    String location;
    String gender;
    Integer age;

    public Teachers(String id, String name, Integer salary, String dept, String location, String gender, Integer age) {
        this.id = id;
        this.name = name;
        Salary = salary;
        this.dept = dept;
        this.location = location;
        this.gender = gender;
        this.age = age;
    }
}
