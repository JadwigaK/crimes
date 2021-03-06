package investigations;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jadwiga on 2016-10-12.
 */
public class PersonBuilder {
    private String name;
    private String surname;
    private String age;
    private String address;

    private String sex ="";
    private String maidenName="";

    private Map<String,String> children = new HashMap<String, String>();
    private Map<String,String> features = new HashMap<String, String>();

    public PersonBuilder setName(String name){
        this.name=name;
        return this;
    }

    public PersonBuilder setSurname(String surname){
        this.surname=surname;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address=address;
        return this;
    }

    public PersonBuilder setAge(String age) {
        this.age=age;
        return this;
    }

    public PersonBuilder setFeature(String featureName, String featureValue){
        this.features.put(featureName, featureValue);
        return this;
    }

    public PersonBuilder setSex(String sex){
        this.sex=sex;
        return this;
    }

    public PersonBuilder setMaidenName(String maidenName) {
        if ("male".equals(sex)){
            throw new IllegalArgumentException("Man has not maiden name!!!");
        }
        this.maidenName=maidenName;
        return this;
    }

    public PersonBuilder setChildren(Map<String, String> children){
        if (children.values().contains(null)){
            throw new IllegalArgumentException("Provide age of all children!");
        }
        this.children=children;
        return this;
    }

    public Person build() {
        Person personOut = new Person(name, surname, age, address);

        if (name.equals(null) || name.equals("") || surname.equals(null) ||surname.equals("") || age.equals(null) ||age.equals("") || address.equals(null) || address.equals("")) {
            throw new IllegalStateException("Name, surname, age or address required!!!");
        }

            if (!features.equals(null)) {
                personOut.setFeatures(features);
            }

            if (!sex.equals("")) {
                personOut.setSex(sex);
            }
            if (!maidenName.equals("")) {
                personOut.setMaidenName(maidenName);
            }
            if (!children.equals(null)) {
                personOut.setChildren(children);
            }
            return personOut;
        }


}
