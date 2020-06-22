package com.laratecsys.inpaktaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestClientSpringBootApplication implements CommandLineRunner{

	@Autowired
	private RestClient restClient;
	
	@Bean
	public RestTemplate restTemplate()  {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RestClientSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		CredenciaisDTO obj = new CredenciaisDTO("tiagolararibeiro1998@gmail.com", "1234");
		
		System.out.println(restClient.loginUser(obj));
		
	}

}
