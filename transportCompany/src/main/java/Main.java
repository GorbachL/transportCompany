import controllers.CitiesController;
import controllers.TransportController;
import entity.City;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

//        CategoryController categoryController = new CategoryController();
//        System.out.println(categoryController.getCategoriesWithTransport());

        System.out.println("Enter from City");
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String fromCityName = reader.readLine();


        System.out.println("Enter to City");
        reader =
                new BufferedReader(new InputStreamReader(System.in));
        String toCity = reader.readLine();

        System.out.println(fromCityName);
        System.out.println(toCity);

        System.out.println("Number of people");
        reader =
                new BufferedReader(new InputStreamReader(System.in));
        String peopleAmount = reader.readLine();

        System.out.println("Cargo Amount");
        reader =
                new BufferedReader(new InputStreamReader(System.in));
        String cargoAmount = reader.readLine();

        CitiesController citiesController = new CitiesController();

        City cityFrom = citiesController.getCityByName(fromCityName);
        City cityTo = citiesController.getCityByName(toCity);

        TransportController transportController = new TransportController();
        transportController.checkMatch(cityFrom, cityTo, peopleAmount, cargoAmount);


    }
}


