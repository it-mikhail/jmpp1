package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static Connection getMySQLConnection() throws SQLException {
        String hostName = "192.168.56.103";
        String port = "3306";
        String dbName = "jpp_task_1_1_3";
        String userName = "javadeveloper";
        String password = "javadeveloper";
        String disableSSL = "?useSSL=false";
        String connectionURL = "jdbc:mysql://" + hostName + ":" + port + "/" + dbName + disableSSL;

        return DriverManager.getConnection(connectionURL, userName, password);
    }
}
