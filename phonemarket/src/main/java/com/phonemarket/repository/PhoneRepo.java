package com.phonemarket.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.phonemarket.domain.Phone;



public interface PhoneRepo extends CrudRepository<Phone, Long> {
List<Phone> findAll();
}
