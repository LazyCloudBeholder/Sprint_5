package com.example;

import java.util.List;

public class Alex extends Lion {
    String placeOfLiving = "Нью-Йоркский зоопарк";
    List<String> friends = List.of("Марти","Мелман","Глория");

    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens(){
        return 0;
    }

    public List<String> getFriends(){
        return friends;
    }

    public String getPlaceOfLiving(){
        return placeOfLiving;
    }

}
