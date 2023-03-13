package com.db.implementation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.implementation.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

	
}
