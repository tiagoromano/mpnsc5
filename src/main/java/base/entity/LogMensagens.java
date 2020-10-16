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
 * Classe que representa a tabela VW_LOG_MENSAGENS_ID
 * @generated
 */
@Entity
@Table(name = "\"VW_LOG_MENSAGENS_ID\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("base.entity.LogMensagens")
public class LogMensagens implements Serializable {

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
  @Column(name = "MENSAGEM", nullable = false, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String mensagem;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "DATA_GERACAO", nullable = false, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
  @CronapiSearchable
  
  private java.util.Date dataGeracao;

  /**
   * Construtor
   * @generated
   */
  public LogMensagens(){
  }


  /**
   * Obtém mensagem
   * return mensagem
   * @generated
   */
  
  public java.lang.String getMensagem(){
    return this.mensagem;
  }

  /**
   * Define mensagem
   * @param mensagem mensagem
   * @generated
   */
  public LogMensagens setMensagem(java.lang.String mensagem){
    this.mensagem = mensagem;
    return this;
  }

  /**
   * Obtém dataGeracao
   * return dataGeracao
   * @generated
   */
  
  public java.util.Date getDataGeracao(){
    return this.dataGeracao;
  }

  /**
   * Define dataGeracao
   * @param dataGeracao dataGeracao
   * @generated
   */
  public LogMensagens setDataGeracao(java.util.Date dataGeracao){
    this.dataGeracao = dataGeracao;
    return this;
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
  public LogMensagens setId(java.lang.Double id){
    this.id = id;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    LogMensagens object = (LogMensagens)obj;
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
