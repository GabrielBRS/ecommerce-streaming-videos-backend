package com.gabrielsousa.hrpayroll.services;

//import java.util.HashMap;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import com.gabrielsousa.hrpayroll.entities.Payment;
import com.gabrielsousa.hrpayroll.entities.Worker;
import com.gabrielsousa.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
//	@Value("${hr-worker.host}")
//	private String workerHost;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(long workerId, int days) {
//		***Feito com RestTemplate***
		
//		Map<String, String> uriVariables = new HashMap<>();
//		uriVariables.put("id", ""+workerId);
//		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
