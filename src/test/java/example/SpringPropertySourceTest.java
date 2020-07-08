package example;

import static org.assertj.core.api.Assertions.assertThat;

import example.config.AwsConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class SpringPropertySourceTest {

    @Autowired
    AwsConfig awsConfig;

    @Test
    public void test() {
        assertThat(awsConfig.getSqs().getQueueName()).isEqualTo("queueue");
        assertThat(awsConfig.getCredential().getAccessKeyId()).isEqualTo("dummy");

    }
}
