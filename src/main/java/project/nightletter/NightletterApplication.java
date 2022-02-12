package project.nightletter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class NightletterApplication {

    public static void main(String[] args) {
        SpringApplication.run(NightletterApplication.class, args);
    }

}
