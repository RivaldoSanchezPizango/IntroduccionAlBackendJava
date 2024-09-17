package org.example.arquitectura_de_JUnit5.ejercicios_1;

public class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // vamos a chequear que la persona sea mayor que 18
    public boolean isOlder () {
        return age >= 18;
    }

    // vamos a chequear que el nombre de la persona tenga mas de 4 letras
    public boolean name5Check () {
        return name.length() >= 5;
    }

    // vamos a chequear que la edad de la persona sea entre 0 y 120 años
    public boolean ageCheck () {
        boolean check = false;
        //condicion
        if (age > 0 && age <= 120){
            check = true;
        }
        return check;
    }

    //  vamos a chequear que el nombre de la persona contenga solo letras de la A a la Z
    public  boolean nameAZCheck () {

        boolean check = false;
        char [] nameToChars = name.toCharArray();

        for (char  letter : nameToChars) {
            if (!Character.isLetter(letter)) {
                return check;
            }
        }

        check = true;
        return check;
    }


}
