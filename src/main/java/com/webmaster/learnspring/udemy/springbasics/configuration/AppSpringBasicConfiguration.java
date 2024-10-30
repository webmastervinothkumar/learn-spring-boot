package com.webmaster.learnspring.udemy.springbasics.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Game(String name) {};
record Person(String name, int age, Address address) {};
record Address(String street, String city) {};
@Configuration
public class AppSpringBasicConfiguration {
        @Bean
        public String getGreeting() {
                return "Hello World!";
        }

        @Bean
        public String getGameName() {
                return new Game("Mario").name();
        }

        @Bean
        public String name() {
            return "Mario";
        }

        @Bean
        public int age() {
            return 30;
        }  

        @Bean
        public Person person() {
            return new Person("Mario", 30, new Address("Main Street", "London"));
        }

        @Bean(name = "address2")
        public Address address() {
            return new Address("Main Street", "London");
        }


        @Bean
        public Person person2MethodCall() {
            return new Person(name(), age(), address());
        }

        @Bean
        public Person person3Parameters(String name, int age, Address address) {
            return new Person(name, age, address);
        }
}
