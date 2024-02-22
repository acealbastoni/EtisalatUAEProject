package com.mohamedabdelhamid.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.mohamedabdelhamid.demo.*" })
@EnableJpaRepositories(basePackages = "com.mohamedabdelhamid.demo.*")
@EntityScan(basePackages = { "com.mohamedabdelhamid.demo.*" })
@ComponentScan({ "com.mohamedabdelhamid.demo.*" })
/*@SpringBootApplication(scanBasePackages = { "com.mohamedabdelhamid.demo" })
@EnableJpaRepositories(basePackages = "com.mohamedabdelhamid.demo.repositories")
@EntityScan(basePackages = { "com.mohamedabdelhamid.demo.domains" })
@ComponentScan(basePackages = { "com.mohamedabdelhamid.demo" })*/
public class EtisalatUaeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtisalatUaeProjectApplication.class, args);
	}

}
