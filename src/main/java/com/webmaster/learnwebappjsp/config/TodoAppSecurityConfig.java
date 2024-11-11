package com.webmaster.learnwebappjsp.config;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class TodoAppSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        UserDetails user1 = createUser("webbervino", "codeevo");
        UserDetails user2 = createUser("in28minutes", "dummy");
        return new InMemoryUserDetailsManager(user1, user2);
    }

    private UserDetails createUser(String username, String password) {
        Function <String, String> passwordEncoder = input -> passwordEncoder().encode(input);
        UserDetails user = User.builder().passwordEncoder(passwordEncoder).username(username).password(password)
                .roles("USER", "ADMIN").build();
        return user;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
