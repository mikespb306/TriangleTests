package ru.mike;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(value = {"ru.mike"})
@PropertySource("settings.properties")
public class Config {


//    @Value("${server.address}")
//    public String serverAddress;

//    @Value("${default.client.connection.timeout.millis}")
//    public int connectTimeoutMillis;
//
//    @Value("${default.client.read.timeout.millis}")
//    public int readTimeoutMillis;
}