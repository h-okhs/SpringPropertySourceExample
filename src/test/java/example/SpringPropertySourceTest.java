package example;

import static org.assertj.core.api.Assertions.assertThat;

import example.config.FooConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class SpringPropertySourceTest {

    @Autowired
    FooConfig fooConfig;

    @Test
    public void test() {
        assertThat(fooConfig.getBar().getSetting1()).isEqualTo("barbar1");
        assertThat(fooConfig.getBaz().getSetting2()).isEqualTo("bazbaz2");

    }
}
