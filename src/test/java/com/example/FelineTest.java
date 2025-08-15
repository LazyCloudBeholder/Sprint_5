package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FelineTest {

    @Test
    public void shouldEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat(),"Неправильно возвращается список еды");
    }

    @Test
    public void shouldGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily(),"Неправильно возвращается семья");
    }

    @Test
    public void shouldGetKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens(),"Неправильно возвращается количество котят");
    }

    @ParameterizedTest
    @ValueSource(ints ={1, 2, 3, 9 ,4 ,5})
    public void testGetKittens(int kittens) {
        Feline feline = new Feline();
        assertEquals(kittens, feline.getKittens(kittens), "Неправильно возвращается количество котят");
    }
}