package com.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void sexThrowsException(){
        assertThrows(Exception.class, ()-> {Lion lion = new Lion("Samets",feline);}
        );
    }

    @Test
    public void shouldGetKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец",feline);
        assertEquals(1, lion.getKittens(),"Лев возвращает не верное число котят");
    }
    @Test
    public void shouldGetFood() throws Exception{
        Lion lion = new Lion("Самец",feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, lion.getFood(),"Лев возвращает неправильный список еды");
    }

    @ParameterizedTest
    @CsvSource({
        "Самец, true",
        "Самка, false"
    })
    public void testDoesHaveManeWithParams(String sex, boolean expected) throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expected, lion.doesHaveMane(),"Неправильно определено наличие гривы");
    }
}