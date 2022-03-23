package io.codelex.classesandobjects.practice.Exercise7;

public class Dog {

    private String name;
    private Sex gender;
    private String mother;
    private String father;

    public Dog(String name, Sex gender, String mother, String father) {
        this.name = name;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
    }

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getMother() {
        return mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public void fathersName() {
        if (this.father == null) {
            System.out.println("Unknown");
        } else {
            System.out.println(this.father);
        }
    }

    public void hasSameMotherAs(Dog otherDog) {
        if (this.mother.equals(otherDog.mother)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
