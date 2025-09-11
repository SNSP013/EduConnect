<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> 15668bcf1f6dd835ca25ab5e5f19e5b5570ab204
>>>>>>> f345a5af1d0b14401062d26fc802862e4ec7b6a7
package com.wecp.progressive.config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {
    private static final Properties properties = new Properties();
    
    static{
        loadProperties();
    }

    private static void loadProperties(){
        try(InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")){
            if(input == null){
                throw new IllegalStateException("application.properties not found in classpath");
            }
            properties.load(input);
        } catch(IOException e){
            throw new RuntimeException("Error loading porperties file ", e);
        }
    }

    public static Connection getConnection() throws SQLException{
        String url = properties.getProperty("spring.datasource.url");
        String user = properties.getProperty("spring.datasource.username");
        String password = properties.getProperty("spring.datasource.password");
        return DriverManager.getConnection(url, user, password);
    }
<<<<<<< HEAD
}
=======
<<<<<<< HEAD
}
=======
}
>>>>>>> 15668bcf1f6dd835ca25ab5e5f19e5b5570ab204
>>>>>>> f345a5af1d0b14401062d26fc802862e4ec7b6a7
