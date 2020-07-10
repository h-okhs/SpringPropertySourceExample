package example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "foo")
@Component
@PropertySource(value = {"classpath:/foo-config.yml",
    "classpath:/foo-config-${spring.profiles.active}.yml"},
    factory = YamlPropertySourceFactory.class)
@Data
public class FooConfig {

    private BarConfig bar;
    private BazConfig baz;

    @Data
    public static class BarConfig {
        private String setting1;
    }

    @Data
    public static class BazConfig {
        private String setting1;
        private String setting2;
    }
}
