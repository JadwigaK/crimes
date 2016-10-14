package investigations;

import java.util.Map;

/**
 * Created by Jadwiga on 2016-10-12.
 */
public class PersonBuilder {
    private Person person = new Person();

    public PersonBuilder setName(String name){
        person.setName(name);
        return this;
    }

    public PersonBuilder setSurname(String surname){
        person.setSurname(surname);
        return this;
    }

    public PersonBuilder setAddress(String address) {
        person.setAddress(address);
        return this;
    }

    public PersonBuilder setAge(String age) {
        person.setAge(age);
        return this;
    }

    public PersonBuilder setSomethingElse(String something){
        Map<String, String> parsedSomethingElse = Parser.parseSomentingElse(something);
        for (String s : parsedSomethingElse.keySet()) {
            if (s.equals("height")) {
                this.setHeigh(parsedSomethingElse.get(s));
            } else if (s.equals("weight")) {
                this.setWeight(parsedSomethingElse.get(s));
            } else if (s.equals("additional characteristic")) {
                this.setAdditionalCharacteristic(parsedSomethingElse.get(s));
            }
        }
        return this;
    }



    public PersonBuilder setWeight(String weight){
        person.setWeight(weight);
        return this;
    }

    public PersonBuilder setHeigh(String heigh){
        person.setHeight(heigh);
        return this;
    }

    public PersonBuilder setAdditionalCharacteristic(String addCh){
        person.setAdditionalCharacteristic(addCh);
        return this;
    }

    public PersonBuilder setSex(String sex){
        person.setSex(sex);
        return this;
    }

    public PersonBuilder setMaidenName(String maidenName) {
        person.setMaidenName(maidenName);
        return this;
    }

    public PersonBuilder setChild(Map<String, String> children){
        person.setChild(children);
        return this;
    }

    public Person build() {
        Person personOut = new Person (person.getName(), person.getSurname(), person.getAge(), person.getAddress());
        if (!person.getWeight().equals("")){
            personOut.setWeight(person.getWeight());
        }
        if (!person.getHeight().equals("")) {
            personOut.setHeight(person.getHeight());
        }
        if (!person.getAdditionalCharacteristic().equals("")) {
            personOut.setAdditionalCharacteristic(person.getAdditionalCharacteristic());
        }
        if (!person.getSex().equals("")) {
            personOut.setSex(person.getSex());
        }
        if (!person.getMaidenName().equals("")) {
            personOut.setMaidenName(person.getMaidenName());
        }
        if (!person.getChildren().equals(null)) {
            personOut.setChild(person.getChildren());
        }
        return personOut;
    }



}
