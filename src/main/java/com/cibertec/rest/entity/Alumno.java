package com.cibertec.rest.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "alumno")
@Getter
@Setter
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int idAlumno;
	private String nombres;
	private String apellidos;
	private String dni;
	private String direccion;
	private String correo;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd" , timezone = "America/Lima")
	private Date fechaNacimiento;

	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", timezone = "America/Lima")
	private Date fechaRegistro;

	private int estado;	
}
