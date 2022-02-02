package ru.itsjava.git.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.junit.Person;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Person должен: ")
public class PersonTest {

    public static final String DEFAULT_NAME = "Dmitriy";
    public static final int DEFAULT_AGE = 29;
    public static final String NEW_NAME = "Eliza";
    public static final int NEW_AGE = 17;
    public static final int MAJORITY = 18;

    @DisplayName("Корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

        assertAll("actualPerson", () -> assertEquals(DEFAULT_NAME, actualPerson.getName()),
                () -> assertEquals(DEFAULT_AGE, actualPerson.getAge()));

    }

    @DisplayName("Корректно прибавлять год на День Рождения")
    @Test
    public void shouldHaveCorrectBirthday() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.birthday();
        assertEquals(DEFAULT_AGE + 1, actualPerson.getAge());
    }

    @DisplayName("Корректно проверять возраст для допуска к алкоголю")
    @Test
    public void shouldHaveCorrectTakeBeer() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        Person newPerson = new Person(NEW_NAME, NEW_AGE);

        assertFalse(newPerson.takeBeer());
        newPerson.birthday();
        assertTrue(newPerson.takeBeer());
        assertTrue(actualPerson.takeBeer());


    }


}
