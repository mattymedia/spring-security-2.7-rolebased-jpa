package co.com.jwtroledbase;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class JwtroledbasejpaApplication {
	
	@Autowired
    public static void main(String[] args) {
		SpringApplication.run(JwtroledbasejpaApplication.class, args);
	}
	
	@Bean
	CommandLineRunner lineRunner(BCryptPasswordEncoder encoder) {	
		return args -> {
			System.out.println("key admin: " + encoder.encode("admin"));
			System.out.println("key user: " + encoder.encode("user"));
			};
		
	}
	
		
}


