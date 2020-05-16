package ru.mike;

import feign.Response;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Config.class)
public class StartOfTests {

    @Autowired
    public AuthClient authClient;

    @Test
    void testt()
    {

        List<DataModel> responce = authClient.getAllTriangles();
        System.out.println(responce.get(0).firstSide);
        Response responce2 = authClient.addTriangle();
        System.out.println(responce.get(0).secondSide);
       // System.out.println(propertyHolder);
    }

//    public static void main(String[] args)
//    {
//        System.out.println(serverAddress);
//        System.out.println(propertyHolder);
//    }
}
