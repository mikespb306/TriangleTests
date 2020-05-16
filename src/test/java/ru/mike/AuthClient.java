package ru.mike;

import feign.*;

import java.util.List;

public interface AuthClient {

    @RequestLine("GET /triangle/all")
    @Headers("X-User:e1d0ce76-1638-46a3-98d8-26cd0fa7da4d")
    List<DataModel> getAllTriangles();

    @RequestLine("POST  /triangle")
    @Headers("X-User:e1d0ce76-1638-46a3-98d8-26cd0fa7da4d")
    @Body("{\"separator\": \";\", \"input\": \"3;4;5\"}")
    Response addTriangle();

//    @RequestLine("GET /service/api/auth/me")
//    @Headers("Cookie: {sessionCookie}")
//    Response me(@Param("sessionCookie") String sessionCookie);
//
//    @RequestLine("GET /service/api/auth/authorized")
//    @Headers("Cookie: {sessionCookie}")
//    Response authorized(@Param("sessionCookie") String sessionCookie);
//
//    @RequestLine("GET /j_spring_security_logout")
//    @Headers("Cookie: {sessionCookie}")
//    Response logout(@Param("sessionCookie") String sessionCookie);
}
