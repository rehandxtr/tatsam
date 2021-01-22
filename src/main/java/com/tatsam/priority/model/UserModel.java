package com.tatsam.priority.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("users")
public class UserModel {
    @Id
    Long id;
    String userId;
    List<Preference> preferences;
}
@Data
class Preference {
    String priorityName;
    int priorityLevel;
    int satisfaction;
}
