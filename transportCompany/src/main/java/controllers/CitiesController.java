package controllers;

import dao.CitiesDao;
import dao.CitiesDaoImpl;
import entity.City;

public class CitiesController {

    CitiesDao citiesDao = new CitiesDaoImpl();

    public City getCityByName(String cityName) {
        return citiesDao.getCityByName(cityName);
    }

}


