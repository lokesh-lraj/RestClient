package com.consumingrest.restconsumingguide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumingrest.restconsumingguide.dto.BestSellersListResponse;
import com.consumingrest.restconsumingguide.service.NYTimesConsumerService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/nytimes")
public class RestConsumerController {

	@Autowired
	private NYTimesConsumerService nytimesService;
	
	@GetMapping("/bestSeller")
	public BestSellersListResponse getBestSellerList() {
		return this.nytimesService.getBestSellerList();
	}
}
