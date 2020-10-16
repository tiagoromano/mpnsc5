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
 * Classe que representa a tabela VM_ORCL_RESOURCE_LIMIT
 * @generated
 */
@Entity
@Table(name = "\"VM_ORCL_RESOURCE_LIMIT\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.VmOrclResourceLimit")
public class VmOrclResourceLimit implements Serializable {

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
  @Column(name = "RESOURCE_NAME", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String resourceName;

  /**
  * @generated
  */
  @Column(name = "CURRENT_UTILIZATION", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double currentUtilization;

  /**
  * @generated
  */
  @Column(name = "MAX_UTILIZATION", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double maxUtilization;

  /**
  * @generated
  */
  @Column(name = "INITIAL_ALLOCATION", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String initialAllocation;

  /**
  * @generated
  */
  @Column(name = "LIMIT_VALUE", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String limitValue;

  /**
   * Construtor
   * @generated
   */
  public VmOrclResourceLimit(){
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
  public VmOrclResourceLimit setBancId(java.lang.Double bancId){
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
  public VmOrclResourceLimit setDataFim(java.util.Date dataFim){
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
  public VmOrclResourceLimit setDataInicio(java.util.Date dataInicio){
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
  public VmOrclResourceLimit setEventoAgendaId(java.lang.Double eventoAgendaId){
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
  public VmOrclResourceLimit setEventoBancoId(java.lang.Double eventoBancoId){
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
  public VmOrclResourceLimit setEventoExecucaoId(java.lang.Double eventoExecucaoId){
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
  public VmOrclResourceLimit setEventoId(java.lang.Double eventoId){
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
  public VmOrclResourceLimit setSeqResultado(java.lang.Double seqResultado){
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
  public VmOrclResourceLimit setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém resourceName
   * return resourceName
   * @generated
   */
  
  public java.lang.String getResourceName(){
    return this.resourceName;
  }

  /**
   * Define resourceName
   * @param resourceName resourceName
   * @generated
   */
  public VmOrclResourceLimit setResourceName(java.lang.String resourceName){
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Obtém currentUtilization
   * return currentUtilization
   * @generated
   */
  
  public java.lang.Double getCurrentUtilization(){
    return this.currentUtilization;
  }

  /**
   * Define currentUtilization
   * @param currentUtilization currentUtilization
   * @generated
   */
  public VmOrclResourceLimit setCurrentUtilization(java.lang.Double currentUtilization){
    this.currentUtilization = currentUtilization;
    return this;
  }

  /**
   * Obtém maxUtilization
   * return maxUtilization
   * @generated
   */
  
  public java.lang.Double getMaxUtilization(){
    return this.maxUtilization;
  }

  /**
   * Define maxUtilization
   * @param maxUtilization maxUtilization
   * @generated
   */
  public VmOrclResourceLimit setMaxUtilization(java.lang.Double maxUtilization){
    this.maxUtilization = maxUtilization;
    return this;
  }

  /**
   * Obtém initialAllocation
   * return initialAllocation
   * @generated
   */
  
  public java.lang.String getInitialAllocation(){
    return this.initialAllocation;
  }

  /**
   * Define initialAllocation
   * @param initialAllocation initialAllocation
   * @generated
   */
  public VmOrclResourceLimit setInitialAllocation(java.lang.String initialAllocation){
    this.initialAllocation = initialAllocation;
    return this;
  }

  /**
   * Obtém limitValue
   * return limitValue
   * @generated
   */
  
  public java.lang.String getLimitValue(){
    return this.limitValue;
  }

  /**
   * Define limitValue
   * @param limitValue limitValue
   * @generated
   */
  public VmOrclResourceLimit setLimitValue(java.lang.String limitValue){
    this.limitValue = limitValue;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VmOrclResourceLimit object = (VmOrclResourceLimit)obj;
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
