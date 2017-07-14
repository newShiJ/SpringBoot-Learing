package learning.utils.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class RedisClient {
	
	@Autowired
	private JedisPool jedisPool;
	
	private ObjectMapper mapper = new ObjectMapper();
	
	public void set(String key,Object value){
		Jedis jedis = null;
		try{
			jedis = jedisPool.getResource();
			String valueAsString = mapper.writeValueAsString(value);
			jedis.set(key, valueAsString);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			jedis.close();
		}
	}
	
	public String get(String key){
		Jedis jedis = null;
		String string = null;
		try {
			jedis = jedisPool.getResource();
			string = jedis.get(key);			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			jedis.close();	
			return string;
		}				
	}
	
	public <T> T getObject(String key,Class<T> clazz){
		Jedis jedis = null;
		T value = null;
		try {
			jedis = jedisPool.getResource();
			String string = jedis.get(key);
			value = mapper.readValue(string,clazz);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			jedis.close();	
			return value;
		}		
	} 
}
