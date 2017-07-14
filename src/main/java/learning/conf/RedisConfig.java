package learning.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig {
    
    @Bean(name= "jedis.pool")  
    @Autowired  
    public JedisPool jedisPool(){                 
        return new JedisPool("127.0.0.1",6379);  
    }  
      
    @Bean(name= "jedis.pool.config")  
    public JedisPoolConfig jedisPoolConfig () {  
        JedisPoolConfig config = new JedisPoolConfig();  
        return config;  
    }  
}
