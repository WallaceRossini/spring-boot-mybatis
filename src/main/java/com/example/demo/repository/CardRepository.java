package com.example.demo.repository;

import com.example.demo.model.Card;

public interface CardRepository {

    Card selectCardById(Integer id);
}
