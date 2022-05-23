package com.gabrielsousa.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
//Se ouver mais instâncias do microserviço é nessário usar o Ribbon 
//ou LoadBalancerClient

//@LoadBalancerClient(name="hr-worker")
//@EnableDiscoveryClient

public class HrPayrollApplication {
	public static void main(String[] args) {
		SpringApplication.run(HrPayrollApplication.class, args);
	}
}
