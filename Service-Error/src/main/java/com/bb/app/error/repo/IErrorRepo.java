package com.bb.app.error.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bb.app.error.models.ErrorMonitor;

public interface IErrorRepo extends JpaRepository<ErrorMonitor, String>{

	

}
