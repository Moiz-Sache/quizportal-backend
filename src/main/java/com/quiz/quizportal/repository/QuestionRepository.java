package com.quiz.quizportal.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.quizportal.model.exam.Question;
import com.quiz.quizportal.model.exam.Quiz;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Set<Question> findByQuiz(Quiz quiz);
}