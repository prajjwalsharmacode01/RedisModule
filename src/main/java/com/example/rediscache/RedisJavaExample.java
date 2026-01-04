package com.example.rediscache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RedisJavaExample {

	public static void main(String[] args) {

		ApplicationContext cx = SpringApplication.run(RedisJavaExample.class);
		RedisJavaExamples vv = cx.getBean(RedisJavaExamples.class);
		vv.testRedis();
		// Connect to Redis
//		Jedis jedis = new Jedis("localhost", 6379);
//		// SET value
//		jedis.set("user:name", "Prajjwal Sharma");
//		// GET value
//		String value = jedis.get("user:name");
//		System.out.println("Value from Redis: " + value);
//
//		// Close connection
//		jedis.close();
	}
}
