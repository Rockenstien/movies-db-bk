// package com.movies.moviesdb.security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.http.HttpMethod;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.web.SecurityFilterChain;

// public class SecurityConfig {
//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//         http
//             .csrf().disable()
//             .authorizeHttpRequests((requests) -> requests
// 				.requestMatchers(HttpMethod.GET).permitAll()
// 				.anyRequest().authenticated()
// 			)
//             .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

//         return http.build();
//     }
// }
