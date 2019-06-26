package controllers;


import dao.CityDao;
import dao.CityDaoImpl;
import entity.City;

public class CitiesController {

    CityDao citiesDao = new CityDaoImpl();

    public City getCityByName(String cityName) {

        return citiesDao.getCityByName(cityName);
    }

}


