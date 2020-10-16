package base.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiSearchable;


/**
 * Classe que representa a tabela VW_USUARIOS
 * @generated
 */
@Entity
@Table(name = "\"VW_USUARIOS\"", schema="\"DBACENTER_APP\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("base.entity.UsuariosSato")
public class UsuariosSato implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "CODIGO", nullable = false, insertable=true, updatable=true)
  private java.lang.Double id;

  /**
  * @generated
  */
  @Column(name = "NOME", nullable = false, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "RESPONSAVEL", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String flgResponsavel;

  /**
  * @generated
  */
  @Column(name = "CNTT_CODIGO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double cnttCodigo;

  /**
  * @generated
  */
  @Column(name = "CLIE_ID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String clieId;

  /**
  * @generated
  */
  @Column(name = "EMAIL", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String email;

  /**
  * @generated
  */
  @Column(name = "STATUS", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String status;

  /**
   * Construtor
   * @generated
   */
  public UsuariosSato(){
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
  public UsuariosSato setId(java.lang.Double id){
    this.id = id;
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
  public UsuariosSato setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém flgResponsavel
   * return flgResponsavel
   * @generated
   */
  
  public java.lang.String getFlgResponsavel(){
    return this.flgResponsavel;
  }

  /**
   * Define flgResponsavel
   * @param flgResponsavel flgResponsavel
   * @generated
   */
  public UsuariosSato setFlgResponsavel(java.lang.String flgResponsavel){
    this.flgResponsavel = flgResponsavel;
    return this;
  }

  /**
   * Obtém cnttCodigo
   * return cnttCodigo
   * @generated
   */
  
  public java.lang.Double getCnttCodigo(){
    return this.cnttCodigo;
  }

  /**
   * Define cnttCodigo
   * @param cnttCodigo cnttCodigo
   * @generated
   */
  public UsuariosSato setCnttCodigo(java.lang.Double cnttCodigo){
    this.cnttCodigo = cnttCodigo;
    return this;
  }

  /**
   * Obtém clieId
   * return clieId
   * @generated
   */
  
  public java.lang.String getClieId(){
    return this.clieId;
  }

  /**
   * Define clieId
   * @param clieId clieId
   * @generated
   */
  public UsuariosSato setClieId(java.lang.String clieId){
    this.clieId = clieId;
    return this;
  }

  /**
   * Obtém email
   * return email
   * @generated
   */
  
  public java.lang.String getEmail(){
    return this.email;
  }

  /**
   * Define email
   * @param email email
   * @generated
   */
  public UsuariosSato setEmail(java.lang.String email){
    this.email = email;
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
  public UsuariosSato setStatus(java.lang.String status){
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
    UsuariosSato object = (UsuariosSato)obj;
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
