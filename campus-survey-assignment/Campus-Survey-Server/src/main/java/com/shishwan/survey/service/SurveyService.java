package com.shishwan.survey.service;

import com.shishwan.survey.entities.Survey;
import com.shishwan.survey.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**

 This class represents the service layer for Survey entity, which interacts with the SurveyRepository and
 provides methods to retrieve and save Survey objects.
 */
@Service
public class SurveyService {


    @Autowired
    private SurveyRepository surveyRepository;

    /**
     * Returns a list of all Survey objects in the database.
     * @return a list of all Survey objects in the database.
     */
    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    /**
     * Saves a Survey object in the database and returns the saved object.
     * @param survey the Survey object to be saved.
     * @return the saved Survey object.
     */
    public Survey saveSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }
}
