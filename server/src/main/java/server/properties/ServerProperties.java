package server.properties;


import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Slf4j
public class ServerProperties {

    private static ServerProperties instance;

    private final Properties properties;

    private ServerProperties() {
        this.properties = new Properties();

        try {
            InputStream reader = getClass().getClassLoader().getResourceAsStream("server.properties");
            properties.load(reader);
        }catch (IOException e){
            e.printStackTrace();
            log.error("Could not load server properties file.");
        }
    }

    public static ServerProperties getInstance(){
        if(instance == null) instance = new ServerProperties();
        return instance;
    }

    public String getProperty(String key){
        return properties.getProperty(key);
    }


}
