package spring.boot.example.hello.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControllerTests {

    @Test
    public void testSay() {
        System.out.println("Hello World Test");
    }

}
