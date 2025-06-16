package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Spy;

import static org.junit.jupiter.api.Assertions.*;

public class LionParameterizedTest {

    @Spy
    Feline felineMock = new Feline();

    @ParameterizedTest
    @DisplayName("Test constructor with specified parameters")
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    public void constructorShouldSetManeCorrectly(String sex, boolean expectedMane) throws Exception {
        Lion lion = new Lion(sex, felineMock);
        assertAll(
                () -> assertEquals(expectedMane, lion.hasMane),
                () -> assertEquals(expectedMane, lion.hasMane)
                );
    }

}
