package com.vj.spring;

import com.vj.spring.dao.EmployeeDAO;
import com.vj.spring.dao.impl.EmployeeDAOImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootMain implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(SpringBootMain.class);

	@Value("${app.name}")
	private String appName;

	@Value("${app.env}")
	private String env;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("SpringBootMain Started [appName] :" + appName);
		logger.info("SpringBootMain Started [env] :" + env);
	}

}
