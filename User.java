package com.company;

public class User {
    public int waitTime;
    public int cost;
    public int roadTime;
    public String pay;

    public User(String userData) throws IncorrectData{
        String[] userArray;
        try {
            userArray = userData.split(",");
        } catch (Exception e){
            throw new IncorrectData("Вы ввели некоректные данные пользователя");
        }
        try {
            waitTime = Integer.parseInt(userArray[0]);
            cost = Integer.parseInt(userArray[1]);
            roadTime = Integer.parseInt(userArray[2]);
            pay = userArray[3];
        } catch (Exception e){
            throw new IncorrectData("Вы ввели некоректные данные пользователя");
        }
    }
}
