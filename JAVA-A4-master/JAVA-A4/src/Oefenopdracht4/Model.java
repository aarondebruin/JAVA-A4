package Oefenopdracht4;

import java.util.Random;

public class Model{
    private String nameArray[] = {"Geert","Henk", "Herman", "Jan", "Robert"};

    public String getNameArray() {
        return nameArray[generateRandomNumber()];
    }

    private int generateRandomNumber(){
        Random rand = new Random();
        int output = rand.nextInt(5);

        return output;
    }

}