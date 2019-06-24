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


/*
   CategoriesDao categoriesDao = new CategoriesDaoImpl();
    TransportDao transportDao = new TransportDaoImpl();

    public List<Category> getCategoriesWithTransport(){
        List<Category> categories = categoriesDao.get();
        for (Category category : categories){
            List<Transport> categoryTransports = transportDao.getTransportByCategory(category);
            category.setTransports(categoryTransports);
        }
        return categories;
    }
 */