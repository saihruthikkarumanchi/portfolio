package com.shishwan.survey.controller;


import com.shishwan.survey.entities.Survey;
import com.shishwan.survey.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 The SurveyController class is a REST controller that handles HTTP requests related to the Survey entity.

 It exposes endpoints to get all surveys, create a new survey and get a welcome message.

 The controller uses the SurveyService to perform CRUD operations on Survey entities.
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/surveys")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    /**

     Endpoint to get a welcome message.
     @return a String representing the welcome message.
     */
    @GetMapping("/home")
    public  String home(){
        return "Campus Survey REST API Application";
    }


    /**
     Endpoint to get all surveys.
     @return a List of Survey entities.
     */
    @GetMapping
    public List<Survey> getAllSurveys() {
        return surveyService.getAllSurveys();
    }

    /**

     Endpoint to create a new survey.
     @param survey the Survey entity to be created.
     @return a ResponseEntity containing the saved Survey entity and an HTTP status code.
     */
    @PostMapping
    public ResponseEntity<Survey> createSurvey(@RequestBody Survey survey) {
        Survey savedSurvey = surveyService.saveSurvey(survey);
        if(savedSurvey!=null) {
        return new ResponseEntity<>(savedSurvey, HttpStatus.CREATED);
        }
        return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}