package com.sftpapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

import com.sftpapplication.config.Config;

@SpringBootApplication

@IntegrationComponentScan
@EnableIntegration
public class SftpApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SftpApplication.class, args);

	}

	@Override
	public void run(String... arg0) throws Exception {
	}

}
