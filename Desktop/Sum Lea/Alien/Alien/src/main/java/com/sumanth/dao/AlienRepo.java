package com.sumanth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumanth.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

}
