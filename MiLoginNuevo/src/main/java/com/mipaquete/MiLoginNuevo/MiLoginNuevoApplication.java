package com.mipaquete.MiLoginNuevo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MiLoginNuevoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiLoginNuevoApplication.class, args);
	}

}
