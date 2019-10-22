package com.tutospringvue.backend.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
//@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Value("${app.origins}")
    private String[] origins;
    @Value("${app.methods}")
    private String[] methods;
    @Value("${app.headers}")
    private String[] headers;
    @Value("${app.access-control-age}")
    private Long maxAge;


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(origins)
                .allowedHeaders(headers)
                .allowedMethods(methods)
                .maxAge(maxAge);
    }

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("forward:/index.html");
//    }
//
//        @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**")
//                .addResourceLocations("classpath:/static/");
//    }
}
