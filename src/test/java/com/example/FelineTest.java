package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FelineTest {

    static Feline feline;

    @BeforeAll
    public static void createFelineObject(){
        feline = new Feline();
    }


    @Test
    public void eatMeatShouldReturnListOfFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void getFamilyShouldReturnFamily(){
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily, feline.getFamily());
    }

    @Test
    @DisplayName("Test getKittens with default count")
    public void getKittensShouldReturnDefaultValue(){
        int expectedKittensCount = 1;
        assertEquals(expectedKittensCount, feline.getKittens());
    }

    @AfterAll
    public static void deleteFelineObject(){
        feline = null;
    }

}
