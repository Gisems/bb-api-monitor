package com.bb.app.error.models;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="ERRORS")
public class ErrorMonitor {


	@Id
	@GeneratedValue(generator = "uuid", strategy = GenerationType.AUTO)
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(length = 36, name = "ID_ERROR")
	private String idError;
	
	
	@Column(name="API_NAME")
	private String apiName;

	@Column(name="API_DESCRIPTION")
	private String apiDescription;
	
	@Column(name= "ERROR_CODE")
	private String errorCode;
	
	@Column(name= "ERROR_DETAIL")
	private String errorDetail;
	
	@Column(name = "DATE_ERROR")
	private Date dateError;


}
