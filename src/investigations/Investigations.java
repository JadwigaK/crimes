package investigations;

import java.util.*;

/**
 * Created by Jadwiga on 2016-10-12.
 */
public class Investigations {
    private Map<String, List<Person>> investigations = new TreeMap<String, List<Person>>();

    public void addAllPeople(String invest, List<Person> people){
        if (investigations.containsKey(invest)){
            investigations.merge(invest,people,(people1, people2) -> addTwoList(people1,people2));
        } else {
            investigations.putIfAbsent(invest, people);
        }
    }

    public List<Person> addTwoList(List<Person> people1, List<Person> people2){
        people1.addAll(people2);
        return people1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String s : investigations.keySet()){
            sb.append("Investigation name: "+ s + " People: "+investigations.get(s));
        }
        return sb.toString();
    }
}
