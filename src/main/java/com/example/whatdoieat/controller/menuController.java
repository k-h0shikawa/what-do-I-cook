package com.example.whatdoieat.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.whatdoieat.Greeting;
import com.example.whatdoieat.entity.MenuEntity;
import com.example.whatdoieat.service.MenuService;

@RestController
public class menuController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

    @Autowired
    MenuService menuService;

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

    @CrossOrigin(origins="http://localhost:46157")
    @GetMapping(value="/menu")
    public List<MenuEntity> fetchMenuList(){
        return menuService.fetchMenu();
    }
    
    @GetMapping(value = "/canMakeMenu")
    public List<MenuEntity> fetchCanMakeMenus(){
        return menuService.fetchCanMakeMenus();
    }
}