package sec.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class CyberSecurityBaseProjectApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CyberSecurityBaseProjectApplication.class);
    }

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(CyberSecurityBaseProjectApplication.class);
    }
}
