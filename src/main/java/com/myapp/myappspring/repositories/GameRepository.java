package com.myapp.myappspring.repositories;

import com.myapp.myappspring.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
