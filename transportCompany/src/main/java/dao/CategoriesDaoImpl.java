package dao;

import db.MySQLConnection;
import entity.Category;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoriesDaoImpl implements CategoriesDao {

    private static final String SELECT = "SELECT * FROM categories";

    @Override
    public List<Category> get() {
        List<Category> categories = new ArrayList<>();
        try(Connection connection = MySQLConnection.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(SELECT);
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

