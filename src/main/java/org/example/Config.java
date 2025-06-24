package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private static final String PROP_FILE = "application.properties";
    private static final Properties props = new Properties();

    static {
        try (InputStream in =
                     Thread.currentThread()
                             .getContextClassLoader()
                             .getResourceAsStream(PROP_FILE)) {
            if (in == null) {
                throw new IllegalStateException(
                        PROP_FILE + " not found on classpath");
            }
            props.load(in);
        } catch (IOException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static String getBotToken() {
        String token = props.getProperty("telegram.bot.token");
        if (token == null || token.isBlank()) {
            throw new IllegalStateException(
                    "telegram.bot.token not set in " + PROP_FILE);
        }
        return token;
    }
}
