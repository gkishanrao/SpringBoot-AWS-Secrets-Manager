package com.nirwantech.springboot_aws_secrets_manager.Util;

import com.fasterxml.jackson.databind.ObjectMapper;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueResponse;

import java.util.Map;

public class SecretManagerUtil {
    public static Map<String, String> getSecretsCredentials(String secretName, Region region) {
        SecretsManagerClient client = SecretsManagerClient.builder()
                .region(region)
                .build();

        GetSecretValueRequest getSecretValueRequest = GetSecretValueRequest.builder()
                .secretId(secretName)
                .build();

        GetSecretValueResponse getSecretValueResponse;

        try {
            getSecretValueResponse = client.getSecretValue(getSecretValueRequest);
            String secret = getSecretValueResponse.secretString();
            System.out.println("🔐 Retrieved Secret JSON: " + secret);

            // Convert JSON string to Map
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(secret, Map.class);

        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve or parse secret", e);
        }
    }
}
