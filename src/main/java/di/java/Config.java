package di.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"di.java"})
@Configuration
public class Config {

/*
	@Bean
	public Car car() {
		return new Car();
	}
	
	@Bean("hh")
	public Tire hankookTire() {
		return new HankookTire();
	}
	//<bean class="di.java.KeumhoTire" id="keumho"/>와 같은 기능.
//	@Bean("kk")
	@Bean(name = "keumho")
	public Tire keumhoTire() {
		return new KeumhoTire();
	}
	
*/
}
