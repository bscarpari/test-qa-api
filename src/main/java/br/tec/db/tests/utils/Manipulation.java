package br.tec.db.tests.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Manipulation {
    public Manipulation() {}

    public static Properties getProp() {
        Properties props = new Properties();

        try {
            FileInputStream file = new FileInputStream("src/main/resources/application.properties");
            props.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return props;
    }
}
