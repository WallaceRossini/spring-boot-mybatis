package com.example.demo.controller;

import com.example.demo.model.Card;
import com.example.demo.model.User;
import com.example.demo.repository.CardRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    CardRepository cardRepository;

    @GetMapping("users/{email}")
    public User getUserById(@PathVariable String email)
    {
        return userRepository.selectUserById(email);
    }

    @GetMapping("cards/{id}")
    public Card getCardById(@PathVariable Integer id)
    {
        return cardRepository.selectCardById(id);
    }


}
