package fi.linsshoppa.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import fi.linsshoppa.interfaces.DatabaseConnectInterface;

public class DatabaseConnection implements DatabaseConnectInterface {

    public DatabaseConnection()  {}

    @Override
    public int connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, username, password);
        }
        catch (InstantiationException e) {
            e.printStackTrace();
            return -1;
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
            return -1;
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

    @Override
    public Object query() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int close() {
        try {
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

    private Connection connection;
    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    private String username;
    private String password;
    private String url;


}
