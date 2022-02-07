package com.example.entrevueSpringBoot.service;

import java.util.Optional;

import com.example.entrevueSpringBoot.entity.Film;

public interface FilmService {
	public Optional<Film> getFilm(Long id);
	public Film addFilm(Film film);
}
