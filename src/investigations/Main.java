package investigations;


import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jadwiga on 2016-10-12.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Reader.welcome();
        Person person1 = Reader.readPerson();
        List<Person> listOfPeople = new LinkedList<Person>();
        listOfPeople.add(person1);

        String inv1 = Reader.readInvestigation();
        Investigations investigations = new Investigations();
        investigations.addAllPeople(inv1, listOfPeople);

        System.out.println(investigations.toString());
    }
}
