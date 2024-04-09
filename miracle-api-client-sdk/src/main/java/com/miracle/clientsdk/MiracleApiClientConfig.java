package com.miracle.clientsdk;

import com.miracle.clientsdk.client.MiracleApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author dargon
 * @create 2024-04-09
 * @description 客户端配置
 */
@Configuration
@ConfigurationProperties("miracle.client")
@Data
@ComponentScan
public class MiracleApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public MiracleApiClient huiApiClient() {
        return new MiracleApiClient(accessKey, secretKey);
    }

}
