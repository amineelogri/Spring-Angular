package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.persistance.Client;



@RestController
@RequestMapping("/Client")
public class initialController {

	public Client client;
	
	@RequestMapping(value = "/allUsers", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Client> getListeClient(){
		client=new Client("1", "el ogri", "amine");
		return new  ResponseEntity(client, HttpStatus.OK);
	}
	
}
