package controllers;

import dao.CitiesDao;
import dao.CitiesDaoImpl;
import entity.Cities;

import java.util.List;

public class CitiesController {

    CitiesDao citiesDao = new CitiesDaoImpl();

    public List<Cities> getCitiesList(){
        List<Cities> citiesList = citiesDao.getCities();
        return citiesList;
    }

}


