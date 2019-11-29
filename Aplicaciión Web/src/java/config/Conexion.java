
package config;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://70.40.217.137/gmoncayo_db_judopic","gmoncayo_judopic","judopic2019");
        } catch (Exception e) {
        }
        return con;
    }
}
