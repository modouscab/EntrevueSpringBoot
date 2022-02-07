/**
 * 
 */
package com.example.entrevueSpringBoot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entrevueSpringBoot.entity.Film;
import com.example.entrevueSpringBoot.repository.FilmRepository;

/**
 * @author ndiay
 *
 */
@Service
public class FilmServiceImpl implements FilmService {
	
	@Autowired
	public FilmRepository filmRepository;

	@Override
	public Optional<Film> getFilm(Long id) {
		// TODO Auto-generated method stub
		return filmRepository.findById(id);
	}

	@Override
	public Film addFilm(Film film) {
		// TODO Auto-generated method stub
		film = filmRepository.save(film);
		return film;
	}

}
