package com.tatsam.priority.controller;

import com.tatsam.priority.model.PriorityAreaModel;
import com.tatsam.priority.repository.PriorityAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priority")
public class PriorityAreaController {

    @Autowired
    PriorityAreaRepository priorityAreaRepository;

    @GetMapping()
    public ResponseEntity<List<PriorityAreaModel>> getPriorityAreas(){
        return new ResponseEntity<>(priorityAreaRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> addPriorityArea(@RequestBody PriorityAreaModel priorityArea){
        priorityAreaRepository.save(priorityArea);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
