package com.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TiendaproyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaproyectoApplication.class, args);
	}

}
