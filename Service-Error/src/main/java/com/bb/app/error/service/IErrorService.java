package com.bb.app.error.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bb.app.error.models.Error;

public interface IErrorService extends JpaRepository<Error, String>{

}
