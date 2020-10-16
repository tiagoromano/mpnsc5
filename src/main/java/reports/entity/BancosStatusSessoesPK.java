package reports.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class BancosStatusSessoesPK implements Serializable {

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
  private java.util.Date dataGeracao;
  
  /**
   * Construtor
   * @generated
   */
  public BancosStatusSessoesPK(){
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
  public BancosStatusSessoesPK setBancId(java.lang.Double bancId){
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
  public BancosStatusSessoesPK setDataGeracao(java.util.Date dataGeracao){
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
    BancosStatusSessoesPK object = (BancosStatusSessoesPK)obj;
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
