package MilitaryOffice;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {

        this.personRegistry = personRegistry;
    }


    public Person[] getRecruits() {
//        List<Person> recruits = personRegistry.getRecruits();
//        List<String> result = new ArrayList<>();
//        for (Person recruit : recruits) {
//            result.add(recruit.getName());
//                    }
        return personRegistry.getRecruits();
    }

    public int getCountRecruits() {
        return personRegistry.getRecruits().length;

    }

    public List<Person> getRecruitsByAddress(String city) {
        Person[] recruits = personRegistry.getRecruits();
        List<Person> result = new ArrayList<>();
        for (Person recruit : recruits) {
            if (recruit != null && recruit.getAddress().getCity().equals(city)) {
                result.add(recruit);

            }
        }
        return result;
    }
}