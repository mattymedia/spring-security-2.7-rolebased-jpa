package co.com.jwtroledbase.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import co.com.jwtroledbase.service.jpaUserDetailsService;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
	
	private jpaUserDetailsService jpaUserDetailsService;	

	public SecurityConfig(jpaUserDetailsService jpaUserDetailsService) {
		this.jpaUserDetailsService = jpaUserDetailsService;
	}

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http
				.csrf(csrfParam-> csrfParam.ignoringAntMatchers("/h2-console/**"))//prohibir el acceso a terceros
				.authorizeRequests(authParam -> 
						authParam
						.antMatchers("/h2-console/**").permitAll()//permitir el acceso desde la url de la api
						.mvcMatchers("/api/list").permitAll()
						.anyRequest().authenticated()//demas peticiones con autorizacion
						)
				.userDetailsService(jpaUserDetailsService)
				.headers(headersParam -> headersParam.frameOptions().sameOrigin())
				.httpBasic(Customizer.withDefaults())
				.build();
	}
	
	//codificando las claves de los usuarios
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
