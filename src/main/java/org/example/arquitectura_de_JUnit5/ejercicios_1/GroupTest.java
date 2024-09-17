package org.example.arquitectura_de_JUnit5.ejercicios_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GroupTest {

    /*
        DADAS 5 PERSONAS (JUAN - PEDRO - ANA - LUZ Y JULIAN) Y UNA COLECCION VACIA DE OBJETOS TIPO PERSONA
        , CUANDO SE INTENTAN AGREGAR ESTAS A LA COLECCION, EL TAMAÑO DE LA COLECCION DEBERIA SER 2
    */

    @Test
    public void caseOne ( ) {
        // DADO
        Person juan = new Person("Juan", 22);
        Person pedro = new Person("Pedro", 32);
        Person ana = new Person("Ana", 23);
        Person luz = new Person("Luz", 21);
        Person julian = new Person("Julian ", 35);

        Group group = new Group();

        // CUANDO
        group.addPerson(juan);
        group.addPerson(pedro);
        group.addPerson(ana);
        group.addPerson(luz);
        group.addPerson(julian);

        // ENTONCES -> el tamaño de la collecion es 2
        Assertions.assertTrue(group.getPeople().size() == 2);

    }




    /*
        DADAS 5 PERSONAS (18 AÑOS - 17 AÑOS - 22 AÑOS - 14 AÑOS Y 32 AÑOS)
        EL TAMAÑO DE LA COLECCION DEBERIA SER 3.
    */

    @Test
    public void caseTwo () {
        // DADO
        Person juana = new Person("Juana", 1);
        Person pedro = new Person("Pedro", 17);
        Person analia = new Person("Analia", 22);
        Person luciana = new Person("Luciana", 14);
        Person julian = new Person("Julian ", 32);

        Group group = new Group();

        // CUANDO
        group.addPerson(juana);
        group.addPerson(pedro);
        group.addPerson(analia);
        group.addPerson(luciana);
        group.addPerson(julian);

        // ENTONCES
        Assertions.assertTrue(group.getPeople().size() == 3);
    }




    /*
      DADAS 5 PERSONAS (N1COLAS - TOMAS - 3STEBAN - CARLOS\sV - FRANCISCO\sII)
      EL TAMAÑO DE LA COLECCION DEBERIA SER 1
    */
    @Test
    public void caseThree () {

        //DESDE
        Person nicolas = new Person("N1c0las", 18);
        Person tomas = new Person("Tomas", 19);
        Person esteban = new Person("3steban", 19);
        Person carlos = new Person("Carlos\\sV", 22);
        Person francisco = new Person("Francisco\\sII", 19);

        Group group = new Group();


        // CUANDO
        group.addPerson(nicolas);
        group.addPerson(tomas);
        group.addPerson(esteban);
        group.addPerson(carlos);
        group.addPerson(francisco);


        // ENTONCES
        Assertions.assertEquals(1, group.getPeople().size());
    }

}
