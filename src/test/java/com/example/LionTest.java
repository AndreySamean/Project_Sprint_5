package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    Feline felineMock;

    @Test
    public void getKittensShouldReturnOne() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        Mockito.when(felineMock.getKittens()).thenReturn(1);
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
        Mockito.when(felineMock.getFood(Mockito.any())).thenReturn(List.of("Животные", "Птицы", "Рыба"));
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
