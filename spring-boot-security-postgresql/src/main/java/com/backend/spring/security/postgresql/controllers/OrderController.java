
package com.backend.spring.security.postgresql.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.spring.security.postgresql.models.Order;
import com.backend.spring.security.postgresql.models.Product;
import com.backend.spring.security.postgresql.repository.OrderRepository;

import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.MediaType;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    OrderRepository repository;

    @ResponseBody
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Order setOrder(@RequestBody Order neworder) {
        //Spliterator<Product> products = 
        return repository.save(neworder);
        
    }
}