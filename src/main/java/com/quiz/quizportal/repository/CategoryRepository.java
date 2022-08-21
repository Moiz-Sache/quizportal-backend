package com.quiz.quizportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.quizportal.model.exam.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
