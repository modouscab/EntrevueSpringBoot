package com.example.entrevueSpringBoot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entrevueSpringBoot.entity.Film;
import com.example.entrevueSpringBoot.service.FilmService;
import com.example.entrevueSpringBoot.service.FilmServiceImpl;

@RestController
@RequestMapping("/api/film")
public class FilmController {
	
	@Autowired
	private FilmServiceImpl filmServiceImpl;
	
	//chercher un film avec son id
	@GetMapping("/{id}")
	private Optional<Film> getFilm(@PathVariable Long id){
		return filmServiceImpl.getFilm(id);
	}
	
	//ajouter un film
	@PostMapping("")
	private Film addFilm(@RequestBody Film film) {
		filmServiceImpl.addFilm(film);
		return film;
	}

}
