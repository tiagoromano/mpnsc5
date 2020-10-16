package base.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TIPOS_ALERTAS
 * @generated
 */
@Entity
@Table(name = "\"TIPOS_ALERTAS\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("base.entity.TiposAlertas")
public class TiposAlertas implements Serializable {

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
  @Column(name = "DEFAULT_DELAY_SEG", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double defaultDelaySeg;

  /**
  * @generated
  */
  @Column(name = "DESCRICAO", nullable = false, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
   * Construtor
   * @generated
   */
  public TiposAlertas(){
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
  public TiposAlertas setId(java.lang.Double id){
    this.id = id;
    return this;
  }

  /**
   * Obtém defaultDelaySeg
   * return defaultDelaySeg
   * @generated
   */
  
  public java.lang.Double getDefaultDelaySeg(){
    return this.defaultDelaySeg;
  }

  /**
   * Define defaultDelaySeg
   * @param defaultDelaySeg defaultDelaySeg
   * @generated
   */
  public TiposAlertas setDefaultDelaySeg(java.lang.Double defaultDelaySeg){
    this.defaultDelaySeg = defaultDelaySeg;
    return this;
  }

  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  
  public java.lang.String getDescricao(){
    return this.descricao;
  }

  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public TiposAlertas setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    TiposAlertas object = (TiposAlertas)obj;
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
