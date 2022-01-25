package ru.itsjava.git;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Класс Watch должен:")
public class WatchTest {

    public static final String FIRM = "SEICO";
    public static final String AUTHOR = "Vova";
    public static final int PRICE = 10000;
    private static final String NEW_AUTHOR = "Masha";

    @DisplayName("Корректно создаваться конструктором:")
    @Test
    public void shouldHaveCorrectConstructor() {
        Watch actualWatch = new Watch(FIRM, AUTHOR, PRICE);

        assertEquals(FIRM, actualWatch.getFirm());
        assertEquals(AUTHOR, actualWatch.getAuthor());
        assertEquals(PRICE, actualWatch.getPrice());

        assertAll("actualWatch", () -> assertEquals(FIRM, actualWatch.getFirm()),
                () -> assertEquals(AUTHOR, actualWatch.getAuthor()),
                () -> assertEquals(PRICE, actualWatch.getPrice()));
    }

    @DisplayName(" корректно меняет автора")
    @Test
    public void shouldHaveCorrectUpdateWatch() {
        Watch actualWatch = new Watch(FIRM, AUTHOR, PRICE);
        actualWatch.setAuthor(NEW_AUTHOR);

        assertEquals(NEW_AUTHOR, actualWatch.getAuthor());

    }
}
