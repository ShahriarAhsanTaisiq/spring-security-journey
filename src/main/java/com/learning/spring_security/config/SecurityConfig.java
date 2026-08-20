package com.learning.spring_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests( auth -> auth
                        .requestMatchers("/auth/register").permitAll()
                        .anyRequest().authenticated()
                )
                .csrf(csrf -> csrf.disable())
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {

        // These are the example of no encoding or hashing for Password (user1, user2)
        UserDetails user1 = User.withUsername("Admin1")
                .password("{noop}admin123") // {noop} means no encoding or hashing
                .roles("ADMIN")
                .build();

        UserDetails user2 = User.withUsername("User1")
                .password("{noop}user123") // {noop} means no encoding or hashing
                .roles("USER")
                .build();

        // Stored Hashed Password using bcrypt algorithm (Its first call DelegatePasswordEncoder --> BcryptPasswordEncoder)
        UserDetails user3 = User.withUsername("User2")
                .password("{bcrypt}" + new BCryptPasswordEncoder().encode("user123"))
                .roles("ADMIN")
                .build();

        // Stored Hashed Password using bcrypt algorithm (Its call BcryptPasswordEncoder)
        UserDetails user4 = User.withUsername("Admin2")
                .password(new BCryptPasswordEncoder().encode("Admin123"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user1, user2, user3);
    }

}
