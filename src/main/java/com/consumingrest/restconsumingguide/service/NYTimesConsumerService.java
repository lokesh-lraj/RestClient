package com.consumingrest.restconsumingguide.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consumingrest.restconsumingguide.dto.BestSellersListResponse;

@Service
public class NYTimesConsumerService {
	
	private static final String baseUrl = "https://api.nytimes.com/svc/books/v3";
	private static final String apiKey = "ohUkSWMUfRJ82btS9gmG4hKrPwSsMZpS";
	
	@Autowired
	@Qualifier("getRestTemplate")
	private RestTemplate restTemplate;
	
	public BestSellersListResponse getBestSellerList() {
		
		//Step-0, create uri
		final URI uri = URI.create(baseUrl+"/lists/names.json?api-key="+apiKey);
		System.out.println("Request Url -> "+uri.toString());
		
		//Setp-1, create HTTP Headers
		final HttpHeaders headers = new HttpHeaders();
		
		//Setp-2, 
		final ParameterizedTypeReference<BestSellersListResponse> responseBean = new ParameterizedTypeReference<BestSellersListResponse>() {};
		
		//Step-3, create a request entity
		final RequestEntity<?> entity = new RequestEntity<>(null, headers, HttpMethod.GET, uri);
		
		//Step-4 execute the rest.exchange() method
		final ResponseEntity<BestSellersListResponse> result = this.restTemplate.exchange(entity, responseBean);
		
		//Step-5, return result body
		return result.getBody();
	}
}
