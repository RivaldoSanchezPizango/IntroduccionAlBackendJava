package org.example.arquitectura_de_JUnit5.annotations;

// Funcionalidad que nos provee JUnit para realizar nuestros test
import org.junit.jupiter.api.*;

public class CicloVidaTest {

    // Ejecuta previamente a todas las pruebas unitarias que hayamos definidos
    @BeforeAll
    static void initAll () {
    }

    // Se ejecuta antes que cada prueba unitaria
    @BeforeEach
    void init () {
    }

    // Genera que el metodo sea un test unitario
    @Test
    @Tag("unit")
    void regular_testing_method () {
    // ....
    }

    // El metodo que tenga esta anotacion no se va a ejecutar
    @Test
    @Disabled
    void skippedTest () {
    // not executed
    }

    // el metodo se ejecuta despues de cada prueba unitaria
    @AfterEach
    void tearDown () {
    }

    // el metodo se ejecuta despues de todos los test unitarios
    @AfterAll
    static void tearDownAll () {
    }

    // ejecuta si tiene cierto Tag el metodo
    @Tag("unit")
    @Test()
    void myTest() {
    }

    @Tag("otherTest")
    @Test()
    void otherTest() {

    }


}
