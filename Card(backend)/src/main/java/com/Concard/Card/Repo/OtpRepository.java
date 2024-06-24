package com.Concard.Card.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Concard.Card.Pojos.Otp;

public interface OtpRepository extends MongoRepository<Otp,Long> {
	
	Otp findByEmail(String email);
	
	
	
}
