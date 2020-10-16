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
 * Classe que representa a tabela VM_ORCL_LOCKS_EVENTOS
 * @generated
 */
@Entity
@IdClass(VmOrclLocksEventosPK.class)
@Table(name = "\"VM_ORCL_LOCKS_EVENTOS\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.VmOrclLocksEventos")
public class VmOrclLocksEventos implements Serializable {

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
  @Column(name = "DATA_INICIO", nullable = true, insertable=true, updatable=true)
  private java.util.Date dataInicio;

  /**
  * @generated
  */
  @Column(name = "QTD_LOCKS", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double qtdLocks;

  /**
   * Construtor
   * @generated
   */
  public VmOrclLocksEventos(){
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
  public VmOrclLocksEventos setBancId(java.lang.Double bancId){
    this.bancId = bancId;
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
  public VmOrclLocksEventos setDataInicio(java.util.Date dataInicio){
    this.dataInicio = dataInicio;
    return this;
  }

  /**
   * Obtém qtdLocks
   * return qtdLocks
   * @generated
   */
  
  public java.lang.Double getQtdLocks(){
    return this.qtdLocks;
  }

  /**
   * Define qtdLocks
   * @param qtdLocks qtdLocks
   * @generated
   */
  public VmOrclLocksEventos setQtdLocks(java.lang.Double qtdLocks){
    this.qtdLocks = qtdLocks;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VmOrclLocksEventos object = (VmOrclLocksEventos)obj;
    if (bancId != null ? !bancId.equals(object.bancId) : object.bancId != null) return false;
    if (dataInicio != null ? !dataInicio.equals(object.dataInicio) : object.dataInicio != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((bancId == null) ? 0 : bancId.hashCode());
    result = 31 * result + ((dataInicio == null) ? 0 : dataInicio.hashCode());
    return result;
  }

}
