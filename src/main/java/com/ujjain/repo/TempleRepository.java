package com.ujjain.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ujjain.entity.Temple;

@Repository
public interface TempleRepository extends MongoRepository<Temple, Long> {

}
