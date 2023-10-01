package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class TaxiServices {
    int waitTime;
    int cost;
    int roadTime;
    String pay;

    public void getUser(String userData) throws IncorrectData{
        String[] userArray = userData.split(",");
        try {
            waitTime = Integer.parseInt(userArray[0]);
            cost = Integer.parseInt(userArray[1]);
            roadTime = Integer.parseInt(userArray[2]);
            pay = userArray[3];
        } catch (Exception e){
            throw new IncorrectData("Вы ввели некоректные данные пользователя");
        }
    }

    public void getServices(ArrayList<String> services) throws IncorrectData {
        for
    }

    public String[] response(){

    }
