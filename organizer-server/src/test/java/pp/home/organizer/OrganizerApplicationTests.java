package pp.home.organizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.containers.PostgreSQLContainer;

@Configuration
public class OrganizerApplicationTests {

    public static void main(String[] args) {
        SpringApplication
                .from(OrganizerApplication::main)
                .with(OrganizerApplicationTests.class)
                .run(args);
    }

    @Bean
    @RestartScope
    @ServiceConnection
    PostgreSQLContainer postgreSQLContainer() {
        return new PostgreSQLContainer<>("postgres:latest");
    }
}
