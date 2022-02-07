/**
 * 
 */
package com.example.entrevueSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entrevueSpringBoot.entity.Film;

/**
 * @author ndiay
 *
 */
@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
	
}
