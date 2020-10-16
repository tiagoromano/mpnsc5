package reports.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiSearchable;


/**
 * Classe que representa a tabela VW_POLOMSG_AVISOS
 * @generated
 */
@Entity
@Table(name = "\"VW_POLOMSG_AVISOS\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.VwPolomsgAvisosReport")
public class VwPolomsgAvisosReport implements Serializable {

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
  @Column(name = "DESCRICAO", nullable = false, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
  * @generated
  */
  @Column(name = "DS_TIPO_BANCO", nullable = false, unique = false, length=30, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String dsTipoBanco;

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
  @Column(name = "NOME", nullable = false, unique = false, length=50, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "PARAMETRO", nullable = true, unique = false, length=200, insertable=true, updatable=true)
  
  private java.lang.String parametro;

  /**
  * @generated
  */
  @Column(name = "TIPO_ALERTA", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double tipoAlerta;

  /**
  * @generated
  */
  @Column(name = "TIPO_ALERTA_DESC", nullable = true, unique = false, length=11, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String tipoAlertaDesc;

  /**
  * @generated
  */
  @Column(name = "TIPO_ATRASO", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double tipoAtraso;

  /**
  * @generated
  */
  @Column(name = "TIPO_ATRASO_DESC", nullable = true, unique = false, length=39, insertable=true, updatable=true)
  
  private java.lang.String tipoAtrasoDesc;

  /**
  * @generated
  */
  @Column(name = "USUA_CODIGO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double usuaCodigo;

  /**
  * @generated
  */
  @Column(name = "USUA_NOME", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String usuaNome;

  /**
  * @generated
  */
  @Column(name = "CODI_ILHA", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double ilha;

  /**
  * @generated
  */
  @Column(name = "CD_TIPO_BANCO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double tipoBanco;

  /**
   * Construtor
   * @generated
   */
  public VwPolomsgAvisosReport(){
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
  public VwPolomsgAvisosReport setId(java.lang.Double id){
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
  public VwPolomsgAvisosReport setAlerId(java.lang.Double alerId){
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
  public VwPolomsgAvisosReport setChamCodigo(java.lang.Double chamCodigo){
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
  public VwPolomsgAvisosReport setCiente(java.lang.String ciente){
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
  public VwPolomsgAvisosReport setCodiBanc(java.lang.Double codiBanc){
    this.codiBanc = codiBanc;
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
  public VwPolomsgAvisosReport setConsId(java.lang.Double consId){
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
  public VwPolomsgAvisosReport setDataAlertaAtraso(java.util.Date dataAlertaAtraso){
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
  public VwPolomsgAvisosReport setDataAviso(java.util.Date dataAviso){
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
  public VwPolomsgAvisosReport setDataCiente(java.util.Date dataCiente){
    this.dataCiente = dataCiente;
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
  public VwPolomsgAvisosReport setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * Obtém dsTipoBanco
   * return dsTipoBanco
   * @generated
   */
  
  public java.lang.String getDsTipoBanco(){
    return this.dsTipoBanco;
  }

  /**
   * Define dsTipoBanco
   * @param dsTipoBanco dsTipoBanco
   * @generated
   */
  public VwPolomsgAvisosReport setDsTipoBanco(java.lang.String dsTipoBanco){
    this.dsTipoBanco = dsTipoBanco;
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
  public VwPolomsgAvisosReport setEventoId(java.lang.Double eventoId){
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
  public VwPolomsgAvisosReport setJustificativa(java.lang.String justificativa){
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
  public VwPolomsgAvisosReport setMsgErro(java.lang.String msgErro){
    this.msgErro = msgErro;
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
  public VwPolomsgAvisosReport setNome(java.lang.String nome){
    this.nome = nome;
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
  public VwPolomsgAvisosReport setParametro(java.lang.String parametro){
    this.parametro = parametro;
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
  public VwPolomsgAvisosReport setTipoAlerta(java.lang.Double tipoAlerta){
    this.tipoAlerta = tipoAlerta;
    return this;
  }

  /**
   * Obtém tipoAlertaDesc
   * return tipoAlertaDesc
   * @generated
   */
  
  public java.lang.String getTipoAlertaDesc(){
    return this.tipoAlertaDesc;
  }

  /**
   * Define tipoAlertaDesc
   * @param tipoAlertaDesc tipoAlertaDesc
   * @generated
   */
  public VwPolomsgAvisosReport setTipoAlertaDesc(java.lang.String tipoAlertaDesc){
    this.tipoAlertaDesc = tipoAlertaDesc;
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
  public VwPolomsgAvisosReport setTipoAtraso(java.lang.Double tipoAtraso){
    this.tipoAtraso = tipoAtraso;
    return this;
  }

  /**
   * Obtém tipoAtrasoDesc
   * return tipoAtrasoDesc
   * @generated
   */
  
  public java.lang.String getTipoAtrasoDesc(){
    return this.tipoAtrasoDesc;
  }

  /**
   * Define tipoAtrasoDesc
   * @param tipoAtrasoDesc tipoAtrasoDesc
   * @generated
   */
  public VwPolomsgAvisosReport setTipoAtrasoDesc(java.lang.String tipoAtrasoDesc){
    this.tipoAtrasoDesc = tipoAtrasoDesc;
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
  public VwPolomsgAvisosReport setUsuaCodigo(java.lang.Double usuaCodigo){
    this.usuaCodigo = usuaCodigo;
    return this;
  }

  /**
   * Obtém usuaNome
   * return usuaNome
   * @generated
   */
  
  public java.lang.String getUsuaNome(){
    return this.usuaNome;
  }

  /**
   * Define usuaNome
   * @param usuaNome usuaNome
   * @generated
   */
  public VwPolomsgAvisosReport setUsuaNome(java.lang.String usuaNome){
    this.usuaNome = usuaNome;
    return this;
  }

  /**
   * Obtém ilha
   * return ilha
   * @generated
   */
  
  public java.lang.Double getIlha(){
    return this.ilha;
  }

  /**
   * Define ilha
   * @param ilha ilha
   * @generated
   */
  public VwPolomsgAvisosReport setIlha(java.lang.Double ilha){
    this.ilha = ilha;
    return this;
  }

  /**
   * Obtém tipoBanco
   * return tipoBanco
   * @generated
   */
  
  public java.lang.Double getTipoBanco(){
    return this.tipoBanco;
  }

  /**
   * Define tipoBanco
   * @param tipoBanco tipoBanco
   * @generated
   */
  public VwPolomsgAvisosReport setTipoBanco(java.lang.Double tipoBanco){
    this.tipoBanco = tipoBanco;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VwPolomsgAvisosReport object = (VwPolomsgAvisosReport)obj;
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
