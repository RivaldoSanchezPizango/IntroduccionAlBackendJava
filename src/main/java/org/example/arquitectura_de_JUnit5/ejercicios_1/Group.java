package org.example.arquitectura_de_JUnit5.ejercicios_1;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List <Person> people;

    public Group() {
        this.people= new ArrayList<>();
    }


    public void addPerson (Person person) {
        boolean isOlder = person.isOlder();
        boolean name5Check = person.name5Check();
        boolean nameAZCheck = person.nameAZCheck();
        boolean ageChek = person.ageCheck();

        if (isOlder && name5Check && nameAZCheck && ageChek){
            people.add(person);
            System.out.println("Se agrego una persona: " + person.getName());
        } else {
            System.err.println("No se pudo agregar a la persona: " + person.getName());
            if (!isOlder) System.err.println("La persona debe ser mayor de 18 y menor de 120.");
            if (!name5Check) System.err.println("El nombre de la persona debe tener mas de 4 letras.");
            if (!nameAZCheck) System.err.println("El nombre de la persona debe contener solo letras.");
            if(!ageChek) System.err.println("La edad debe ser entre 0 y 120 años.");
        }

    }


    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

}

