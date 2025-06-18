package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineParameterizedTest {

    Feline feline = new Feline();

    @ParameterizedTest
    @DisplayName("Test getKittens with specified count")
    @ValueSource(ints = {-1, 0, 1, 9, 99})
    public void getKittensShouldReturnKittensCount(int kittensCount){
        int actual = feline.getKittens(kittensCount);
        assertEquals(kittensCount, actual);
    }
}
