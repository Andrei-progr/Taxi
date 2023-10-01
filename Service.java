package com.company;

public class Service {
    public String name;
    public int minWait;
    public int maxWait;
    public int minCost;
    public int maxCost;
    public int minDrive;
    public int maxDrive;
    public String pay;

    public Service(String request) throws IncorrectData{
        String[] data;
        try {
            data = request.split(",");
        } catch (Exception e){
            throw new IncorrectData("некорректные данные");
        }
        try {
            name = data[0];
            int[] wait = parseInterval(data[1]);
            minWait = wait[0];
            maxWait = wait[1];
            int[] cost = parseInterval(data[2]);
            minCost = cost[0];
            maxCost = cost[1];
            int[] drive = parseInterval(data[3]);
            minDrive = drive[0];
            maxDrive = drive[1];
            pay = data[4];
        } catch (Exception e){
            throw new IncorrectData("Некорректные данные");
        }
    }

    private int[] parseInterval(String ab) throws IncorrectData{
        String[] abInterval;
        int a;
        int b;
        try {
            abInterval = ab.split("-");
            a = Integer.parseInt(abInterval[0]);
            b = Integer.parseInt(abInterval[1]);
        } catch (Exception e){
            throw new IncorrectData("Некорректные данные");
        }
        return new int[] {a, b};
    }

}
