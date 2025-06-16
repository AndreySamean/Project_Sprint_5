package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Spy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LionTest {

    @Spy
    Feline felineMock = new Feline();

    @Test
    public void getKittensShouldReturnOne() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void doesHaveManeShouldReturnFalse() throws Exception {
        Lion lion = new Lion("Самка", felineMock);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void getFoodShouldReturnListOfFood() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, lion.getFood());
    }

    @Test
    public void lionConstructorThrowsException(){
        Exception exception = assertThrows(Exception.class,
                () -> new Lion("Боевой вертолёт", felineMock));
        assertEquals("Используйте допустимые значения пола животного - самец или самка",
                exception.getMessage());
    }
}
