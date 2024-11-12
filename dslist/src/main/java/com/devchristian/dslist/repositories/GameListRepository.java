package com.devchristian.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devchristian.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> { }



