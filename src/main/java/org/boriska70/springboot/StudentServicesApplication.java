package org.boriska70.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class StudentServicesApplication extends SpringBootServletInitializer {

	//This method and extending SpringBootServletInitializer in general only needed for creating deployable war-file
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(StudentServicesApplication.class);
    }
    
	public static void main(String[] args) {
		SpringApplication.run(StudentServicesApplication.class, args);
	}
}
