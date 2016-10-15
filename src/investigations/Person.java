package investigations;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jadwiga on 2016-10-12.
 */
public class Person {
    private String name;
    private String surname;
    private String age;
    private String address;

    private String sex;
    private String maidenName;

    private Map<String,String> children = new HashMap<String, String>();
    private Map<String,String> features = new HashMap<String, String>();

    public Person(String name, String surname, String age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public void setChildren(Map<String, String> children) {
        this.children =children;
    }

    public void setFeatures(Map<String, String> features) {
        this.features = features;
    }

    public void setSex(String sex) {
        this.sex=sex;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName=maidenName;
    }

    public String toString(){
        return "Person: "+ name +" "+ surname+" "+age+ " "+address+" "+sex+" "+ maidenName+" " +children + " "+features;
    }

}
