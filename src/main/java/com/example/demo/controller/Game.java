package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Game {

	@RequestMapping("game")
	private String otherMe() {
		// TODO Auto-generated method stub
       return "index.html";
	}
}
