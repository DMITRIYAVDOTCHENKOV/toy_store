package org.example;

import java.sql.*;

public class TestDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String userName = "root";
        String password = "root";
        String connectionURL = "jdbc:mysql://localhost:3306/shop";
        Class.forName("com.mysql.cj.jdbc.Driver");


        try (Connection connection = DriverManager.getConnection(connectionURL, userName, password);
             Statement statement = connection.createStatement()) {
//            statement.executeUpdate("CREATE TABLE developers (firstname VARCHAR(10), secondname VARCHAR(10))");
//            statement.executeUpdate("INSERT INTO developers (firstname, secondname) VALUES ('Jack', 'Jansen')");
//            statement.executeUpdate("INSERT INTO developers (firstname, secondname) VALUES ('Jason', 'Moon')");
//            statement.executeUpdate("INSERT INTO developers (firstname, secondname) VALUES ('Nick', 'Carol')");
//            statement.executeUpdate("INSERT INTO developers (firstname, secondname) VALUES ('Dima', 'Avdot')");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM developers");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1)+ " " + resultSet.getString(2));
            }

            System.out.println("Данные успешно отображены!");
        }
    }
}
