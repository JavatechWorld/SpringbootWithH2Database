package com.db.implementation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.db.implementation.model.Item;
import com.db.implementation.repository.ItemRepository;

@RestController
public class ItemController {

	@Autowired
	ItemRepository itemRepository;
	
	@PostMapping("/save")
	public String saveItems(@RequestBody Item item) {
		Item items = itemRepository.save(item);
		return "Items saved";
	}
	
	@GetMapping("/get")
	public List<Item> getItems() {
		List<Item> items = itemRepository.findAll();
		return items;
	}
	
}
