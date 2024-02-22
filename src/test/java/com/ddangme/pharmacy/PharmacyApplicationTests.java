package com.ddangme.pharmacy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@ActiveProfiles("test")
@EnableConfigurationProperties
class PharmacyApplicationTests {

    @Test
    void contextLoads() {
    }

}
