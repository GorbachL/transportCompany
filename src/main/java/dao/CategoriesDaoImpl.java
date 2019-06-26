package dao;

import db.MySQLConnection;
import entity.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriesDaoImpl implements CategoriesDao {

    private static final String SELECT_ALL = "SELECT * FROM categories";
    private static final String FIND_BY_NAME = "select * from categories where name = ? ";

    @Override
    public List<Category> get() {
        List<Category> categories = new ArrayList<>();
        try (Connection connection = MySQLConnection.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(SELECT_ALL);
            while (result.next()) {
                Category category = new Category();
                category.setId(result.getInt("id"));
                category.setName(result.getString("name"));
                categories.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }

    @Override
    public Category findByName(String name) {
        List<Category> categories = new ArrayList<>();
        try (Connection connection = MySQLConnection.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(FIND_BY_NAME);
            statement.setString(1, name);
            categories = resultSetToList(statement.executeQuery());
             //TODO: call FIND_BY_NAME query
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return categories.get(0);
        if (categories.size() == 0){
            return new Category();
        }else {
            return categories.get(0);
        }
    }

    private List<Category> resultSetToList(ResultSet result){
        List<Category> categories = new ArrayList<>();
        try{
            while (result.next()){
                Category category = new Category();
                category.setId(result.getInt("id"));
                category.setName(result.getString("name"));
                categories.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }
}


