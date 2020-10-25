package person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkWithPersons {
    private final List<Person> personList = new ArrayList<>();

    public WorkWithPersons(List<Person> personList) {
        if (personList != null) {
            this.personList.addAll(personList);
        }
    }

    public List<String> personNames() {
        List<String> names = new ArrayList<>();
        for (Person person : personList) {
            names.add(person.getName());
        }
        return names;
    }

    public Map<String, Integer> mapNameToAge() {
        Map<String, Integer> nameToAge = new HashMap<>();

        for (Person person : personList) {
            nameToAge.put(person.getName(), person.getAge());
        }
        return nameToAge;
    }

    public List<Person> extractPersons (int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() > age) {
                result.add(person);
            }
        }
        return result;
    }

    public Map<String, List<String>> mapFromColourToName() {
        Map<String, List<String>> map = new HashMap<>();

        for (Person person : personList) {
            List<String> names = map.get(person.getHairColour());
            if (names == null) {
                names = new ArrayList<>();
                map.put(person.getHairColour(), names);
            }
            names.add(person.getName());
        }
        return map;
    }

    public Map<Integer, List<Person>> mapFromAgeToPerson() {
        Map<Integer, List<Person>> map = new HashMap<>();

        for (Person person : personList) {
            List<Person> personList = map.get(person.getAge());
            if (personList == null) {
                personList = new ArrayList<>();
                map.put(person.getAge(), personList);
            }
            personList.add(person);
        }
        return map;
    }

    public void print() {
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
