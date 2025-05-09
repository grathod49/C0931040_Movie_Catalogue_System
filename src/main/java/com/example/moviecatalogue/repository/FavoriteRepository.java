package com.example.moviecatalogue.repository;

import com.example.moviecatalogue.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteRepository extends JpaRepository<Movie, Long> {
}

