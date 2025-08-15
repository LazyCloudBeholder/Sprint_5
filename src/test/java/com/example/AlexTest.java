package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(0, alex.getKittens(), "Неправильно возвращается котята Алекса");
    }

    @Test
    public void getFriends() throws Exception {
        Alex alex = new Alex(feline);
        List<String> expected = List.of("Марти","Мелман", "Глория");
        assertEquals(expected, alex.getFriends(),"Неправильный список друзей Алекса");
    }

    @Test
    public void getPlaceOfLiving() throws Exception {
        Alex alex = new Alex(feline);
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected, alex.getPlaceOfLiving(),"Неправильно возвращается место жительства Алекса");
    }
}