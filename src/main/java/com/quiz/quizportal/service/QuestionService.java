package com.quiz.quizportal.service;

import java.util.Set;

import com.quiz.quizportal.model.exam.Question;
import com.quiz.quizportal.model.exam.Quiz;

public interface QuestionService {

	public Question addQuestion(Question question);

    public Question updateQuestion(Question question);

    public Set<Question> getQuestions();

    public Question getQuestion(Long questionId);

    public Set<Question> getQuestionsOfQuiz(Quiz quiz);

    public void deleteQuestion(Long quesId);
}
