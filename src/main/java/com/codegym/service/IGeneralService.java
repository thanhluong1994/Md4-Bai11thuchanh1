package com.codegym.service;

import java.util.Optional;

public interface IGeneralService <T>{
    Iterable<T> findAll();
    Optional<T> findByID(Long id);
    T save(T t);
    void remove(Long id);
}
