package com.example.uhylabr.inclassassignment09_brianh;

/**
 * Created by UHYLABR on 3/29/2018.
 */

public class Person {
    private String Name;
    private int Age;
    private boolean GradHS;

    public Person(){}

    public Person(String name, int age, boolean gradHS) {
        Name = name;
        Age = age;
        GradHS = gradHS;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public boolean isGradHS() {
        return GradHS;
    }

    public void setGradHS(boolean gradHS) {
        GradHS = gradHS;
    }


}
