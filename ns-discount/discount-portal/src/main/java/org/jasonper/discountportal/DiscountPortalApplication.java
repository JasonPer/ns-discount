package org.jasonper.discountportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.jasonper.discountportal", "org.jasonper.discountsecurity"})
public class DiscountPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscountPortalApplication.class, args);
    }

}
