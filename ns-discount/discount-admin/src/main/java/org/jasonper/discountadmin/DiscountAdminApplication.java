package org.jasonper.discountadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.jasonper.discountadmin", "org.jasonper.discountsecurity"})
public class DiscountAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscountAdminApplication.class, args);
    }

}
