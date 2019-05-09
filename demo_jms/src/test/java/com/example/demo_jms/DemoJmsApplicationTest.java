package com.example.demo_jms;

import com.example.demo_jms.sender.MessageSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoJmsApplicationTest {
    @Value("${destination.queue}")
    private String destination;

    @Autowired
    private MessageSender sender;

    @Test
    public void testReceive() {
        sender.send(destination, "Hello Spring JMS ActiveMQ!");
    }
}