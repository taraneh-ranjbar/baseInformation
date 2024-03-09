package org.bpj.baseInformation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BaseinformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseinformationApplication.class, args);
	}

}
