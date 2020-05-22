/**
 * 
 */
package com.platzi.ereservation.view.resource.vo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Clase que representa la tabla Cliente
 * @author GERZON ZAMBRANO
 * La anotación @Data de Lombok interpleta la clase como un pojo y crea internamente los getters and setters y los attributos como privados
 */
@Data
public class ClienteVO {

	private String idCli;
	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;

	

}
