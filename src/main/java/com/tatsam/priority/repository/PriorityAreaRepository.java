package com.tatsam.priority.repository;

import com.tatsam.priority.model.PriorityAreaModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PriorityAreaRepository extends MongoRepository<PriorityAreaModel, String> {
}
