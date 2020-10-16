package reports.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class VwOrclSessionsPK implements Serializable {

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
   * @generated
   */
  private java.lang.String dataHora;
  
  /**
   * Construtor
   * @generated
   */
  public VwOrclSessionsPK(){
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
  public VwOrclSessionsPK setBancId(java.lang.Double bancId){
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
  public VwOrclSessionsPK setDataGeracao(java.util.Date dataGeracao){
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
  public VwOrclSessionsPK setDataHora(java.lang.String dataHora){
    this.dataHora = dataHora;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VwOrclSessionsPK object = (VwOrclSessionsPK)obj;
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
