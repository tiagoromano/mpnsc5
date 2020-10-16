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
 * Classe que representa a tabela VM_ORCL_TABLESPACES
 * @generated
 */
@Entity
@Table(name = "\"VM_ORCL_TABLESPACES\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.VmOrclTablespaces")
public class VmOrclTablespaces implements Serializable {

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
  @Column(name = "NOME", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "TABLESPACE_NAME", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String tablespaceName;

  /**
  * @generated
  */
  @Column(name = "BLOCK_SIZE", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String blockSize;

  /**
  * @generated
  */
  @Column(name = "STATUS", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String status;

  /**
  * @generated
  */
  @Column(name = "CONTENTS", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String contents;

  /**
  * @generated
  */
  @Column(name = "EXTENT_MANAGEMENT", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String extentManagement;

  /**
  * @generated
  */
  @Column(name = "LOGGING", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String logging;

  /**
  * @generated
  */
  @Column(name = "ALLOCATION_TYPE", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String allocationType;

  /**
  * @generated
  */
  @Column(name = "SEGMENT_SPACE_MANAGEMENT", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String segmentSpaceManagement;

  /**
  * @generated
  */
  @Column(name = "PCT_USED", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double pctUsed;

  /**
  * @generated
  */
  @Column(name = "SUM_ALLOC_MBBYTES", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double sumAllocMbbytes;

  /**
  * @generated
  */
  @Column(name = "SUM_EXTEND_MBBYTES", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double sumExtendedMbbytes;

  /**
   * Construtor
   * @generated
   */
  public VmOrclTablespaces(){
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
  public VmOrclTablespaces setBancId(java.lang.Double bancId){
    this.bancId = bancId;
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
  public VmOrclTablespaces setDataFim(java.util.Date dataFim){
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
  public VmOrclTablespaces setDataInicio(java.util.Date dataInicio){
    this.dataInicio = dataInicio;
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
  public VmOrclTablespaces setEventoAgendaId(java.lang.Double eventoAgendaId){
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
  public VmOrclTablespaces setEventoBancoId(java.lang.Double eventoBancoId){
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
  public VmOrclTablespaces setEventoExecucaoId(java.lang.Double eventoExecucaoId){
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
  public VmOrclTablespaces setEventoId(java.lang.Double eventoId){
    this.eventoId = eventoId;
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
  public VmOrclTablespaces setSeqResultado(java.lang.Double seqResultado){
    this.seqResultado = seqResultado;
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
  public VmOrclTablespaces setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém tablespaceName
   * return tablespaceName
   * @generated
   */
  
  public java.lang.String getTablespaceName(){
    return this.tablespaceName;
  }

  /**
   * Define tablespaceName
   * @param tablespaceName tablespaceName
   * @generated
   */
  public VmOrclTablespaces setTablespaceName(java.lang.String tablespaceName){
    this.tablespaceName = tablespaceName;
    return this;
  }

  /**
   * Obtém blockSize
   * return blockSize
   * @generated
   */
  
  public java.lang.String getBlockSize(){
    return this.blockSize;
  }

  /**
   * Define blockSize
   * @param blockSize blockSize
   * @generated
   */
  public VmOrclTablespaces setBlockSize(java.lang.String blockSize){
    this.blockSize = blockSize;
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
  public VmOrclTablespaces setStatus(java.lang.String status){
    this.status = status;
    return this;
  }

  /**
   * Obtém contents
   * return contents
   * @generated
   */
  
  public java.lang.String getContents(){
    return this.contents;
  }

  /**
   * Define contents
   * @param contents contents
   * @generated
   */
  public VmOrclTablespaces setContents(java.lang.String contents){
    this.contents = contents;
    return this;
  }

  /**
   * Obtém extentManagement
   * return extentManagement
   * @generated
   */
  
  public java.lang.String getExtentManagement(){
    return this.extentManagement;
  }

  /**
   * Define extentManagement
   * @param extentManagement extentManagement
   * @generated
   */
  public VmOrclTablespaces setExtentManagement(java.lang.String extentManagement){
    this.extentManagement = extentManagement;
    return this;
  }

  /**
   * Obtém logging
   * return logging
   * @generated
   */
  
  public java.lang.String getLogging(){
    return this.logging;
  }

  /**
   * Define logging
   * @param logging logging
   * @generated
   */
  public VmOrclTablespaces setLogging(java.lang.String logging){
    this.logging = logging;
    return this;
  }

  /**
   * Obtém allocationType
   * return allocationType
   * @generated
   */
  
  public java.lang.String getAllocationType(){
    return this.allocationType;
  }

  /**
   * Define allocationType
   * @param allocationType allocationType
   * @generated
   */
  public VmOrclTablespaces setAllocationType(java.lang.String allocationType){
    this.allocationType = allocationType;
    return this;
  }

  /**
   * Obtém segmentSpaceManagement
   * return segmentSpaceManagement
   * @generated
   */
  
  public java.lang.String getSegmentSpaceManagement(){
    return this.segmentSpaceManagement;
  }

  /**
   * Define segmentSpaceManagement
   * @param segmentSpaceManagement segmentSpaceManagement
   * @generated
   */
  public VmOrclTablespaces setSegmentSpaceManagement(java.lang.String segmentSpaceManagement){
    this.segmentSpaceManagement = segmentSpaceManagement;
    return this;
  }

  /**
   * Obtém pctUsed
   * return pctUsed
   * @generated
   */
  
  public java.lang.Double getPctUsed(){
    return this.pctUsed;
  }

  /**
   * Define pctUsed
   * @param pctUsed pctUsed
   * @generated
   */
  public VmOrclTablespaces setPctUsed(java.lang.Double pctUsed){
    this.pctUsed = pctUsed;
    return this;
  }

  /**
   * Obtém sumAllocMbbytes
   * return sumAllocMbbytes
   * @generated
   */
  
  public java.lang.Double getSumAllocMbbytes(){
    return this.sumAllocMbbytes;
  }

  /**
   * Define sumAllocMbbytes
   * @param sumAllocMbbytes sumAllocMbbytes
   * @generated
   */
  public VmOrclTablespaces setSumAllocMbbytes(java.lang.Double sumAllocMbbytes){
    this.sumAllocMbbytes = sumAllocMbbytes;
    return this;
  }

  /**
   * Obtém sumExtendedMbbytes
   * return sumExtendedMbbytes
   * @generated
   */
  
  public java.lang.Double getSumExtendedMbbytes(){
    return this.sumExtendedMbbytes;
  }

  /**
   * Define sumExtendedMbbytes
   * @param sumExtendedMbbytes sumExtendedMbbytes
   * @generated
   */
  public VmOrclTablespaces setSumExtendedMbbytes(java.lang.Double sumExtendedMbbytes){
    this.sumExtendedMbbytes = sumExtendedMbbytes;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VmOrclTablespaces object = (VmOrclTablespaces)obj;
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
