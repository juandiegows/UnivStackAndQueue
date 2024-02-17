
package com.juandiegows.univstackandqueue.model;

/**
 *
 * @author JuanDiegoWS
 */
public class Person {
    private String code;
    private String name;
    private String numberPhone;
    private int age;

    public Person() {
    }

    public Person(String code, String name, String numberPhone, int age) {
        this.code = code;
        this.name = name;
        this.numberPhone = numberPhone;
        this.age = age;
    }
 
    public String getCode() {  return code;}

    public void setCode(String code) { this.code = code; }

    public String getName() {  return name;}

    public void setName(String name) {   this.name = name;  }

    public String getNumberPhone() { return numberPhone; }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone; 
    }

    public int getAge() {return age; }

    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "(" + "code=" + code + ", name=" + name 
                + ", numberPhone=" + numberPhone + ", age=" + age +"), ";
    }

}
