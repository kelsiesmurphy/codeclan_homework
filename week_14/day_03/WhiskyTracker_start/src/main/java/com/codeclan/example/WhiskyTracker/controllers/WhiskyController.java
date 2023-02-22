package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class WhiskyController {
    @Autowired
    WhiskyRepository whiskyRepository;

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "/whiskies")
    public ResponseEntity<List<Whisky>> getAllWhiskies(@RequestParam Optional<Integer> year, @RequestParam Optional<String> distilleryName, @RequestParam Optional<Integer> age, @RequestParam Optional<String> distilleryRegion) {
        if(year.isPresent()){
            return new ResponseEntity<>(whiskyRepository.findByYear(year.get()), HttpStatus.OK);
        } else if (distilleryName.isPresent() && age.isPresent()) {
            return new ResponseEntity<>(whiskyRepository.findByDistilleryNameAndAge(distilleryName.get(), age.get()), HttpStatus.OK);
        } else if (distilleryRegion.isPresent()) {
            return new ResponseEntity<>(whiskyRepository.findByDistilleryRegion(distilleryRegion.get()), HttpStatus.OK);
        }
        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
    }
}