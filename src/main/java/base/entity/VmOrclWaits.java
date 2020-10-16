package base.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela VM_ORCL_WAITS
 * @generated
 */
@Entity
@Table(name = "\"VM_ORCL_WAITS\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("base.entity.VmOrclWaits")
public class VmOrclWaits implements Serializable {

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
  @Column(name = "BANC_ID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double bancId;

  /**
  * @generated
  */
  @Column(name = "AVG_MS", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double avgMs;

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
  @Column(name = "EVENT", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String event;

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
  @Column(name = "NOME", nullable = false, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "PCT_TIME", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double pctTime;

  /**
  * @generated
  */
  @Column(name = "TOTAL_MS", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double totalMs;

  /**
  * @generated
  */
  @Column(name = "WAIT_CLASS", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  
  private java.lang.String waitClass;

  /**
  * @generated
  */
  @Column(name = "WAITS", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double waits;

  /**
   * Construtor
   * @generated
   */
  public VmOrclWaits(){
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
  public VmOrclWaits setBancId(java.lang.Double bancId){
    this.bancId = bancId;
    return this;
  }

  /**
   * Obtém avgMs
   * return avgMs
   * @generated
   */
  
  public java.lang.Double getAvgMs(){
    return this.avgMs;
  }

  /**
   * Define avgMs
   * @param avgMs avgMs
   * @generated
   */
  public VmOrclWaits setAvgMs(java.lang.Double avgMs){
    this.avgMs = avgMs;
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
  public VmOrclWaits setDataFim(java.util.Date dataFim){
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
  public VmOrclWaits setDataInicio(java.util.Date dataInicio){
    this.dataInicio = dataInicio;
    return this;
  }

  /**
   * Obtém event
   * return event
   * @generated
   */
  
  public java.lang.String getEvent(){
    return this.event;
  }

  /**
   * Define event
   * @param event event
   * @generated
   */
  public VmOrclWaits setEvent(java.lang.String event){
    this.event = event;
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
  public VmOrclWaits setEventoAgendaId(java.lang.Double eventoAgendaId){
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
  public VmOrclWaits setEventoBancoId(java.lang.Double eventoBancoId){
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
  public VmOrclWaits setEventoExecucaoId(java.lang.Double eventoExecucaoId){
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
  public VmOrclWaits setEventoId(java.lang.Double eventoId){
    this.eventoId = eventoId;
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
  public VmOrclWaits setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém pctTime
   * return pctTime
   * @generated
   */
  
  public java.lang.Double getPctTime(){
    return this.pctTime;
  }

  /**
   * Define pctTime
   * @param pctTime pctTime
   * @generated
   */
  public VmOrclWaits setPctTime(java.lang.Double pctTime){
    this.pctTime = pctTime;
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
  public VmOrclWaits setSeqResultado(java.lang.Double seqResultado){
    this.seqResultado = seqResultado;
    return this;
  }

  /**
   * Obtém totalMs
   * return totalMs
   * @generated
   */
  
  public java.lang.Double getTotalMs(){
    return this.totalMs;
  }

  /**
   * Define totalMs
   * @param totalMs totalMs
   * @generated
   */
  public VmOrclWaits setTotalMs(java.lang.Double totalMs){
    this.totalMs = totalMs;
    return this;
  }

  /**
   * Obtém waitClass
   * return waitClass
   * @generated
   */
  
  public java.lang.String getWaitClass(){
    return this.waitClass;
  }

  /**
   * Define waitClass
   * @param waitClass waitClass
   * @generated
   */
  public VmOrclWaits setWaitClass(java.lang.String waitClass){
    this.waitClass = waitClass;
    return this;
  }

  /**
   * Obtém waits
   * return waits
   * @generated
   */
  
  public java.lang.Double getWaits(){
    return this.waits;
  }

  /**
   * Define waits
   * @param waits waits
   * @generated
   */
  public VmOrclWaits setWaits(java.lang.Double waits){
    this.waits = waits;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VmOrclWaits object = (VmOrclWaits)obj;
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
