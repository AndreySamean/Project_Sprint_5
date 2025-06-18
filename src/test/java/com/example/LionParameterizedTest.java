package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class LionParameterizedTest {

    @Mock
    Feline felineMock;

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
