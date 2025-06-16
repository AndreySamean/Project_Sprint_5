package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CatTest {

    @Mock
    static Feline felineMock;

    @InjectMocks
    static Cat cat;

    @BeforeAll
    public static void createCatObject(){
        cat = new Cat(felineMock);
    }

    @Test
    public void getSoundShouldReturnCatSound(){
        String expectedSound = "Мяу";
        assertEquals(expectedSound, cat.getSound());
    }

    @Test
    public void getFoodShouldReturnListOfFood() throws Exception {

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(cat.getFood()).thenReturn(expectedFood);
        assertEquals(expectedFood, cat.getFood());

    }

    @AfterAll
    public static void deleteCatObject(){
        cat = null;
    }
}
