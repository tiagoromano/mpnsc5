package reports.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ALERTAS_COLETA
 * @generated
 */
@Entity
@Table(name = "\"ALERTAS_COLETA\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.AlertasColeta")
public class AlertasColeta implements Serializable {

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
  @Column(name = "ATIVIDADE_PADRAO", nullable = true, unique = false, length=1000, insertable=true, updatable=true)
  
  private java.lang.String atividadePadrao;

  /**
  * @generated
  */
  @Column(name = "DESCRICAO", nullable = false, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
  * @generated
  */
  @Column(name = "DESCRICAO_ES_LA", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String descricaoEsLa;

  /**
  * @generated
  */
  @Column(name = "DESCRICAO_US_EN", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String descricaoUsEn;

  /**
  * @generated
  */
  @Column(name = "FLG_ENVIA_EMAIL_CLIENTE", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String flgEnviaEmailCliente;

  /**
  * @generated
  */
  @Column(name = "QTD_ATRASOS_DEFAULT", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double qtdAtrasosDefault;

  /**
  * @generated
  */
  @Column(name = "SERVICO", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  
  private java.lang.String servico;

  /**
  * @generated
  */
  @Column(name = "TIPO_ALERTA", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double tipoAlerta;

  /**
  * @generated
  */
  @Column(name = "TIPO_ATRASO", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double tipoAtraso;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="TIPO_BANCO", nullable = true, referencedColumnName = "CD_TIPO_BANCO", insertable=true, updatable=true)
  
  private TiposBancos tiposBancos;

  /**
   * Construtor
   * @generated
   */
  public AlertasColeta(){
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
  public AlertasColeta setId(java.lang.Double id){
    this.id = id;
    return this;
  }

  /**
   * Obtém atividadePadrao
   * return atividadePadrao
   * @generated
   */
  
  public java.lang.String getAtividadePadrao(){
    return this.atividadePadrao;
  }

  /**
   * Define atividadePadrao
   * @param atividadePadrao atividadePadrao
   * @generated
   */
  public AlertasColeta setAtividadePadrao(java.lang.String atividadePadrao){
    this.atividadePadrao = atividadePadrao;
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
  public AlertasColeta setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * Obtém descricaoEsLa
   * return descricaoEsLa
   * @generated
   */
  
  public java.lang.String getDescricaoEsLa(){
    return this.descricaoEsLa;
  }

  /**
   * Define descricaoEsLa
   * @param descricaoEsLa descricaoEsLa
   * @generated
   */
  public AlertasColeta setDescricaoEsLa(java.lang.String descricaoEsLa){
    this.descricaoEsLa = descricaoEsLa;
    return this;
  }

  /**
   * Obtém descricaoUsEn
   * return descricaoUsEn
   * @generated
   */
  
  public java.lang.String getDescricaoUsEn(){
    return this.descricaoUsEn;
  }

  /**
   * Define descricaoUsEn
   * @param descricaoUsEn descricaoUsEn
   * @generated
   */
  public AlertasColeta setDescricaoUsEn(java.lang.String descricaoUsEn){
    this.descricaoUsEn = descricaoUsEn;
    return this;
  }

  /**
   * Obtém flgEnviaEmailCliente
   * return flgEnviaEmailCliente
   * @generated
   */
  
  public java.lang.String getFlgEnviaEmailCliente(){
    return this.flgEnviaEmailCliente;
  }

  /**
   * Define flgEnviaEmailCliente
   * @param flgEnviaEmailCliente flgEnviaEmailCliente
   * @generated
   */
  public AlertasColeta setFlgEnviaEmailCliente(java.lang.String flgEnviaEmailCliente){
    this.flgEnviaEmailCliente = flgEnviaEmailCliente;
    return this;
  }

  /**
   * Obtém qtdAtrasosDefault
   * return qtdAtrasosDefault
   * @generated
   */
  
  public java.lang.Double getQtdAtrasosDefault(){
    return this.qtdAtrasosDefault;
  }

  /**
   * Define qtdAtrasosDefault
   * @param qtdAtrasosDefault qtdAtrasosDefault
   * @generated
   */
  public AlertasColeta setQtdAtrasosDefault(java.lang.Double qtdAtrasosDefault){
    this.qtdAtrasosDefault = qtdAtrasosDefault;
    return this;
  }

  /**
   * Obtém servico
   * return servico
   * @generated
   */
  
  public java.lang.String getServico(){
    return this.servico;
  }

  /**
   * Define servico
   * @param servico servico
   * @generated
   */
  public AlertasColeta setServico(java.lang.String servico){
    this.servico = servico;
    return this;
  }

  /**
   * Obtém tipoAlerta
   * return tipoAlerta
   * @generated
   */
  
  public java.lang.Double getTipoAlerta(){
    return this.tipoAlerta;
  }

  /**
   * Define tipoAlerta
   * @param tipoAlerta tipoAlerta
   * @generated
   */
  public AlertasColeta setTipoAlerta(java.lang.Double tipoAlerta){
    this.tipoAlerta = tipoAlerta;
    return this;
  }

  /**
   * Obtém tipoAtraso
   * return tipoAtraso
   * @generated
   */
  
  public java.lang.Double getTipoAtraso(){
    return this.tipoAtraso;
  }

  /**
   * Define tipoAtraso
   * @param tipoAtraso tipoAtraso
   * @generated
   */
  public AlertasColeta setTipoAtraso(java.lang.Double tipoAtraso){
    this.tipoAtraso = tipoAtraso;
    return this;
  }

  /**
   * Obtém tiposBancos
   * return tiposBancos
   * @generated
   */
  
  public TiposBancos getTiposBancos(){
    return this.tiposBancos;
  }

  /**
   * Define tiposBancos
   * @param tiposBancos tiposBancos
   * @generated
   */
  public AlertasColeta setTiposBancos(TiposBancos tiposBancos){
    this.tiposBancos = tiposBancos;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    AlertasColeta object = (AlertasColeta)obj;
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
