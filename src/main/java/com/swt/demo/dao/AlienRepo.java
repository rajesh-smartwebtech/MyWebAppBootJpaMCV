package com.swt.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.swt.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {

}
