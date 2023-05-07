package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("Whats your name?");
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();
        Ohce ohce = new Ohce(name);
        String greeting = ohce.greet();
        System.out.println(greeting);

        boolean finished = false;

        while (!finished) {
            String input =sc.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                System.out.println(ohce.stop());
                finished = true;
                break ;
            }
            String revert= ohce.revertInput(input);
            System.out.println(revert);

        
            
        }
        sc.close();

	}
}
