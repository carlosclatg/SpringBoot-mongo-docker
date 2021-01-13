package com.example.demo.repository;

import com.example.demo.mapping.GisDocument;
import org.bson.Document;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface GisDocumentCrudRepository extends ReactiveMongoRepository<GisDocument, String> {
    Flux<GisDocument> findByCode(String code);
}
