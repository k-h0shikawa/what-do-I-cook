package com.example.whatdoieat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.whatdoieat.dao")
public class WhatDoIEatApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatDoIEatApplication.class, args);
	}

}
