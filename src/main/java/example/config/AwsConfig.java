package example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "aws")
@Component
@PropertySource(value = {"classpath:/common-application.yaml","classpath:/common-application-${spring.profiles.active}.yaml"}, factory = YamlPropertySourceFactory.class)
@Data
public class AwsConfig {

    private AwsSqsConfig sqs;
    private AwsCredentialConfig credential;

    @Data
    public static class AwsSqsConfig {
        private String queueName;
    }
    @Data
    public static class AwsCredentialConfig {
        private String accessKeyId;
        private String secretKey;
    }
}
