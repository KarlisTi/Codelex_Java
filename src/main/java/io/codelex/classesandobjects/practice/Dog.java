package io.codelex.classesandobjects.practice;

public class Dog {


    String name;
    String sex;
    String mother;
    String father;

    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

//    public String fathersName() {
//        return this.father;
//        if (this.father == null) {
//            return "Unknown";
//        }
//    }




    public class DogTest{

        public static void main (String[]args){
        Dog firstDog = new Dog("Max", "male", "Lady","Rocky");
        Dog secondDog = new Dog("Rocky", "male", "Molly","Sam");
        Dog thirdDog = new Dog("Sparky", "male");
        Dog fourthdDog = new Dog("Buster", "male","Lady","Sparky");
        Dog fifithdDog = new Dog("Sam", "male");
        Dog sixtdDog = new Dog("Lady", "male");
        Dog seventhdDog = new Dog("Molly", "male");
        Dog eigthdDog = new Dog("Coco", "male","Lady","Sparky");


        }
    }
}