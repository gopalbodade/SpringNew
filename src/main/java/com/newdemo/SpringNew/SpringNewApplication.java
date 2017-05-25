package com.newdemo.SpringNew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.*;


@RestController
@SpringBootApplication
public class SpringNewApplication {
    @RequestMapping(value="/add")
	public int add(@PathVariable int a,@PathVariable int b)
    {

        int z=a+b;
        return z;
    }



	public static void main(String[] args) {
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiii");
		SpringApplication.run(SpringNewApplication.class, args);
	}
}
