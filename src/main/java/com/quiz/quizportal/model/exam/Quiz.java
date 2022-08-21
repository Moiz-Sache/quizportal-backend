package com.quiz.quizportal.model.exam;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Quiz {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long qId;


	    private String title;

	    @Column(length = 5000)
	    private String description;

	    private String maxMarks;

	    private String numberOfQuestions;

	    private boolean active = false;
	    //add..

	    @ManyToOne(fetch = FetchType.EAGER)
	    private Category category;

	    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	    @JsonIgnore
	    private Set<Question> questions = new HashSet<>();


}
