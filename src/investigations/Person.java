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

    private String sex ="";
    private String maidenName="";


    private String weight="";
    private String height="";
    private String additionalCharacteristic="";

    private Map<String,String> children = new HashMap<String, String>();

    public Person() {}

    public Person(String name, String surname, String age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }


    public void setName(String name) {
        this.name=name;
    }


    public void setSurname(String surname) {
        this.surname=surname;
    }

    public void setAge(String age) {
        this.age=age;
    }

    public void setAddress(String address) {
        this.address=address;
    }

    public void setWeight(String weight) {
        this.weight=weight;
    }


    public void setHeight(String height) {
        this.height =height;
    }

    public void setAdditionalCharacteristic(String addCh) {
        this.additionalCharacteristic=addCh;
    }

    public void setChild(Map<String, String> children) {
        this.children =children;
    }

    public void setSex(String sex) {
        this.sex=sex;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName=maidenName;
    }

    public String toString(){
        return "Person: "+ name +" "+ surname+" "+age+ " "+address+" "+sex+" "+ maidenName+" " +children + " " + weight + " "+ height + " "+ additionalCharacteristic;
    }

    public String getWeight() {
        return this.weight;
    }

    public String getHeight() {
        return this.height;
    }

    public String getAdditionalCharacteristic() {
        return this.additionalCharacteristic;
    }

    public String getSex() {
        return this.sex;
    }

    public String getMaidenName() {
        return this.maidenName;
    }

    public Map<String, String> getChildren(){
        return this.children;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }


}
