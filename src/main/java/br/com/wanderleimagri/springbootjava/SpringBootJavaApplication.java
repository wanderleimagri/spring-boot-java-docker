package br.com.wanderleimagri.springbootjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.wanderleimagri.springbootjava")
@EntityScan(basePackages = "br.com.wanderleimagri.springbootjava.model")
public class SpringBootJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJavaApplication.class, args);
	}

}
