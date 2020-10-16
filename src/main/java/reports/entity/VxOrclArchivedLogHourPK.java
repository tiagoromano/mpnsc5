package reports.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class VxOrclArchivedLogHourPK implements Serializable {

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
  private java.util.Date dataArchiveLog;
  
  /**
   * Construtor
   * @generated
   */
  public VxOrclArchivedLogHourPK(){
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
  public VxOrclArchivedLogHourPK setBancId(java.lang.Double bancId){
    this.bancId = bancId;
    return this;
  }
  /**
   * Obtém dataArchiveLog
   * return dataArchiveLog
   * @generated
   */
  public java.util.Date getDataArchiveLog(){
    return this.dataArchiveLog;
  }
  
  /**
   * Define dataArchiveLog
   * @param dataArchiveLog dataArchiveLog
   * @generated
   */
  public VxOrclArchivedLogHourPK setDataArchiveLog(java.util.Date dataArchiveLog){
    this.dataArchiveLog = dataArchiveLog;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VxOrclArchivedLogHourPK object = (VxOrclArchivedLogHourPK)obj;
    if (bancId != null ? !bancId.equals(object.bancId) : object.bancId != null) return false;
    if (dataArchiveLog != null ? !dataArchiveLog.equals(object.dataArchiveLog) : object.dataArchiveLog != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((bancId == null) ? 0 : bancId.hashCode());
    result = 31 * result + ((dataArchiveLog == null) ? 0 : dataArchiveLog.hashCode());
    return result;
  }

}
