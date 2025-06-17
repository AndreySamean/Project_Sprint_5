package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlexTest {

    @Test
    public void getFriendsShouldReturnFriendsList() throws Exception {
        Alex alex = new Alex(new Feline());
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingShouldReturnNewYorkZoo() throws Exception {
        Alex alex = new Alex(new Feline());
        String expectedPlace = "Нью-Йоркский зоопарк";
        assertEquals(expectedPlace, alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensShouldReturnZero() throws Exception{
        Alex alex = new Alex(new Feline());
        int expectedKittens = 0;
        assertEquals(expectedKittens, alex.getKittens());
    }
}
