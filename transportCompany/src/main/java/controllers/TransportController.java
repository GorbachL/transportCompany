package controllers;

import dao.TransportDao;
import dao.TransportDaoImpl;
import entity.City;


public class TransportController {

    TransportDao transportDao = new TransportDaoImpl();

    public void checkMatch(City from, City to, String peopleAmount, String cargoAmount) {
        double distance = distance(from.getLat(), from.getLon(), to.getLat(), to.getLon());
        System.out.println("Distance between cities: " + distance);

        //TODO - дальше самое сложное - надо проверить введенное количество человек и груза - подходит ли оно под транспорт который идет между этими городами

    }


    public static double distance(double lat1, double lat2, double lon1,
                                  double lon2) {

        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters


        distance = Math.pow(distance, 2);

        return Math.sqrt(distance);
    }
}


