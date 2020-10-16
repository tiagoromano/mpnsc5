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
 * Classe que representa a tabela POLOMSG_AVISOS
 * @generated
 */
@Entity
@Table(name = "\"POLOMSG_AVISOS\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("base.entity.PolomsgAvisos")
public class PolomsgAvisos implements Serializable {

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
  @Column(name = "ALER_ID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double alerId;

  /**
  * @generated
  */
  @Column(name = "CHAM_CODIGO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double chamCodigo;

  /**
  * @generated
  */
  @Column(name = "CIENTE", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String ciente;

  /**
  * @generated
  */
  @Column(name = "CODI_BANC", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double codiBanc;

  /**
  * @generated
  */
  @Column(name = "CODI_USUA", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double codiUsua;

  /**
  * @generated
  */
  @Column(name = "CONS_ID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double consId;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_ALERTA_ATRASO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataAlertaAtraso;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_AVISO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataAviso;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_CIENTE", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataCiente;

  /**
  * @generated
  */
  @Column(name = "EVENTO_ID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double eventoId;

  /**
  * @generated
  */
  @Column(name = "JUSTIFICATIVA", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.String justificativa;

  /**
  * @generated
  */
  @Column(name = "MSG_ERRO", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String msgErro;

  /**
  * @generated
  */
  @Column(name = "PARAMETRO", nullable = true, unique = false, length=200, insertable=true, updatable=true)
  
  private java.lang.String parametro;

  /**
  * @generated
  */
  @Column(name = "USUA_CODIGO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double usuaCodigo;

  /**
   * Construtor
   * @generated
   */
  public PolomsgAvisos(){
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
  public PolomsgAvisos setId(java.lang.Double id){
    this.id = id;
    return this;
  }

  /**
   * Obtém alerId
   * return alerId
   * @generated
   */
  
  public java.lang.Double getAlerId(){
    return this.alerId;
  }

  /**
   * Define alerId
   * @param alerId alerId
   * @generated
   */
  public PolomsgAvisos setAlerId(java.lang.Double alerId){
    this.alerId = alerId;
    return this;
  }

  /**
   * Obtém chamCodigo
   * return chamCodigo
   * @generated
   */
  
  public java.lang.Double getChamCodigo(){
    return this.chamCodigo;
  }

  /**
   * Define chamCodigo
   * @param chamCodigo chamCodigo
   * @generated
   */
  public PolomsgAvisos setChamCodigo(java.lang.Double chamCodigo){
    this.chamCodigo = chamCodigo;
    return this;
  }

  /**
   * Obtém ciente
   * return ciente
   * @generated
   */
  
  public java.lang.String getCiente(){
    return this.ciente;
  }

  /**
   * Define ciente
   * @param ciente ciente
   * @generated
   */
  public PolomsgAvisos setCiente(java.lang.String ciente){
    this.ciente = ciente;
    return this;
  }

  /**
   * Obtém codiBanc
   * return codiBanc
   * @generated
   */
  
  public java.lang.Double getCodiBanc(){
    return this.codiBanc;
  }

  /**
   * Define codiBanc
   * @param codiBanc codiBanc
   * @generated
   */
  public PolomsgAvisos setCodiBanc(java.lang.Double codiBanc){
    this.codiBanc = codiBanc;
    return this;
  }

  /**
   * Obtém codiUsua
   * return codiUsua
   * @generated
   */
  
  public java.lang.Double getCodiUsua(){
    return this.codiUsua;
  }

  /**
   * Define codiUsua
   * @param codiUsua codiUsua
   * @generated
   */
  public PolomsgAvisos setCodiUsua(java.lang.Double codiUsua){
    this.codiUsua = codiUsua;
    return this;
  }

  /**
   * Obtém consId
   * return consId
   * @generated
   */
  
  public java.lang.Double getConsId(){
    return this.consId;
  }

  /**
   * Define consId
   * @param consId consId
   * @generated
   */
  public PolomsgAvisos setConsId(java.lang.Double consId){
    this.consId = consId;
    return this;
  }

  /**
   * Obtém dataAlertaAtraso
   * return dataAlertaAtraso
   * @generated
   */
  
  public java.util.Date getDataAlertaAtraso(){
    return this.dataAlertaAtraso;
  }

  /**
   * Define dataAlertaAtraso
   * @param dataAlertaAtraso dataAlertaAtraso
   * @generated
   */
  public PolomsgAvisos setDataAlertaAtraso(java.util.Date dataAlertaAtraso){
    this.dataAlertaAtraso = dataAlertaAtraso;
    return this;
  }

  /**
   * Obtém dataAviso
   * return dataAviso
   * @generated
   */
  
  public java.util.Date getDataAviso(){
    return this.dataAviso;
  }

  /**
   * Define dataAviso
   * @param dataAviso dataAviso
   * @generated
   */
  public PolomsgAvisos setDataAviso(java.util.Date dataAviso){
    this.dataAviso = dataAviso;
    return this;
  }

  /**
   * Obtém dataCiente
   * return dataCiente
   * @generated
   */
  
  public java.util.Date getDataCiente(){
    return this.dataCiente;
  }

  /**
   * Define dataCiente
   * @param dataCiente dataCiente
   * @generated
   */
  public PolomsgAvisos setDataCiente(java.util.Date dataCiente){
    this.dataCiente = dataCiente;
    return this;
  }

  /**
   * Obtém eventoId
   * return eventoId
   * @generated
   */
  
  public java.lang.Double getEventoId(){
    return this.eventoId;
  }

  /**
   * Define eventoId
   * @param eventoId eventoId
   * @generated
   */
  public PolomsgAvisos setEventoId(java.lang.Double eventoId){
    this.eventoId = eventoId;
    return this;
  }

  /**
   * Obtém justificativa
   * return justificativa
   * @generated
   */
  
  public java.lang.String getJustificativa(){
    return this.justificativa;
  }

  /**
   * Define justificativa
   * @param justificativa justificativa
   * @generated
   */
  public PolomsgAvisos setJustificativa(java.lang.String justificativa){
    this.justificativa = justificativa;
    return this;
  }

  /**
   * Obtém msgErro
   * return msgErro
   * @generated
   */
  
  public java.lang.String getMsgErro(){
    return this.msgErro;
  }

  /**
   * Define msgErro
   * @param msgErro msgErro
   * @generated
   */
  public PolomsgAvisos setMsgErro(java.lang.String msgErro){
    this.msgErro = msgErro;
    return this;
  }

  /**
   * Obtém parametro
   * return parametro
   * @generated
   */
  
  public java.lang.String getParametro(){
    return this.parametro;
  }

  /**
   * Define parametro
   * @param parametro parametro
   * @generated
   */
  public PolomsgAvisos setParametro(java.lang.String parametro){
    this.parametro = parametro;
    return this;
  }

  /**
   * Obtém usuaCodigo
   * return usuaCodigo
   * @generated
   */
  
  public java.lang.Double getUsuaCodigo(){
    return this.usuaCodigo;
  }

  /**
   * Define usuaCodigo
   * @param usuaCodigo usuaCodigo
   * @generated
   */
  public PolomsgAvisos setUsuaCodigo(java.lang.Double usuaCodigo){
    this.usuaCodigo = usuaCodigo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    PolomsgAvisos object = (PolomsgAvisos)obj;
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
