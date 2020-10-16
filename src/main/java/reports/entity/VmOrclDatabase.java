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
 * Classe que representa a tabela VM_ORCL_DATABASE
 * @generated
 */
@Entity
@Table(name = "\"VM_ORCL_DATABASE\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.VmOrclDatabase")
public class VmOrclDatabase implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "SEQ_RESULTADO", nullable = true, insertable=true, updatable=true)
  private java.lang.Double seqResultado;

  /**
  * @generated
  */
  @Column(name = "BANC_ID", nullable = false, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.Double bancId;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "CREATED", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date created;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_FIM", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataFim;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_INICIO", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.util.Date dataInicio;

  /**
  * @generated
  */
  @Column(name = "DBID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double dbid;

  /**
  * @generated
  */
  @Column(name = "DBNAME", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String dbname;

  /**
  * @generated
  */
  @Column(name = "EVENTO_AGENDA_ID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double eventoAgendaId;

  /**
  * @generated
  */
  @Column(name = "EVENTO_BANCO_ID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double eventoBancoId;

  /**
  * @generated
  */
  @Column(name = "EVENTO_EXECUCAO_ID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double eventoExecucaoId;

  /**
  * @generated
  */
  @Column(name = "EVENTO_ID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double eventoId;

  /**
  * @generated
  */
  @Column(name = "LOG_MODE", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String logMode;

  /**
  * @generated
  */
  @Column(name = "NOME", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "OPEN_MODE", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String openMode;

  /**
  * @generated
  */
  @Column(name = "PLATFORM_NAME", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String platformName;

  /**
  * @generated
  */
  @Column(name = "PROTECTION_LEVEL", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String protectionLevel;

  /**
  * @generated
  */
  @Column(name = "PROTECTION_MODE", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String protectionMode;

  /**
   * Construtor
   * @generated
   */
  public VmOrclDatabase(){
  }


  /**
   * Obtém bancId
   * return bancId
   * @generated
   */
  
  public java.lang.Double getBancId(){
    return this.bancId;
  }

  /**
   * Define bancId
   * @param bancId bancId
   * @generated
   */
  public VmOrclDatabase setBancId(java.lang.Double bancId){
    this.bancId = bancId;
    return this;
  }

  /**
   * Obtém created
   * return created
   * @generated
   */
  
  public java.util.Date getCreated(){
    return this.created;
  }

  /**
   * Define created
   * @param created created
   * @generated
   */
  public VmOrclDatabase setCreated(java.util.Date created){
    this.created = created;
    return this;
  }

  /**
   * Obtém dataFim
   * return dataFim
   * @generated
   */
  
  public java.util.Date getDataFim(){
    return this.dataFim;
  }

  /**
   * Define dataFim
   * @param dataFim dataFim
   * @generated
   */
  public VmOrclDatabase setDataFim(java.util.Date dataFim){
    this.dataFim = dataFim;
    return this;
  }

  /**
   * Obtém dataInicio
   * return dataInicio
   * @generated
   */
  
  public java.util.Date getDataInicio(){
    return this.dataInicio;
  }

  /**
   * Define dataInicio
   * @param dataInicio dataInicio
   * @generated
   */
  public VmOrclDatabase setDataInicio(java.util.Date dataInicio){
    this.dataInicio = dataInicio;
    return this;
  }

  /**
   * Obtém dbid
   * return dbid
   * @generated
   */
  
  public java.lang.Double getDbid(){
    return this.dbid;
  }

  /**
   * Define dbid
   * @param dbid dbid
   * @generated
   */
  public VmOrclDatabase setDbid(java.lang.Double dbid){
    this.dbid = dbid;
    return this;
  }

  /**
   * Obtém dbname
   * return dbname
   * @generated
   */
  
  public java.lang.String getDbname(){
    return this.dbname;
  }

  /**
   * Define dbname
   * @param dbname dbname
   * @generated
   */
  public VmOrclDatabase setDbname(java.lang.String dbname){
    this.dbname = dbname;
    return this;
  }

  /**
   * Obtém eventoAgendaId
   * return eventoAgendaId
   * @generated
   */
  
  public java.lang.Double getEventoAgendaId(){
    return this.eventoAgendaId;
  }

  /**
   * Define eventoAgendaId
   * @param eventoAgendaId eventoAgendaId
   * @generated
   */
  public VmOrclDatabase setEventoAgendaId(java.lang.Double eventoAgendaId){
    this.eventoAgendaId = eventoAgendaId;
    return this;
  }

  /**
   * Obtém eventoBancoId
   * return eventoBancoId
   * @generated
   */
  
  public java.lang.Double getEventoBancoId(){
    return this.eventoBancoId;
  }

  /**
   * Define eventoBancoId
   * @param eventoBancoId eventoBancoId
   * @generated
   */
  public VmOrclDatabase setEventoBancoId(java.lang.Double eventoBancoId){
    this.eventoBancoId = eventoBancoId;
    return this;
  }

  /**
   * Obtém eventoExecucaoId
   * return eventoExecucaoId
   * @generated
   */
  
  public java.lang.Double getEventoExecucaoId(){
    return this.eventoExecucaoId;
  }

  /**
   * Define eventoExecucaoId
   * @param eventoExecucaoId eventoExecucaoId
   * @generated
   */
  public VmOrclDatabase setEventoExecucaoId(java.lang.Double eventoExecucaoId){
    this.eventoExecucaoId = eventoExecucaoId;
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
  public VmOrclDatabase setEventoId(java.lang.Double eventoId){
    this.eventoId = eventoId;
    return this;
  }

  /**
   * Obtém logMode
   * return logMode
   * @generated
   */
  
  public java.lang.String getLogMode(){
    return this.logMode;
  }

  /**
   * Define logMode
   * @param logMode logMode
   * @generated
   */
  public VmOrclDatabase setLogMode(java.lang.String logMode){
    this.logMode = logMode;
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
  public VmOrclDatabase setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém openMode
   * return openMode
   * @generated
   */
  
  public java.lang.String getOpenMode(){
    return this.openMode;
  }

  /**
   * Define openMode
   * @param openMode openMode
   * @generated
   */
  public VmOrclDatabase setOpenMode(java.lang.String openMode){
    this.openMode = openMode;
    return this;
  }

  /**
   * Obtém platformName
   * return platformName
   * @generated
   */
  
  public java.lang.String getPlatformName(){
    return this.platformName;
  }

  /**
   * Define platformName
   * @param platformName platformName
   * @generated
   */
  public VmOrclDatabase setPlatformName(java.lang.String platformName){
    this.platformName = platformName;
    return this;
  }

  /**
   * Obtém protectionLevel
   * return protectionLevel
   * @generated
   */
  
  public java.lang.String getProtectionLevel(){
    return this.protectionLevel;
  }

  /**
   * Define protectionLevel
   * @param protectionLevel protectionLevel
   * @generated
   */
  public VmOrclDatabase setProtectionLevel(java.lang.String protectionLevel){
    this.protectionLevel = protectionLevel;
    return this;
  }

  /**
   * Obtém protectionMode
   * return protectionMode
   * @generated
   */
  
  public java.lang.String getProtectionMode(){
    return this.protectionMode;
  }

  /**
   * Define protectionMode
   * @param protectionMode protectionMode
   * @generated
   */
  public VmOrclDatabase setProtectionMode(java.lang.String protectionMode){
    this.protectionMode = protectionMode;
    return this;
  }

  /**
   * Obtém seqResultado
   * return seqResultado
   * @generated
   */
  
  public java.lang.Double getSeqResultado(){
    return this.seqResultado;
  }

  /**
   * Define seqResultado
   * @param seqResultado seqResultado
   * @generated
   */
  public VmOrclDatabase setSeqResultado(java.lang.Double seqResultado){
    this.seqResultado = seqResultado;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VmOrclDatabase object = (VmOrclDatabase)obj;
    if (seqResultado != null ? !seqResultado.equals(object.seqResultado) : object.seqResultado != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((seqResultado == null) ? 0 : seqResultado.hashCode());
    return result;
  }

}
