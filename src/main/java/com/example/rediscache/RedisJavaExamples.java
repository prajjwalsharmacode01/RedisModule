package com.example.rediscache;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;


@Component
public class RedisJavaExamples {

    @Value("${spring.redis.host}")
    private String redisHost;

    @Value("${spring.redis.port}")
    private int redisPort;

    public void testRedis() {
        try (Jedis jedis = new Jedis(redisHost, redisPort)) {
//            jedis.set("prajjwal", "Prajjwal Sharma");
        	String ok = jedis.set("prajj", "Nill"); 
        	String okks = jedis.get("prajj");
            System.out.println(okks);
        }
    }
}
