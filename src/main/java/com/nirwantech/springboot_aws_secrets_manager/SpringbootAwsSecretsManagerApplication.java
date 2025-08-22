package com.nirwantech.springboot_aws_secrets_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueResponse;

@SpringBootApplication
public class SpringbootAwsSecretsManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsSecretsManagerApplication.class, args);

	}

}
