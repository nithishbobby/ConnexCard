package com.Concard.Card.Repo;

import com.Concard.Card.Pojos.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
    User findByPhoneNumber(String phoneNumber);
}
