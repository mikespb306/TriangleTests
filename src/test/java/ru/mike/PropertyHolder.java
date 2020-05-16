package ru.mike;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Data
@Component
public class PropertyHolder {

    @Value("${server}")
    public String server;

    @Value("${default.client.connection.timeout.millis:600000}")
    public int connectTimeoutMillis;

    @Value("${default.client.read.timeout.millis:600000}")
    public int readTimeoutMillis;

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
}
