package com.bb.app.error.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bb.app.error.models.ErrorMonitor;
import com.bb.app.error.repo.IErrorRepo;
import com.bb.app.error.service.IErrorService;

@Service
public class ErrorServiceImpl implements IErrorService{

	@Autowired
	private IErrorRepo repo;

	@Override
	public ErrorMonitor registrar(ErrorMonitor e) {
		return repo.save(e);
	}

	@Override
	public ErrorMonitor modificar(ErrorMonitor e) {
		return repo.save(e);
	}

	@Override
	public ErrorMonitor leerPorId(String Id) {
		return repo.getReferenceById(Id);
	}

	@Override
	public Optional<ErrorMonitor> listar() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void eliminar(String Id) {
		// TODO Auto-generated method stub
		
	}
	
	

	

}
