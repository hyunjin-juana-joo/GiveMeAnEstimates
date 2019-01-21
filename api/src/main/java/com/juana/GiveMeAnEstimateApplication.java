package com.juana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.data.convert.Jsr310Converters;


@SpringBootApplication(exclude = {
		DataSourceTransactionManagerAutoConfiguration.class,
		DataSourceAutoConfiguration.class
},
		scanBasePackages = {
				"com.juana"
		}
)
@EntityScan(basePackageClasses = {Jsr310Converters.class})
public class GiveMeAnEstimateApplication {
	public static void main(String[] args) {
		SpringApplication.run(GiveMeAnEstimateApplication.class, args);
	}
}
