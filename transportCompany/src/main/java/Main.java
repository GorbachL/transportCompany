import controllers.CategoryController;
import controllers.CitiesController;
import controllers.TransportController;

public class Main {

    public static void main(String[] args) {

//        CategoryController categoryController = new CategoryController();
//        System.out.println(categoryController.getCategoriesWithTransport());

        CitiesController citiesController = new CitiesController();
        System.out.println(citiesController.getCitiesList());
    }
}


