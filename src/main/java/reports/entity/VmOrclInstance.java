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
 * Classe que representa a tabela VM_ORCL_INSTANCE
 * @generated
 */
@Entity
@Table(name = "\"VM_ORCL_INSTANCE\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.VmOrclInstance")
public class VmOrclInstance implements Serializable {

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
  @Column(name = "STARTUP_TIME", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date startupTime;

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
  @Column(name = "INSTANCE_NAME", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String instanceName;

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
  @Column(name = "HOST_NAME", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String hostName;

  /**
  * @generated
  */
  @Column(name = "NOME", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "STATUS", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String status;

  /**
  * @generated
  */
  @Column(name = "PARALLEL", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String parallel;

  /**
  * @generated
  */
  @Column(name = "ARCHIVER", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String archiver;

  /**
  * @generated
  */
  @Column(name = "DATABASE_STATUS", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String databaseStatus;

  /**
   * Construtor
   * @generated
   */
  public VmOrclInstance(){
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
  public VmOrclInstance setBancId(java.lang.Double bancId){
    this.bancId = bancId;
    return this;
  }

  /**
   * Obtém startupTime
   * return startupTime
   * @generated
   */
  
  public java.util.Date getStartupTime(){
    return this.startupTime;
  }

  /**
   * Define startupTime
   * @param startupTime startupTime
   * @generated
   */
  public VmOrclInstance setStartupTime(java.util.Date startupTime){
    this.startupTime = startupTime;
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
  public VmOrclInstance setDataFim(java.util.Date dataFim){
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
  public VmOrclInstance setDataInicio(java.util.Date dataInicio){
    this.dataInicio = dataInicio;
    return this;
  }

  /**
   * Obtém instanceName
   * return instanceName
   * @generated
   */
  
  public java.lang.String getInstanceName(){
    return this.instanceName;
  }

  /**
   * Define instanceName
   * @param instanceName instanceName
   * @generated
   */
  public VmOrclInstance setInstanceName(java.lang.String instanceName){
    this.instanceName = instanceName;
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
  public VmOrclInstance setEventoAgendaId(java.lang.Double eventoAgendaId){
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
  public VmOrclInstance setEventoBancoId(java.lang.Double eventoBancoId){
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
  public VmOrclInstance setEventoExecucaoId(java.lang.Double eventoExecucaoId){
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
  public VmOrclInstance setEventoId(java.lang.Double eventoId){
    this.eventoId = eventoId;
    return this;
  }

  /**
   * Obtém hostName
   * return hostName
   * @generated
   */
  
  public java.lang.String getHostName(){
    return this.hostName;
  }

  /**
   * Define hostName
   * @param hostName hostName
   * @generated
   */
  public VmOrclInstance setHostName(java.lang.String hostName){
    this.hostName = hostName;
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
  public VmOrclInstance setNome(java.lang.String nome){
    this.nome = nome;
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
  public VmOrclInstance setSeqResultado(java.lang.Double seqResultado){
    this.seqResultado = seqResultado;
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
  public VmOrclInstance setStatus(java.lang.String status){
    this.status = status;
    return this;
  }

  /**
   * Obtém parallel
   * return parallel
   * @generated
   */
  
  public java.lang.String getParallel(){
    return this.parallel;
  }

  /**
   * Define parallel
   * @param parallel parallel
   * @generated
   */
  public VmOrclInstance setParallel(java.lang.String parallel){
    this.parallel = parallel;
    return this;
  }

  /**
   * Obtém archiver
   * return archiver
   * @generated
   */
  
  public java.lang.String getArchiver(){
    return this.archiver;
  }

  /**
   * Define archiver
   * @param archiver archiver
   * @generated
   */
  public VmOrclInstance setArchiver(java.lang.String archiver){
    this.archiver = archiver;
    return this;
  }

  /**
   * Obtém databaseStatus
   * return databaseStatus
   * @generated
   */
  
  public java.lang.String getDatabaseStatus(){
    return this.databaseStatus;
  }

  /**
   * Define databaseStatus
   * @param databaseStatus databaseStatus
   * @generated
   */
  public VmOrclInstance setDatabaseStatus(java.lang.String databaseStatus){
    this.databaseStatus = databaseStatus;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VmOrclInstance object = (VmOrclInstance)obj;
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
