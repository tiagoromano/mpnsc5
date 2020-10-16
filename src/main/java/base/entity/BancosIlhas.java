package base.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela BANCOS_ILHAS
 * @generated
 */
@Entity
@Table(name = "\"BANCOS_ILHAS\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("base.entity.BancosIlhas")
public class BancosIlhas implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "CODI_ILHA", nullable = false, insertable=true, updatable=true)
  private java.lang.Double codiIlha;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_ULT_ACESSO", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataUltAcesso;

  /**
  * @generated
  */
  @Column(name = "DESC_ILHA", nullable = false, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String descIlha;

  /**
  * @generated
  */
  @Column(name = "SERVER_ENVIA_EMAIL", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String serverEnviaEmail;

  /**
  * @generated
  */
  @Column(name = "SERVER_NAME", nullable = false, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String serverName;

  /**
  * @generated
  */
  @Column(name = "STAT_ILHA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String statIlha;

  /**
  * @generated
  */
  @Column(name = "URL", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String url;

  /**
  * @generated
  */
  @Column(name = "URL_POLOMONITOR", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String urlPolomonitor;

  /**
   * Construtor
   * @generated
   */
  public BancosIlhas(){
  }


  /**
   * Obtém codiIlha
   * return codiIlha
   * @generated
   */
  
  public java.lang.Double getCodiIlha(){
    return this.codiIlha;
  }

  /**
   * Define codiIlha
   * @param codiIlha codiIlha
   * @generated
   */
  public BancosIlhas setCodiIlha(java.lang.Double codiIlha){
    this.codiIlha = codiIlha;
    return this;
  }

  /**
   * Obtém dataUltAcesso
   * return dataUltAcesso
   * @generated
   */
  
  public java.util.Date getDataUltAcesso(){
    return this.dataUltAcesso;
  }

  /**
   * Define dataUltAcesso
   * @param dataUltAcesso dataUltAcesso
   * @generated
   */
  public BancosIlhas setDataUltAcesso(java.util.Date dataUltAcesso){
    this.dataUltAcesso = dataUltAcesso;
    return this;
  }

  /**
   * Obtém descIlha
   * return descIlha
   * @generated
   */
  
  public java.lang.String getDescIlha(){
    return this.descIlha;
  }

  /**
   * Define descIlha
   * @param descIlha descIlha
   * @generated
   */
  public BancosIlhas setDescIlha(java.lang.String descIlha){
    this.descIlha = descIlha;
    return this;
  }

  /**
   * Obtém serverEnviaEmail
   * return serverEnviaEmail
   * @generated
   */
  
  public java.lang.String getServerEnviaEmail(){
    return this.serverEnviaEmail;
  }

  /**
   * Define serverEnviaEmail
   * @param serverEnviaEmail serverEnviaEmail
   * @generated
   */
  public BancosIlhas setServerEnviaEmail(java.lang.String serverEnviaEmail){
    this.serverEnviaEmail = serverEnviaEmail;
    return this;
  }

  /**
   * Obtém serverName
   * return serverName
   * @generated
   */
  
  public java.lang.String getServerName(){
    return this.serverName;
  }

  /**
   * Define serverName
   * @param serverName serverName
   * @generated
   */
  public BancosIlhas setServerName(java.lang.String serverName){
    this.serverName = serverName;
    return this;
  }

  /**
   * Obtém statIlha
   * return statIlha
   * @generated
   */
  
  public java.lang.String getStatIlha(){
    return this.statIlha;
  }

  /**
   * Define statIlha
   * @param statIlha statIlha
   * @generated
   */
  public BancosIlhas setStatIlha(java.lang.String statIlha){
    this.statIlha = statIlha;
    return this;
  }

  /**
   * Obtém url
   * return url
   * @generated
   */
  
  public java.lang.String getUrl(){
    return this.url;
  }

  /**
   * Define url
   * @param url url
   * @generated
   */
  public BancosIlhas setUrl(java.lang.String url){
    this.url = url;
    return this;
  }

  /**
   * Obtém urlPolomonitor
   * return urlPolomonitor
   * @generated
   */
  
  public java.lang.String getUrlPolomonitor(){
    return this.urlPolomonitor;
  }

  /**
   * Define urlPolomonitor
   * @param urlPolomonitor urlPolomonitor
   * @generated
   */
  public BancosIlhas setUrlPolomonitor(java.lang.String urlPolomonitor){
    this.urlPolomonitor = urlPolomonitor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    BancosIlhas object = (BancosIlhas)obj;
    if (codiIlha != null ? !codiIlha.equals(object.codiIlha) : object.codiIlha != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((codiIlha == null) ? 0 : codiIlha.hashCode());
    return result;
  }

}
