package com.learn.venkatspringdemo.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    public Docket sampleApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(regex("/rest.*"))
                .build();
    }

    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo(
                "Spring Boot REST API",
                "Spring Boot sample REST API",
                "1.0",
                "Terms of service",
                new Contact("Suresh Kumar", "https://yourwebsitedetails/about/", "sureshkumar.india.trainer@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0");
        return apiInfo;
    }
}
