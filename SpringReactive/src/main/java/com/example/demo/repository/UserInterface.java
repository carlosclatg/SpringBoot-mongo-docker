package com.example.demo.repository;


import com.example.demo.mapping.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface UserInterface extends ReactiveMongoRepository<User, String> {
}
