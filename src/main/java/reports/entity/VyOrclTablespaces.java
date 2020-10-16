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
 * Classe que representa a tabela VY_ORCL_TABLESPACES
 * @generated
 */
@Entity
@Table(name = "\"VY_ORCL_TABLESPACES\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.VyOrclTablespaces")
public class VyOrclTablespaces implements Serializable {

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
  @Column(name = "EVENTO_EXECUCAO_ID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double eventoExecucaoId;

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
  @Column(name = "PCT_USED", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double pctUsed;

  /**
  * @generated
  */
  @Column(name = "TOTAL_MB", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double totalMb;

  /**
  * @generated
  */
  @Column(name = "TOTAL_ALOCADO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double totalAlocado;

  /**
  * @generated
  */
  @Column(name = "ESPACO_EXTENDIDO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double espacoExtendido;

  /**
  * @generated
  */
  @Column(name = "FREE_MB", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double freeMb;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_INICIO_REF", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataInicioRef;

  /**
  * @generated
  */
  @Column(name = "DATA_INICIO_GRAPH", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String dataInicioGraph;

  /**
   * Construtor
   * @generated
   */
  public VyOrclTablespaces(){
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
  public VyOrclTablespaces setBancId(java.lang.Double bancId){
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
  public VyOrclTablespaces setDataFim(java.util.Date dataFim){
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
  public VyOrclTablespaces setDataInicio(java.util.Date dataInicio){
    this.dataInicio = dataInicio;
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
  public VyOrclTablespaces setEventoExecucaoId(java.lang.Double eventoExecucaoId){
    this.eventoExecucaoId = eventoExecucaoId;
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
  public VyOrclTablespaces setSeqResultado(java.lang.Double seqResultado){
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
  public VyOrclTablespaces setNome(java.lang.String nome){
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
  public VyOrclTablespaces setTablespaceName(java.lang.String tablespaceName){
    this.tablespaceName = tablespaceName;
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
  public VyOrclTablespaces setPctUsed(java.lang.Double pctUsed){
    this.pctUsed = pctUsed;
    return this;
  }

  /**
   * Obtém totalMb
   * return totalMb
   * @generated
   */
  
  public java.lang.Double getTotalMb(){
    return this.totalMb;
  }

  /**
   * Define totalMb
   * @param totalMb totalMb
   * @generated
   */
  public VyOrclTablespaces setTotalMb(java.lang.Double totalMb){
    this.totalMb = totalMb;
    return this;
  }

  /**
   * Obtém totalAlocado
   * return totalAlocado
   * @generated
   */
  
  public java.lang.Double getTotalAlocado(){
    return this.totalAlocado;
  }

  /**
   * Define totalAlocado
   * @param totalAlocado totalAlocado
   * @generated
   */
  public VyOrclTablespaces setTotalAlocado(java.lang.Double totalAlocado){
    this.totalAlocado = totalAlocado;
    return this;
  }

  /**
   * Obtém espacoExtendido
   * return espacoExtendido
   * @generated
   */
  
  public java.lang.Double getEspacoExtendido(){
    return this.espacoExtendido;
  }

  /**
   * Define espacoExtendido
   * @param espacoExtendido espacoExtendido
   * @generated
   */
  public VyOrclTablespaces setEspacoExtendido(java.lang.Double espacoExtendido){
    this.espacoExtendido = espacoExtendido;
    return this;
  }

  /**
   * Obtém freeMb
   * return freeMb
   * @generated
   */
  
  public java.lang.Double getFreeMb(){
    return this.freeMb;
  }

  /**
   * Define freeMb
   * @param freeMb freeMb
   * @generated
   */
  public VyOrclTablespaces setFreeMb(java.lang.Double freeMb){
    this.freeMb = freeMb;
    return this;
  }

  /**
   * Obtém dataInicioRef
   * return dataInicioRef
   * @generated
   */
  
  public java.util.Date getDataInicioRef(){
    return this.dataInicioRef;
  }

  /**
   * Define dataInicioRef
   * @param dataInicioRef dataInicioRef
   * @generated
   */
  public VyOrclTablespaces setDataInicioRef(java.util.Date dataInicioRef){
    this.dataInicioRef = dataInicioRef;
    return this;
  }

  /**
   * Obtém dataInicioGraph
   * return dataInicioGraph
   * @generated
   */
  
  public java.lang.String getDataInicioGraph(){
    return this.dataInicioGraph;
  }

  /**
   * Define dataInicioGraph
   * @param dataInicioGraph dataInicioGraph
   * @generated
   */
  public VyOrclTablespaces setDataInicioGraph(java.lang.String dataInicioGraph){
    this.dataInicioGraph = dataInicioGraph;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VyOrclTablespaces object = (VyOrclTablespaces)obj;
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
