package ru.mike;

import feign.jackson.JacksonDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import feign.*;

@Component
public class Service {

    @Autowired
    private PropertyHolder propertyHolder;

    @Bean
    public AuthClient pmoAuthClient() {
        return Feign.builder()
                .decoder(new JacksonDecoder())
              //  .logger(new Slf4jLogger(AuthClient.class))
                .logLevel(Logger.Level.FULL)
                .options(new Request.Options(
                        propertyHolder.getConnectTimeoutMillis(),
                        propertyHolder.getReadTimeoutMillis(),
                        false)
                )
                .target(AuthClient.class, propertyHolder.server);
    }

}
