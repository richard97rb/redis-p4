package com.example.redis.config;

import com.example.redis.domain.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

@Configuration
public class RedisConfiguration {

    @Bean
    JedisConnectionFactory jedisConnectionFactory(){
        return new JedisConnectionFactory();
    }

    @Bean
    RedisTemplate<String, Student> redisTemplate(){
        final RedisTemplate<String, Student> redisTemplate= new RedisTemplate<String, Student>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());

        return redisTemplate;
    }

}
