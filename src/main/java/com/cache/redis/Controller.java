package com.cache.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    private static final Logger log = LoggerFactory
	    .getLogger(Controller.class);

    @GetMapping
    @Cacheable("hello")
    public ResponseEntity<Product> hello() {
	log.info("chamou DB");

	return ResponseEntity.ok(Product.newProd("3", "Mul"));
    }

}
