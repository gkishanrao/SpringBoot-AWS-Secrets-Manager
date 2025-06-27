package com.nirwantech.springboot_aws_secrets_manager.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.nirwantech.springboot_aws_secrets_manager.Util.SecretManagerUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

@Configuration
public class StorageConfig {

    private static final String SECRET_NAME = "prod/aws/credentials";
    private static final String REGION = "us-east-1";


    @Bean
    public AmazonS3 s3Client() {
        Map<String, String> secrets = SecretManagerUtil.getSecretsCredentials(SECRET_NAME, Region.of(REGION));

        String accessKey = secrets.get("aws_access_key_id");
        String secretKey = secrets.get("aws_secret_access_key");
        System.out.println("✅ accessKey = " + accessKey);
        System.out.println("✅ secretKey = " + secretKey);
        if (accessKey == null || secretKey == null) {
            throw new IllegalStateException("Missing accessKey or secretKey in Secrets Manager response");
        }
        BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        System.out.println("✅ Creating AmazonS3 client");
        return AmazonS3ClientBuilder.standard()
                .withRegion(REGION)
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .build();
    }
}
