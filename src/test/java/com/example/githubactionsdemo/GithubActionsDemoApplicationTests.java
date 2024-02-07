package com.example.githubactionsdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GithubActionsDemoApplicationTests {

    @Test
    void contextLoads() {
        // Given
            boolean bool;
        // When
            bool = true;
        // Then
        Assertions.assertTrue(bool);

    }

}
