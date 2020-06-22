package com.laratecsys.inpaktaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class RestClient {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String loginUser(CredenciaisDTO obj) {
		
		String url = "http://localhost:8090/login";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<CredenciaisDTO> requestEntity = new HttpEntity<>(obj,headers);
	
		ResponseEntity<String> login = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
		
		return login.getBody();
		
	}

}
