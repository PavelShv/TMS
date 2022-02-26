package MilitaryOffice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Person {

    private String name;
    private int age;
    private String sex;
    private Address address;


}
