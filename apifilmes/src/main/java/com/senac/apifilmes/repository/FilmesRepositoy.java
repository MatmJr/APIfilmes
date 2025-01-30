package com.senac.apifilmes.repository;

import com.senac.apifilmes.entity.Filmes;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmesRepositoy extends MongoRepository<Filmes, ObjectId> {
}
