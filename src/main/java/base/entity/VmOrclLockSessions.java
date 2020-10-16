package base.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela VM_ORCL_LOCK_SESSIONS
 * @generated
 */
@Entity
@Table(name = "\"VM_ORCL_LOCK_SESSIONS\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("base.entity.VmOrclLockSessions")
public class VmOrclLockSessions implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "SEQ_RESULTADO", nullable = false, insertable=true, updatable=true)
  private java.lang.Double seqResultado;

  /**
  * @generated
  */
  @Column(name = "BANC_ID", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double bancId;

  /**
  * @generated
  */
  @Column(name = "BLOCKING_INSTANCE", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double blockingInstance;

  /**
  * @generated
  */
  @Column(name = "BLOCKING_SESSION", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double blockingSession;

  /**
  * @generated
  */
  @Column(name = "BLOCKING_SESSION_STATUS", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String blockingSessionStatus;

  /**
  * @generated
  */
  @Column(name = "CLIENT_INFO", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String clientInfo;

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
  
  private java.util.Date dataInicio;

  /**
  * @generated
  */
  @Column(name = "ELAPSED_TIME", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String elapsedTime;

  /**
  * @generated
  */
  @Column(name = "EVENTO_AGENDA_ID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double eventoAgendaId;

  /**
  * @generated
  */
  @Column(name = "EVENTO_BANCO_ID", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double eventoBancoId;

  /**
  * @generated
  */
  @Column(name = "EVENTO_EXECUCAO_ID", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double eventoExecucaoId;

  /**
  * @generated
  */
  @Column(name = "EVENTO_ID", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double eventoId;

  /**
  * @generated
  */
  @Column(name = "FINAL_BLOCKING_INSTANCE", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double finalBlockingInstance;

  /**
  * @generated
  */
  @Column(name = "FINAL_BLOCKING_SESSION_STATUS", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String finalBlockingSessionStatus;

  /**
  * @generated
  */
  @Column(name = "INST_ID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double instId;

  /**
  * @generated
  */
  @Column(name = "LAST_SQL", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String lastSql;

  /**
  * @generated
  */
  @Column(name = "LOCK_MODE", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String lockMode;

  /**
  * @generated
  */
  @Column(name = "LOCK_TYPE", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String lockType;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "LOGON_TIME", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date logonTime;

  /**
  * @generated
  */
  @Column(name = "MACHINE", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String machine;

  /**
  * @generated
  */
  @Column(name = "MODULE", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String module;

  /**
  * @generated
  */
  @Column(name = "NOME", nullable = false, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "OBJECT_LOCKED", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String objectLocked;

  /**
  * @generated
  */
  @Column(name = "OSUSER", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String osuser;

  /**
  * @generated
  */
  @Column(name = "PROGRAM", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String program;

  /**
  * @generated
  */
  @Column(name = "SERIAL", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double serial;

  /**
  * @generated
  */
  @Column(name = "SID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double sid;

  /**
  * @generated
  */
  @Column(name = "STATUS", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String status;

  /**
  * @generated
  */
  @Column(name = "TYPE", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String type;

  /**
  * @generated
  */
  @Column(name = "USER_STATUS", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String userStatus;

  /**
   * Construtor
   * @generated
   */
  public VmOrclLockSessions(){
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
  public VmOrclLockSessions setSeqResultado(java.lang.Double seqResultado){
    this.seqResultado = seqResultado;
    return this;
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
  public VmOrclLockSessions setBancId(java.lang.Double bancId){
    this.bancId = bancId;
    return this;
  }

  /**
   * Obtém blockingInstance
   * return blockingInstance
   * @generated
   */
  
  public java.lang.Double getBlockingInstance(){
    return this.blockingInstance;
  }

  /**
   * Define blockingInstance
   * @param blockingInstance blockingInstance
   * @generated
   */
  public VmOrclLockSessions setBlockingInstance(java.lang.Double blockingInstance){
    this.blockingInstance = blockingInstance;
    return this;
  }

  /**
   * Obtém blockingSession
   * return blockingSession
   * @generated
   */
  
  public java.lang.Double getBlockingSession(){
    return this.blockingSession;
  }

  /**
   * Define blockingSession
   * @param blockingSession blockingSession
   * @generated
   */
  public VmOrclLockSessions setBlockingSession(java.lang.Double blockingSession){
    this.blockingSession = blockingSession;
    return this;
  }

  /**
   * Obtém blockingSessionStatus
   * return blockingSessionStatus
   * @generated
   */
  
  public java.lang.String getBlockingSessionStatus(){
    return this.blockingSessionStatus;
  }

  /**
   * Define blockingSessionStatus
   * @param blockingSessionStatus blockingSessionStatus
   * @generated
   */
  public VmOrclLockSessions setBlockingSessionStatus(java.lang.String blockingSessionStatus){
    this.blockingSessionStatus = blockingSessionStatus;
    return this;
  }

  /**
   * Obtém clientInfo
   * return clientInfo
   * @generated
   */
  
  public java.lang.String getClientInfo(){
    return this.clientInfo;
  }

  /**
   * Define clientInfo
   * @param clientInfo clientInfo
   * @generated
   */
  public VmOrclLockSessions setClientInfo(java.lang.String clientInfo){
    this.clientInfo = clientInfo;
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
  public VmOrclLockSessions setDataFim(java.util.Date dataFim){
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
  public VmOrclLockSessions setDataInicio(java.util.Date dataInicio){
    this.dataInicio = dataInicio;
    return this;
  }

  /**
   * Obtém elapsedTime
   * return elapsedTime
   * @generated
   */
  
  public java.lang.String getElapsedTime(){
    return this.elapsedTime;
  }

  /**
   * Define elapsedTime
   * @param elapsedTime elapsedTime
   * @generated
   */
  public VmOrclLockSessions setElapsedTime(java.lang.String elapsedTime){
    this.elapsedTime = elapsedTime;
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
  public VmOrclLockSessions setEventoAgendaId(java.lang.Double eventoAgendaId){
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
  public VmOrclLockSessions setEventoBancoId(java.lang.Double eventoBancoId){
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
  public VmOrclLockSessions setEventoExecucaoId(java.lang.Double eventoExecucaoId){
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
  public VmOrclLockSessions setEventoId(java.lang.Double eventoId){
    this.eventoId = eventoId;
    return this;
  }

  /**
   * Obtém finalBlockingInstance
   * return finalBlockingInstance
   * @generated
   */
  
  public java.lang.Double getFinalBlockingInstance(){
    return this.finalBlockingInstance;
  }

  /**
   * Define finalBlockingInstance
   * @param finalBlockingInstance finalBlockingInstance
   * @generated
   */
  public VmOrclLockSessions setFinalBlockingInstance(java.lang.Double finalBlockingInstance){
    this.finalBlockingInstance = finalBlockingInstance;
    return this;
  }

  /**
   * Obtém finalBlockingSessionStatus
   * return finalBlockingSessionStatus
   * @generated
   */
  
  public java.lang.String getFinalBlockingSessionStatus(){
    return this.finalBlockingSessionStatus;
  }

  /**
   * Define finalBlockingSessionStatus
   * @param finalBlockingSessionStatus finalBlockingSessionStatus
   * @generated
   */
  public VmOrclLockSessions setFinalBlockingSessionStatus(java.lang.String finalBlockingSessionStatus){
    this.finalBlockingSessionStatus = finalBlockingSessionStatus;
    return this;
  }

  /**
   * Obtém instId
   * return instId
   * @generated
   */
  
  public java.lang.Double getInstId(){
    return this.instId;
  }

  /**
   * Define instId
   * @param instId instId
   * @generated
   */
  public VmOrclLockSessions setInstId(java.lang.Double instId){
    this.instId = instId;
    return this;
  }

  /**
   * Obtém lastSql
   * return lastSql
   * @generated
   */
  
  public java.lang.String getLastSql(){
    return this.lastSql;
  }

  /**
   * Define lastSql
   * @param lastSql lastSql
   * @generated
   */
  public VmOrclLockSessions setLastSql(java.lang.String lastSql){
    this.lastSql = lastSql;
    return this;
  }

  /**
   * Obtém lockMode
   * return lockMode
   * @generated
   */
  
  public java.lang.String getLockMode(){
    return this.lockMode;
  }

  /**
   * Define lockMode
   * @param lockMode lockMode
   * @generated
   */
  public VmOrclLockSessions setLockMode(java.lang.String lockMode){
    this.lockMode = lockMode;
    return this;
  }

  /**
   * Obtém lockType
   * return lockType
   * @generated
   */
  
  public java.lang.String getLockType(){
    return this.lockType;
  }

  /**
   * Define lockType
   * @param lockType lockType
   * @generated
   */
  public VmOrclLockSessions setLockType(java.lang.String lockType){
    this.lockType = lockType;
    return this;
  }

  /**
   * Obtém logonTime
   * return logonTime
   * @generated
   */
  
  public java.util.Date getLogonTime(){
    return this.logonTime;
  }

  /**
   * Define logonTime
   * @param logonTime logonTime
   * @generated
   */
  public VmOrclLockSessions setLogonTime(java.util.Date logonTime){
    this.logonTime = logonTime;
    return this;
  }

  /**
   * Obtém machine
   * return machine
   * @generated
   */
  
  public java.lang.String getMachine(){
    return this.machine;
  }

  /**
   * Define machine
   * @param machine machine
   * @generated
   */
  public VmOrclLockSessions setMachine(java.lang.String machine){
    this.machine = machine;
    return this;
  }

  /**
   * Obtém module
   * return module
   * @generated
   */
  
  public java.lang.String getModule(){
    return this.module;
  }

  /**
   * Define module
   * @param module module
   * @generated
   */
  public VmOrclLockSessions setModule(java.lang.String module){
    this.module = module;
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
  public VmOrclLockSessions setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém objectLocked
   * return objectLocked
   * @generated
   */
  
  public java.lang.String getObjectLocked(){
    return this.objectLocked;
  }

  /**
   * Define objectLocked
   * @param objectLocked objectLocked
   * @generated
   */
  public VmOrclLockSessions setObjectLocked(java.lang.String objectLocked){
    this.objectLocked = objectLocked;
    return this;
  }

  /**
   * Obtém osuser
   * return osuser
   * @generated
   */
  
  public java.lang.String getOsuser(){
    return this.osuser;
  }

  /**
   * Define osuser
   * @param osuser osuser
   * @generated
   */
  public VmOrclLockSessions setOsuser(java.lang.String osuser){
    this.osuser = osuser;
    return this;
  }

  /**
   * Obtém program
   * return program
   * @generated
   */
  
  public java.lang.String getProgram(){
    return this.program;
  }

  /**
   * Define program
   * @param program program
   * @generated
   */
  public VmOrclLockSessions setProgram(java.lang.String program){
    this.program = program;
    return this;
  }

  /**
   * Obtém serial
   * return serial
   * @generated
   */
  
  public java.lang.Double getSerial(){
    return this.serial;
  }

  /**
   * Define serial
   * @param serial serial
   * @generated
   */
  public VmOrclLockSessions setSerial(java.lang.Double serial){
    this.serial = serial;
    return this;
  }

  /**
   * Obtém sid
   * return sid
   * @generated
   */
  
  public java.lang.Double getSid(){
    return this.sid;
  }

  /**
   * Define sid
   * @param sid sid
   * @generated
   */
  public VmOrclLockSessions setSid(java.lang.Double sid){
    this.sid = sid;
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
  public VmOrclLockSessions setStatus(java.lang.String status){
    this.status = status;
    return this;
  }

  /**
   * Obtém type
   * return type
   * @generated
   */
  
  public java.lang.String getType(){
    return this.type;
  }

  /**
   * Define type
   * @param type type
   * @generated
   */
  public VmOrclLockSessions setType(java.lang.String type){
    this.type = type;
    return this;
  }

  /**
   * Obtém userStatus
   * return userStatus
   * @generated
   */
  
  public java.lang.String getUserStatus(){
    return this.userStatus;
  }

  /**
   * Define userStatus
   * @param userStatus userStatus
   * @generated
   */
  public VmOrclLockSessions setUserStatus(java.lang.String userStatus){
    this.userStatus = userStatus;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VmOrclLockSessions object = (VmOrclLockSessions)obj;
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
