package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<String> services = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            System.out.println("Параметры сервиса: " + line);
            services.add(line);
        }
        System.out.println("Введите параметр пользователя");
        String UserInput = scanner.nextLine();
        System.out.println("Параметры пользователя: " + UserInput);

        User user = null;
        try {
            user = new User(UserInput);
        } catch (IncorrectData e) {
            e.printStackTrace();
        }

        TaxiServices taxi = new TaxiServices(services);
        ArrayList<String> res = taxi.result(user);
        System.out.println(res);

    }
}

