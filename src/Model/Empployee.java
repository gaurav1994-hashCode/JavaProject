package Model;

import lombok.Data;

@Data
public class Empployee {
    String eName;
    String dept;
    String location;

    public Empployee(String eName, String dept, String location) {
        this.eName = eName;
        this.dept = dept;
        this.location = location;
    }
}
