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
 * Classe que representa a tabela VX_ORCL_ARCHIVED_LOG
 * @generated
 */
@Entity
@IdClass(VxOrclArchivedPK.class)
@Table(name = "\"VX_ORCL_ARCHIVED_LOG\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.VxOrclArchived")
public class VxOrclArchived implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "BANC_ID", nullable = false, insertable=true, updatable=true)
  private java.lang.Double bancId;

  /**
   * @generated
   */
  @Id
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA_LOG", nullable = true, insertable=true, updatable=true)
  private java.util.Date dataInicio;

  /**
   * @generated
   */
  @Id
  @Column(name = "HORA_LOG", nullable = true, insertable=true, updatable=true)
  private java.lang.String horaLog;

  /**
  * @generated
  */
  @Column(name = "MBYTES", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double archiveMbytes;

  /**
  * @generated
  */
  @Column(name = "QTD_FILES", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double qtdFiles;

  /**
   * Construtor
   * @generated
   */
  public VxOrclArchived(){
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
  public VxOrclArchived setBancId(java.lang.Double bancId){
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
  public VxOrclArchived setDataInicio(java.util.Date dataInicio){
    this.dataInicio = dataInicio;
    return this;
  }

  /**
   * Obtém horaLog
   * return horaLog
   * @generated
   */
  
  public java.lang.String getHoraLog(){
    return this.horaLog;
  }

  /**
   * Define horaLog
   * @param horaLog horaLog
   * @generated
   */
  public VxOrclArchived setHoraLog(java.lang.String horaLog){
    this.horaLog = horaLog;
    return this;
  }

  /**
   * Obtém archiveMbytes
   * return archiveMbytes
   * @generated
   */
  
  public java.lang.Double getArchiveMbytes(){
    return this.archiveMbytes;
  }

  /**
   * Define archiveMbytes
   * @param archiveMbytes archiveMbytes
   * @generated
   */
  public VxOrclArchived setArchiveMbytes(java.lang.Double archiveMbytes){
    this.archiveMbytes = archiveMbytes;
    return this;
  }

  /**
   * Obtém qtdFiles
   * return qtdFiles
   * @generated
   */
  
  public java.lang.Double getQtdFiles(){
    return this.qtdFiles;
  }

  /**
   * Define qtdFiles
   * @param qtdFiles qtdFiles
   * @generated
   */
  public VxOrclArchived setQtdFiles(java.lang.Double qtdFiles){
    this.qtdFiles = qtdFiles;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VxOrclArchived object = (VxOrclArchived)obj;
    if (bancId != null ? !bancId.equals(object.bancId) : object.bancId != null) return false;
    if (dataInicio != null ? !dataInicio.equals(object.dataInicio) : object.dataInicio != null) return false;
    if (horaLog != null ? !horaLog.equals(object.horaLog) : object.horaLog != null) return false;
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
    result = 31 * result + ((horaLog == null) ? 0 : horaLog.hashCode());
    return result;
  }

}
