package com.tatsam.priority.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("priority")
public class PriorityAreaModel {
    @Id
    Long id;
    String priorityArea;
}
