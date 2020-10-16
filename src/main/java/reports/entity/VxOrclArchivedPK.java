package reports.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class VxOrclArchivedPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  private java.lang.Double bancId;
  
  /**
   * @generated
   */
  private java.util.Date dataInicio;
  
  /**
   * @generated
   */
  private java.lang.String horaLog;
  
  /**
   * Construtor
   * @generated
   */
  public VxOrclArchivedPK(){
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
  public VxOrclArchivedPK setBancId(java.lang.Double bancId){
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
  public VxOrclArchivedPK setDataInicio(java.util.Date dataInicio){
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
  public VxOrclArchivedPK setHoraLog(java.lang.String horaLog){
    this.horaLog = horaLog;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VxOrclArchivedPK object = (VxOrclArchivedPK)obj;
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
