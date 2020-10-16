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
 * Classe que representa a tabela VW_ORCL_SESSIONS
 * @generated
 */
@Entity
@IdClass(VwOrclSessionsPK.class)
@Table(name = "\"VW_ORCL_SESSIONS\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.VwOrclSessions")
public class VwOrclSessions implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "BANC_ID", nullable = true, insertable=true, updatable=true)
  private java.lang.Double bancId;

  /**
   * @generated
   */
  @Id
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_GERACAO", nullable = true, insertable=true, updatable=true)
  private java.util.Date dataGeracao;

  /**
   * @generated
   */
  @Id
  @Column(name = "DATA_HORA", nullable = true, insertable=true, updatable=true)
  private java.lang.String dataHora;

  /**
  * @generated
  */
  @Column(name = "MIN_ATIVAS", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double minAtivas;

  /**
  * @generated
  */
  @Column(name = "MAX_ATIVAS", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double maxAtivas;

  /**
  * @generated
  */
  @Column(name = "AVG_ATIVAS", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double avgAtivas;

  /**
  * @generated
  */
  @Column(name = "NUM_MAX_SESSOES", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double numMaxSessoes;

  /**
   * Construtor
   * @generated
   */
  public VwOrclSessions(){
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
  public VwOrclSessions setBancId(java.lang.Double bancId){
    this.bancId = bancId;
    return this;
  }

  /**
   * Obtém dataGeracao
   * return dataGeracao
   * @generated
   */
  
  public java.util.Date getDataGeracao(){
    return this.dataGeracao;
  }

  /**
   * Define dataGeracao
   * @param dataGeracao dataGeracao
   * @generated
   */
  public VwOrclSessions setDataGeracao(java.util.Date dataGeracao){
    this.dataGeracao = dataGeracao;
    return this;
  }

  /**
   * Obtém dataHora
   * return dataHora
   * @generated
   */
  
  public java.lang.String getDataHora(){
    return this.dataHora;
  }

  /**
   * Define dataHora
   * @param dataHora dataHora
   * @generated
   */
  public VwOrclSessions setDataHora(java.lang.String dataHora){
    this.dataHora = dataHora;
    return this;
  }

  /**
   * Obtém minAtivas
   * return minAtivas
   * @generated
   */
  
  public java.lang.Double getMinAtivas(){
    return this.minAtivas;
  }

  /**
   * Define minAtivas
   * @param minAtivas minAtivas
   * @generated
   */
  public VwOrclSessions setMinAtivas(java.lang.Double minAtivas){
    this.minAtivas = minAtivas;
    return this;
  }

  /**
   * Obtém maxAtivas
   * return maxAtivas
   * @generated
   */
  
  public java.lang.Double getMaxAtivas(){
    return this.maxAtivas;
  }

  /**
   * Define maxAtivas
   * @param maxAtivas maxAtivas
   * @generated
   */
  public VwOrclSessions setMaxAtivas(java.lang.Double maxAtivas){
    this.maxAtivas = maxAtivas;
    return this;
  }

  /**
   * Obtém avgAtivas
   * return avgAtivas
   * @generated
   */
  
  public java.lang.Double getAvgAtivas(){
    return this.avgAtivas;
  }

  /**
   * Define avgAtivas
   * @param avgAtivas avgAtivas
   * @generated
   */
  public VwOrclSessions setAvgAtivas(java.lang.Double avgAtivas){
    this.avgAtivas = avgAtivas;
    return this;
  }

  /**
   * Obtém numMaxSessoes
   * return numMaxSessoes
   * @generated
   */
  
  public java.lang.Double getNumMaxSessoes(){
    return this.numMaxSessoes;
  }

  /**
   * Define numMaxSessoes
   * @param numMaxSessoes numMaxSessoes
   * @generated
   */
  public VwOrclSessions setNumMaxSessoes(java.lang.Double numMaxSessoes){
    this.numMaxSessoes = numMaxSessoes;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VwOrclSessions object = (VwOrclSessions)obj;
    if (bancId != null ? !bancId.equals(object.bancId) : object.bancId != null) return false;
    if (dataGeracao != null ? !dataGeracao.equals(object.dataGeracao) : object.dataGeracao != null) return false;
    if (dataHora != null ? !dataHora.equals(object.dataHora) : object.dataHora != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((bancId == null) ? 0 : bancId.hashCode());
    result = 31 * result + ((dataGeracao == null) ? 0 : dataGeracao.hashCode());
    result = 31 * result + ((dataHora == null) ? 0 : dataHora.hashCode());
    return result;
  }

}
