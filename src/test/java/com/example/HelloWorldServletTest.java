package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldServletTest {

    @Test
    public void testDoGet() {
        HelloWorldServlet servlet = new HelloWorldServlet();
        String result = servlet.doGet();
        assertEquals("Hello, World!", result);
    }
}