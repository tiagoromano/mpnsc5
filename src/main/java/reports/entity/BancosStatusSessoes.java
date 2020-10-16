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
 * Classe que representa a tabela BANCOS_STATUS_SESSOES
 * @generated
 */
@Entity
@IdClass(BancosStatusSessoesPK.class)
@Table(name = "\"BANCOS_STATUS_SESSOES\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.BancosStatusSessoes")
public class BancosStatusSessoes implements Serializable {

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
  @Column(name = "QTDE_SESSOES_ATIVAS", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double qtdeSessoesAtivas;

  /**
   * Construtor
   * @generated
   */
  public BancosStatusSessoes(){
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
  public BancosStatusSessoes setBancId(java.lang.Double bancId){
    this.bancId = bancId;
    return this;
  }

  /**
   * Obtém qtdeSessoesAtivas
   * return qtdeSessoesAtivas
   * @generated
   */
  
  public java.lang.Double getQtdeSessoesAtivas(){
    return this.qtdeSessoesAtivas;
  }

  /**
   * Define qtdeSessoesAtivas
   * @param qtdeSessoesAtivas qtdeSessoesAtivas
   * @generated
   */
  public BancosStatusSessoes setQtdeSessoesAtivas(java.lang.Double qtdeSessoesAtivas){
    this.qtdeSessoesAtivas = qtdeSessoesAtivas;
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
  public BancosStatusSessoes setDataGeracao(java.util.Date dataGeracao){
    this.dataGeracao = dataGeracao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    BancosStatusSessoes object = (BancosStatusSessoes)obj;
    if (bancId != null ? !bancId.equals(object.bancId) : object.bancId != null) return false;
    if (dataGeracao != null ? !dataGeracao.equals(object.dataGeracao) : object.dataGeracao != null) return false;
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
    return result;
  }

}
