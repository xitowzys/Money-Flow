package me.xitowzys.bootloader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MoneyFlowApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyFlowApplication.class, args);
	}

}
