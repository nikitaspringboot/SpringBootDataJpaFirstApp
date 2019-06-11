package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		
		Product p = repo.save(new Product("A", 2.3));
		System.out.println(p);
		repo.save(new Product("B", 3.3));
		repo.save(new Product("C", 4.3));
		repo.save(new Product("D", 5.3));
		repo.save(new Product("E", 6.3));
		repo.save(new Product("F", 7.3));
	}

}
