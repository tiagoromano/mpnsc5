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
 * Classe que representa a tabela VM_ORCL_ASM
 * @generated
 */
@Entity
@Table(name = "\"VM_ORCL_ASM\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.VwOrclAsm")
public class VwOrclAsm implements Serializable {

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
  @Column(name = "GROUP_NUMBER", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double groupNumber;

  /**
  * @generated
  */
  @Column(name = "GROUP_NAME", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String groupName;

  /**
  * @generated
  */
  @Column(name = "TOTAL_MB", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double totalMb;

  /**
  * @generated
  */
  @Column(name = "FREE_MB", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double freeMb;

  /**
   * Construtor
   * @generated
   */
  public VwOrclAsm(){
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
  public VwOrclAsm setBancId(java.lang.Double bancId){
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
  public VwOrclAsm setDataFim(java.util.Date dataFim){
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
  public VwOrclAsm setDataInicio(java.util.Date dataInicio){
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
  public VwOrclAsm setEventoExecucaoId(java.lang.Double eventoExecucaoId){
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
  public VwOrclAsm setSeqResultado(java.lang.Double seqResultado){
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
  public VwOrclAsm setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém groupNumber
   * return groupNumber
   * @generated
   */
  
  public java.lang.Double getGroupNumber(){
    return this.groupNumber;
  }

  /**
   * Define groupNumber
   * @param groupNumber groupNumber
   * @generated
   */
  public VwOrclAsm setGroupNumber(java.lang.Double groupNumber){
    this.groupNumber = groupNumber;
    return this;
  }

  /**
   * Obtém groupName
   * return groupName
   * @generated
   */
  
  public java.lang.String getGroupName(){
    return this.groupName;
  }

  /**
   * Define groupName
   * @param groupName groupName
   * @generated
   */
  public VwOrclAsm setGroupName(java.lang.String groupName){
    this.groupName = groupName;
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
  public VwOrclAsm setTotalMb(java.lang.Double totalMb){
    this.totalMb = totalMb;
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
  public VwOrclAsm setFreeMb(java.lang.Double freeMb){
    this.freeMb = freeMb;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VwOrclAsm object = (VwOrclAsm)obj;
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
