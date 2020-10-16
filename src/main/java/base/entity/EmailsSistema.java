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
 * Classe que representa a tabela STAT_ENVIO_EMAIL
 * @generated
 */
@Entity
@Table(name = "\"STAT_ENVIO_EMAIL\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("base.entity.EmailsSistema")
public class EmailsSistema implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "CODI_EMAI", nullable = false, insertable=true, updatable=true)
  private java.lang.Double id;

  /**
  * @generated
  */
  @Column(name = "CODI_REME_EMAI", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double codiRemeEmail;

  /**
  * @generated
  */
  @Column(name = "DEST_EMAI", nullable = true, unique = false, length=500, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String destinatario;

  /**
  * @generated
  */
  @Column(name = "SUBJ_EMAI", nullable = true, unique = false, length=200, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String assunto;

  /**
  * @generated
  */
  @Column(name = "BODY_EMAI", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String corpoEmail;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_EMAI", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataEmail;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_PROC", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataProcessamento;

  /**
  * @generated
  */
  @Column(name = "ENVIADO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String flgEnviado;

  /**
  * @generated
  */
  @Column(name = "SPOOL_ENVIO", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String spool;

  /**
  * @generated
  */
  @Column(name = "BANC_ID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double idBanco;

  /**
  * @generated
  */
  @Column(name = "STATUS", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String status;

  /**
  * @generated
  */
  @Column(name = "SHOW_STAT", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String flgShw;

  /**
  * @generated
  */
  @Column(name = "CODI_USUA", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String codiUsua;

  /**
   * Construtor
   * @generated
   */
  public EmailsSistema(){
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
  public EmailsSistema setId(java.lang.Double id){
    this.id = id;
    return this;
  }

  /**
   * Obtém codiRemeEmail
   * return codiRemeEmail
   * @generated
   */
  
  public java.lang.Double getCodiRemeEmail(){
    return this.codiRemeEmail;
  }

  /**
   * Define codiRemeEmail
   * @param codiRemeEmail codiRemeEmail
   * @generated
   */
  public EmailsSistema setCodiRemeEmail(java.lang.Double codiRemeEmail){
    this.codiRemeEmail = codiRemeEmail;
    return this;
  }

  /**
   * Obtém destinatario
   * return destinatario
   * @generated
   */
  
  public java.lang.String getDestinatario(){
    return this.destinatario;
  }

  /**
   * Define destinatario
   * @param destinatario destinatario
   * @generated
   */
  public EmailsSistema setDestinatario(java.lang.String destinatario){
    this.destinatario = destinatario;
    return this;
  }

  /**
   * Obtém assunto
   * return assunto
   * @generated
   */
  
  public java.lang.String getAssunto(){
    return this.assunto;
  }

  /**
   * Define assunto
   * @param assunto assunto
   * @generated
   */
  public EmailsSistema setAssunto(java.lang.String assunto){
    this.assunto = assunto;
    return this;
  }

  /**
   * Obtém corpoEmail
   * return corpoEmail
   * @generated
   */
  
  public java.lang.String getCorpoEmail(){
    return this.corpoEmail;
  }

  /**
   * Define corpoEmail
   * @param corpoEmail corpoEmail
   * @generated
   */
  public EmailsSistema setCorpoEmail(java.lang.String corpoEmail){
    this.corpoEmail = corpoEmail;
    return this;
  }

  /**
   * Obtém dataEmail
   * return dataEmail
   * @generated
   */
  
  public java.util.Date getDataEmail(){
    return this.dataEmail;
  }

  /**
   * Define dataEmail
   * @param dataEmail dataEmail
   * @generated
   */
  public EmailsSistema setDataEmail(java.util.Date dataEmail){
    this.dataEmail = dataEmail;
    return this;
  }

  /**
   * Obtém dataProcessamento
   * return dataProcessamento
   * @generated
   */
  
  public java.util.Date getDataProcessamento(){
    return this.dataProcessamento;
  }

  /**
   * Define dataProcessamento
   * @param dataProcessamento dataProcessamento
   * @generated
   */
  public EmailsSistema setDataProcessamento(java.util.Date dataProcessamento){
    this.dataProcessamento = dataProcessamento;
    return this;
  }

  /**
   * Obtém flgEnviado
   * return flgEnviado
   * @generated
   */
  
  public java.lang.String getFlgEnviado(){
    return this.flgEnviado;
  }

  /**
   * Define flgEnviado
   * @param flgEnviado flgEnviado
   * @generated
   */
  public EmailsSistema setFlgEnviado(java.lang.String flgEnviado){
    this.flgEnviado = flgEnviado;
    return this;
  }

  /**
   * Obtém spool
   * return spool
   * @generated
   */
  
  public java.lang.String getSpool(){
    return this.spool;
  }

  /**
   * Define spool
   * @param spool spool
   * @generated
   */
  public EmailsSistema setSpool(java.lang.String spool){
    this.spool = spool;
    return this;
  }

  /**
   * Obtém idBanco
   * return idBanco
   * @generated
   */
  
  public java.lang.Double getIdBanco(){
    return this.idBanco;
  }

  /**
   * Define idBanco
   * @param idBanco idBanco
   * @generated
   */
  public EmailsSistema setIdBanco(java.lang.Double idBanco){
    this.idBanco = idBanco;
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
  public EmailsSistema setStatus(java.lang.String status){
    this.status = status;
    return this;
  }

  /**
   * Obtém flgShw
   * return flgShw
   * @generated
   */
  
  public java.lang.String getFlgShw(){
    return this.flgShw;
  }

  /**
   * Define flgShw
   * @param flgShw flgShw
   * @generated
   */
  public EmailsSistema setFlgShw(java.lang.String flgShw){
    this.flgShw = flgShw;
    return this;
  }

  /**
   * Obtém codiUsua
   * return codiUsua
   * @generated
   */
  
  public java.lang.String getCodiUsua(){
    return this.codiUsua;
  }

  /**
   * Define codiUsua
   * @param codiUsua codiUsua
   * @generated
   */
  public EmailsSistema setCodiUsua(java.lang.String codiUsua){
    this.codiUsua = codiUsua;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    EmailsSistema object = (EmailsSistema)obj;
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
