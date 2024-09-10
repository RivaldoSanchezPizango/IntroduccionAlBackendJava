package org.example.arquitectura_de_JUnit5.assertions;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

public class AsssertionsTest {

    @Test()
    void equalsAssertions() {

        int numberOne = 2;
        int numberTwo = 2;

        // Si un valor dado coincide con un valor esperado, compara valores.
        assertEquals(numberOne, numberTwo);
    }

    @Test()
    void notEqualsAssertions() {

        int numberOne = 2;
        int numberTwo = 3;

        // Compara si los valores son diferentes
        assertNotEquals(numberOne, numberTwo);
    }

    @Test ()
    void arrayEqualsAssertions () {
        char [] expected = {'J', 'a', 'v', 'a'};
        char [] actual = "Java".toCharArray();

        // Compara 2 matrices
        assertArrayEquals(expected, actual, "Array should be equal");
    }

    @Test
    void trueAssertion () {
        // Evalua una condicion que nosotros le estamos dando
        assertTrue(7 > 1, "7 is greater than1");
    }

    @Test
    void trueAssertion1 () {
        BooleanSupplier condition = () -> 7 > 1;
        assertTrue(condition, "7 is greater than 1");
    }

    @Test
    void falseAssertion () {
        boolean condition = 7 > 10;

        // comprueba si la condicion efectivamente es falso
        assertFalse(condition, "7 is not greater than 10");
    }

    @Test
    void notNullAssertion () {
        Object course = null;

        // Evalua es si un objeto es nulo o no.
        assertNotNull(course, "The course should not be null.");
    }

    @Test
    void nullAssertion () {
       Object course = null;

       // Afirmamos que el objeto es nulo
       assertNull(course, "The course should be null");
    }


    @Test
    void SameAssertion () {
        String course = "Backend";
        Optional<String> optional = Optional.of(course);

        // esta afirmacion compara si los valores se refieren al mismo objeto
        assertSame(course, optional.get());
    }

    @Test
    void NotSameAssertion () {
       String course = "Backend";
       String otherCouerse = "POO";
       Optional<String> optional = Optional.of(otherCouerse);

       // Afirman que los valores no se refieren al mismo objeto
        assertNotSame(course, optional.get());
    }

    @Test
    void allAssertion () {

        // Nos permite agrupar distintas assertions (afirmaciones)
        assertAll(
                () ->assertEquals(4, 2 * 2),
                () ->assertEquals("backend", "BACKEND".toLowerCase()),
                () ->assertNotEquals(2,3),
                () ->assertNull(null, "actual shouls be null")
        );
    }

    @Test
    void iterableAssertion () {
        Iterable<String> arrayList = new ArrayList<>(asList("Java", "JUnit", "Test"));
        Iterable <String > linkedList = new LinkedList<>(asList("Java", "JUnit", "Test"));

        // Compara que los iterables tengan los mismo valores y los tengan en el mismo orden
        assertIterableEquals(arrayList, linkedList);
    }

    @Test
    void throwsAssertion1 () {

        // Afirma que el primer valor sea un tipo de excepcion y deberia coincidir
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("la");
        });
    }

    @Test
    void timeOutAssertion () {

        // Ponemos el tiempo del proceso
        assertTimeout(
                Duration.ofSeconds(2),
                () -> {
                    Thread.sleep(1000);
                }
        );
    }


    @Test
    void timeOutPreemptiveAssertion () {

        // compara la duracion minima de un proceso
        assertTimeoutPreemptively(
                Duration.ofSeconds(1),
                () -> {
                    Thread.sleep(1000);
                }
        );
    }

    @Test
    void linesMatchAssertion () {
        List <String> expected = asList("Java", "11", "JUnit");
        List <String> actual = asList("Java", "11", "JUnit");

        //  compara listas que contengan los mismo valores
        assertLinesMatch(expected, actual);
    }

}
