package investigations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by Jadwiga on 2016-10-14.
 */
public class Reader {


    static private PersonBuilder personBuilder = new PersonBuilder();

    static BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

    public static void welcome() {
        System.out.println("Good morning!");
    }

    public static Person readPerson() throws IOException {
        System.out.println("You are adding new person.");
        Person person = personBuilder.setName(readName())
                .setSurname(readSurname()).setAge(readAge()).setAddress(readAddress())
                .setSex(readSex()).setChild(readChildren()).setSomethingElse(readSomethingElse()).build();
        return person;
    }

    public  static String readName() throws IOException {
        System.out.println("What is the name?");
        String in = bufferRead.readLine();
        return in;
    }

    public  static String readSurname() throws IOException {
        System.out.println("Surname?");
        String in = bufferRead.readLine();
        return in;
    }

    public  static String readAge() throws IOException {
        System.out.println("Age?");
        String in = bufferRead.readLine();
        return in;
    }

    public  static String readAddress() throws IOException {
        System.out.println("Address?");
        String in = bufferRead.readLine();
        return in;
    }

    public  static String readSex() throws IOException {
        System.out.println("Sex? (female/male)");
        String in = bufferRead.readLine();

        if (in.equals("female")) {
            System.out.println("Maiden name?");
            String in1 = bufferRead.readLine();
            personBuilder.setMaidenName(in1);
        }
        return in;
    }

    public static Map<String, String> readChildren() throws IOException {
        System.out.println("Any children? (in not write no if yes give 'name1 age1, name2 age2,...')");
        String in = bufferRead.readLine();
        Map<String, String> parsedChildren = null;
        if (!in.equals("no")) {
            parsedChildren = Parser.parseChildren(in);
        }
        return parsedChildren;
    }

    public static String readSomethingElse() throws IOException {
        System.out.println("Anything else? (height, weight, additional characteristic - separate by coma)");
        String in = bufferRead.readLine();
        return in;
    }


    public static String readInvestigation() throws IOException {
        System.out.println("Add investigation name:");
        String in = bufferRead.readLine();
        return in;
    }
}
