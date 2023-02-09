package co.simplon.stickmeAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class BcryptApplication {

    public static void main(String[] args) {
	SpringApplication.run(BcryptApplication.class,
		args);
    }

}
