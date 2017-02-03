package com.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.festa.model.Convidado;

public interface Convidados extends JpaRepository <Convidado, Long> {

}
