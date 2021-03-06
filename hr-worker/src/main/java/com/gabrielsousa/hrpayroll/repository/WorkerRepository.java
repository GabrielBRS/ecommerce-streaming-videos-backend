package com.gabrielsousa.hrpayroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielsousa.hrpayroll.entities.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
