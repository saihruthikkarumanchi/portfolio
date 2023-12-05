package com.shishwan.survey.entities;

import javax.persistence.*;
import java.util.Date;


/**

 Represents a survey entity with attributes like first name, last name, street address, city, state, zip,
 telephone number, email, date of survey,what the user liked most about the campus,
 how the user became interested in the campus, the likelihood of the user recommending the campus to others,
 and any additional comments the user may have. The entity is mapped to a table named "survey" in the database.
 */
@Entity
@Table(name = "survey")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "street_address", nullable = false)
    private String streetAddress;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String zip;

    @Column(name = "telephone_number", nullable = false)
    private String telephoneNumber;

    @Column(nullable = false)
    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_of_survey", nullable = false)
    private Date dateOfSurvey;

    @Column(name = "liked_most_about_campus", nullable = false)
    private String likedMostAboutCampus;

    @Column(name = "how_became_interested", nullable = false)
    private String howBecameInterested;

    @Column(name = "likelihood_of_recommending", nullable = false)
    private String likelihoodOfRecommending;

    @Column(name = "additional_comments", length = 1000)
    private String additionalComments;

    // getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfSurvey() {
        return dateOfSurvey;
    }

    public void setDateOfSurvey(Date dateOfSurvey) {
        this.dateOfSurvey = dateOfSurvey;
    }

    public String getLikedMostAboutCampus() {
        return likedMostAboutCampus;
    }

    public void setLikedMostAboutCampus(String likedMostAboutCampus) {
        this.likedMostAboutCampus = likedMostAboutCampus;
    }

    public String getHowBecameInterested() {
        return howBecameInterested;
    }

    public void setHowBecameInterested(String howBecameInterested) {
        this.howBecameInterested = howBecameInterested;
    }

    public String getLikelihoodOfRecommending() {
        return likelihoodOfRecommending;
    }

    public void setLikelihoodOfRecommending(String likelihoodOfRecommending) {
        this.likelihoodOfRecommending = likelihoodOfRecommending;
    }

    public String getAdditionalComments() {
        return additionalComments;
    }

    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
    }
}
