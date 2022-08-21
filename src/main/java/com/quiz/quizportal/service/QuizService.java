package com.quiz.quizportal.service;

import java.util.List;
import java.util.Set;

import com.quiz.quizportal.model.exam.Category;
import com.quiz.quizportal.model.exam.Quiz;

public interface QuizService {

	public Quiz addQuiz(Quiz quiz);

    public Quiz updateQuiz(Quiz quiz);

    public Set<Quiz> getQuizzes();

    public Quiz getQuiz(Long quizId);

    public void deleteQuiz(Long quizId);


    public List<Quiz> getQuizzesOfCategory(Category category);

    public List<Quiz> getActiveQuizzes();

    public List<Quiz> getActiveQuizzesOfCategory(Category c);
}
