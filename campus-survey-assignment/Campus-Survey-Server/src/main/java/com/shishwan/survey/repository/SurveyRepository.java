package com.shishwan.survey.repository;

import com.shishwan.survey.entities.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**

 This interface extends JpaRepository to provide CRUD operations for Survey entities.
 It is annotated with @Repository to indicate that it is a Spring Data repository.
 The Survey entity is the managed entity type and Long is the type of its primary key.
 */
@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
}
