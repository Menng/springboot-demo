package org.springboot.jar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JarApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(JarApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("ddddddddd");
    }
}
