package com.nttdata.bootcamp.retoconfigservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

	@Value("${player.player-name}")
	private String name;
	
	@GetMapping(path="/info")
	public String getPlayerName() {
		return this.name;
	}
}
