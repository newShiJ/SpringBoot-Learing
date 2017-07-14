package learning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="learning.mapper")
public class AppStart {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(AppStart.class, args);
	}
}
