package com.jacaranda.miPrimeraApi.repository;

import javax.swing.Spring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jacaranda.miPrimeraApi.model.State;

public interface StateRepository extends JpaRepository<State, String> {

}
