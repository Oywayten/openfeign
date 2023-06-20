package ru.job4j.feign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Oywayten 19.06.2023.
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "ru.job4j.feign.service")
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}