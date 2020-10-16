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
 * Classe que representa a tabela VW_RESTARTS
 * @generated
 */
@Entity
@Table(name = "\"VW_RESTARTS\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.VwRestarts")
public class VwRestarts implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID", nullable = true, insertable=true, updatable=true)
  private java.lang.Double id;

  /**
  * @generated
  */
  @Column(name = "BANC_ID", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.Double bancId;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "STARTUP_TIME", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date startupTime;

  /**
   * Construtor
   * @generated
   */
  public VwRestarts(){
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
  public VwRestarts setBancId(java.lang.Double bancId){
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
  public VwRestarts setStartupTime(java.util.Date startupTime){
    this.startupTime = startupTime;
    return this;
  }

  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.Double getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public VwRestarts setId(java.lang.Double id){
    this.id = id;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VwRestarts object = (VwRestarts)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
