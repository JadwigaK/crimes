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

//        to dodawanie addAllPeople działa git.
//        List<Person> listOfPeople2 = new LinkedList<Person>();
//        Person person2 = new Person ("A", "N", "K", "R");
//        Person person3 = new Person ("Aa", "Na", "Ka", "Ra");
//        listOfPeople2.add(person2);
//        listOfPeople2.add(person3);


        String inv1 = Reader.readInvestigation();
        Investigations investigations = new Investigations();

        investigations.addAllPeople(inv1, listOfPeople);
       // investigations.addAllPeople(inv1, listOfPeople2);

        System.out.println(investigations.toString());
    }
}
