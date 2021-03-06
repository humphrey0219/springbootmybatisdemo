package info.linianjun.springbootmybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("info.linianjun.springbootmybatisdemo.mapper")
public class SpringbootmybatisdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmybatisdemoApplication.class, args);
	}
}
