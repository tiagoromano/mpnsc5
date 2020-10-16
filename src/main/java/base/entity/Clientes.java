package base.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CLIENTES
 * @generated
 */
@Entity
@Table(name = "\"CLIENTES\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("base.entity.Clientes")
public class Clientes implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID", nullable = false, insertable=true, updatable=true)
  private java.lang.Double id;

  /**
  * @generated
  */
  @Column(name = "NEGOCIO", nullable = false, unique = false, length=32, insertable=true, updatable=true)
  
  private java.lang.String negocio;

  /**
  * @generated
  */
  @Column(name = "NOME", nullable = false, unique = false, length=256, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "SIGLA", nullable = false, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.String sigla;

  /**
  * @generated
  */
  @Column(name = "STATUS", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String status;

  /**
   * Construtor
   * @generated
   */
  public Clientes(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.Double getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Clientes setId(java.lang.Double id){
    this.id = id;
    return this;
  }

  /**
   * Obtém negocio
   * return negocio
   * @generated
   */
  
  public java.lang.String getNegocio(){
    return this.negocio;
  }

  /**
   * Define negocio
   * @param negocio negocio
   * @generated
   */
  public Clientes setNegocio(java.lang.String negocio){
    this.negocio = negocio;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Clientes setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém sigla
   * return sigla
   * @generated
   */
  
  public java.lang.String getSigla(){
    return this.sigla;
  }

  /**
   * Define sigla
   * @param sigla sigla
   * @generated
   */
  public Clientes setSigla(java.lang.String sigla){
    this.sigla = sigla;
    return this;
  }

  /**
   * Obtém status
   * return status
   * @generated
   */
  
  public java.lang.String getStatus(){
    return this.status;
  }

  /**
   * Define status
   * @param status status
   * @generated
   */
  public Clientes setStatus(java.lang.String status){
    this.status = status;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Clientes object = (Clientes)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
