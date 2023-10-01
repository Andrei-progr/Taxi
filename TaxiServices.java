package com.company;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class TaxiServices {
    ArrayList<Service> services = new ArrayList<>();

    public TaxiServices(ArrayList<String> services){
        for (String elem : services){
            try {
                Service s = new Service(elem);
                this.services.add(s);
            } catch (IncorrectData e){
                continue;
            }
        }
    }

    public ArrayList<String> result(User user){
        ArrayList<String> res = new ArrayList<>();
        for (Service s : services){
            if (user.waitTime > s.minWait && user.waitTime < s.maxWait &&
                    user.roadTime > s.minDrive && user.roadTime < s.maxDrive &&
                    user.cost > s.minCost && user.cost < s.maxCost &&
                    (user.pay.equals("any") | s.pay.equals("any") | user.pay.equals(s.pay))){
                res.add(s.name);
            }
        }
        return res;
    }

}
