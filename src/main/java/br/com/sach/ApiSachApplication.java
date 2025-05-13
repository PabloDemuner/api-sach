package br.com.sach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ApiSachApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSachApplication.class, args);
	}

}
