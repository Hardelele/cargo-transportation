package com.hardelele.ct;

import com.hardelele.ct.services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class CargoTransportationApplication {

    private final TripService tripService;

    @Autowired
    public CargoTransportationApplication(TripService tripService) {
        this.tripService = tripService;
    }

    public static void main(String[] args) {
        SpringApplication.run(CargoTransportationApplication.class, args);
    }

    @Bean
    public void fillTripsTable() {
        tripService.add("Санкт-Петербург","Москва",4,2,5000,"21 08 2019", "25 08 2019");
        tripService.add("Москва","Рига",3,5,9000,"18 08 2019", "26 08 2019");
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }

}
