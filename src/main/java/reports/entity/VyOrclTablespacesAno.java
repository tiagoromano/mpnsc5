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
 * Classe que representa a tabela VY_ORCL_TABLESPACES_ANO
 * @generated
 */
@Entity
@IdClass(VyOrclTablespacesAnoPK.class)
@Table(name = "\"VY_ORCL_TABLESPACES_ANO\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.VyOrclTablespacesAno")
public class VyOrclTablespacesAno implements Serializable {

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
  @Column(name = "DATA_MES_CRESC", nullable = true, insertable=true, updatable=true)
  private java.lang.String dataMes;

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
  @Column(name = "AREA_ALOCADA_MB", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double areaAlocadaMb;

  /**
  * @generated
  */
  @Column(name = "AREA_TOTAL_MB", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double areaTotalMb;

  /**
  * @generated
  */
  @Column(name = "AREA_TOTAL_GB", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double areaTotalGb;

  /**
  * @generated
  */
  @Column(name = "AREA_ALOCADA_GB", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double areaAlocadaGb;

  /**
   * Construtor
   * @generated
   */
  public VyOrclTablespacesAno(){
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
  public VyOrclTablespacesAno setBancId(java.lang.Double bancId){
    this.bancId = bancId;
    return this;
  }

  /**
   * Obtém dataMes
   * return dataMes
   * @generated
   */
  
  public java.lang.String getDataMes(){
    return this.dataMes;
  }

  /**
   * Define dataMes
   * @param dataMes dataMes
   * @generated
   */
  public VyOrclTablespacesAno setDataMes(java.lang.String dataMes){
    this.dataMes = dataMes;
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
  public VyOrclTablespacesAno setDataInicio(java.util.Date dataInicio){
    this.dataInicio = dataInicio;
    return this;
  }

  /**
   * Obtém areaAlocadaMb
   * return areaAlocadaMb
   * @generated
   */
  
  public java.lang.Double getAreaAlocadaMb(){
    return this.areaAlocadaMb;
  }

  /**
   * Define areaAlocadaMb
   * @param areaAlocadaMb areaAlocadaMb
   * @generated
   */
  public VyOrclTablespacesAno setAreaAlocadaMb(java.lang.Double areaAlocadaMb){
    this.areaAlocadaMb = areaAlocadaMb;
    return this;
  }

  /**
   * Obtém areaTotalMb
   * return areaTotalMb
   * @generated
   */
  
  public java.lang.Double getAreaTotalMb(){
    return this.areaTotalMb;
  }

  /**
   * Define areaTotalMb
   * @param areaTotalMb areaTotalMb
   * @generated
   */
  public VyOrclTablespacesAno setAreaTotalMb(java.lang.Double areaTotalMb){
    this.areaTotalMb = areaTotalMb;
    return this;
  }

  /**
   * Obtém areaTotalGb
   * return areaTotalGb
   * @generated
   */
  
  public java.lang.Double getAreaTotalGb(){
    return this.areaTotalGb;
  }

  /**
   * Define areaTotalGb
   * @param areaTotalGb areaTotalGb
   * @generated
   */
  public VyOrclTablespacesAno setAreaTotalGb(java.lang.Double areaTotalGb){
    this.areaTotalGb = areaTotalGb;
    return this;
  }

  /**
   * Obtém areaAlocadaGb
   * return areaAlocadaGb
   * @generated
   */
  
  public java.lang.Double getAreaAlocadaGb(){
    return this.areaAlocadaGb;
  }

  /**
   * Define areaAlocadaGb
   * @param areaAlocadaGb areaAlocadaGb
   * @generated
   */
  public VyOrclTablespacesAno setAreaAlocadaGb(java.lang.Double areaAlocadaGb){
    this.areaAlocadaGb = areaAlocadaGb;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VyOrclTablespacesAno object = (VyOrclTablespacesAno)obj;
    if (bancId != null ? !bancId.equals(object.bancId) : object.bancId != null) return false;
    if (dataMes != null ? !dataMes.equals(object.dataMes) : object.dataMes != null) return false;
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
    result = 31 * result + ((dataMes == null) ? 0 : dataMes.hashCode());
    result = 31 * result + ((dataInicio == null) ? 0 : dataInicio.hashCode());
    return result;
  }

}
