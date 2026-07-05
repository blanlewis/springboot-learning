package com.amigoscode.springbootlearning.nextjsbasics.config;

import com.amigoscode.springbootlearning.nextjsbasics.repository.UserRepository;
import com.amigoscode.springbootlearning.nextjsbasics.util.UserData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseSeeder {

    @Bean
    CommandLineRunner seedDatabase(UserRepository userRepository) {

        return args -> {

            if (userRepository.count() == 0) {

                userRepository.saveAll(UserData.getUsers());

                System.out.println("Users inserted into PostgreSQL.");

            }

        };
    }
}