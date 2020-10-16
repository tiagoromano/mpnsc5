package reports.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class VmOrclLocksEventosPK implements Serializable {

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
   * Construtor
   * @generated
   */
  public VmOrclLocksEventosPK(){
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
  public VmOrclLocksEventosPK setBancId(java.lang.Double bancId){
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
  public VmOrclLocksEventosPK setDataInicio(java.util.Date dataInicio){
    this.dataInicio = dataInicio;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VmOrclLocksEventosPK object = (VmOrclLocksEventosPK)obj;
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
