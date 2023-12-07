package com.bb.app.error.service;

import java.util.Optional;

import com.bb.app.error.models.ErrorMonitor;

public interface IErrorService {
	
	ErrorMonitor registrar(ErrorMonitor e);
	ErrorMonitor modificar(ErrorMonitor e);
	ErrorMonitor leerPorId(String Id);
	Optional<ErrorMonitor> listar();
	void eliminar(String Id);
	

}
