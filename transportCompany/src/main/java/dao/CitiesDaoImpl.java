package dao;

import db.MySQLConnection;
import entity.Cities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CitiesDaoImpl implements CitiesDao {

    private static final String SELECT  = "SELECT * FROM Cities WHERE name = ?";

    @Override
    public List<Cities> getCities() {
        List<Cities> cityList = new ArrayList<>();
        try(Connection connection = MySQLConnection.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(SELECT);
            while (result.next()){
                Cities cities = new Cities();
                cities.setId(result.getInt("id"));
                cities.setName(result.getString("name"));
                cities.setLat(result.getDouble("latitude"));
                cities.setLon(result.getDouble("longitude"));
                cities.setAirport(result.getBoolean(1));
                cities.setSeaport(result.getBoolean(1));
                cityList.add(cities);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cityList;
    }
}

