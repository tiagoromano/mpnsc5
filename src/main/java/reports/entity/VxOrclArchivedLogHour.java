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
 * Classe que representa a tabela VX_ORCL_ARCHIVED_LOG_HOUR
 * @generated
 */
@Entity
@IdClass(VxOrclArchivedLogHourPK.class)
@Table(name = "\"VX_ORCL_ARCHIVED_LOG_HOUR\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.VxOrclArchivedLogHour")
public class VxOrclArchivedLogHour implements Serializable {

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
  @Column(name = "DATA_ARCHIVE_LOG", nullable = false, insertable=true, updatable=true)
  private java.util.Date dataArchiveLog;

  /**
  * @generated
  */
  @Column(name = "D00", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.Double d00;

  /**
  * @generated
  */
  @Column(name = "d01", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d01;

  /**
  * @generated
  */
  @Column(name = "d02", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d02;

  /**
  * @generated
  */
  @Column(name = "d03", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d03;

  /**
  * @generated
  */
  @Column(name = "d04", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d04;

  /**
  * @generated
  */
  @Column(name = "d05", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d05;

  /**
  * @generated
  */
  @Column(name = "d06", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d06;

  /**
  * @generated
  */
  @Column(name = "d07", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d07;

  /**
  * @generated
  */
  @Column(name = "d08", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d08;

  /**
  * @generated
  */
  @Column(name = "d09", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d09;

  /**
  * @generated
  */
  @Column(name = "d10", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d10;

  /**
  * @generated
  */
  @Column(name = "d11", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d11;

  /**
  * @generated
  */
  @Column(name = "d12", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d12;

  /**
  * @generated
  */
  @Column(name = "d13", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d13;

  /**
  * @generated
  */
  @Column(name = "d14", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d14;

  /**
  * @generated
  */
  @Column(name = "d15", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d15;

  /**
  * @generated
  */
  @Column(name = "d16", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d16;

  /**
  * @generated
  */
  @Column(name = "d17", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d17;

  /**
  * @generated
  */
  @Column(name = "d18", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d18;

  /**
  * @generated
  */
  @Column(name = "d19", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d19;

  /**
  * @generated
  */
  @Column(name = "d20", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d20;

  /**
  * @generated
  */
  @Column(name = "d21", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d21;

  /**
  * @generated
  */
  @Column(name = "d22", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d22;

  /**
  * @generated
  */
  @Column(name = "d23", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double d23;

  /**
  * @generated
  */
  @Column(name = "QTD_FILES", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double qtdFiles;

  /**
   * Construtor
   * @generated
   */
  public VxOrclArchivedLogHour(){
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
  public VxOrclArchivedLogHour setBancId(java.lang.Double bancId){
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
  public VxOrclArchivedLogHour setDataArchiveLog(java.util.Date dataArchiveLog){
    this.dataArchiveLog = dataArchiveLog;
    return this;
  }

  /**
   * Obtém d00
   * return d00
   * @generated
   */
  
  public java.lang.Double getD00(){
    return this.d00;
  }

  /**
   * Define d00
   * @param d00 d00
   * @generated
   */
  public VxOrclArchivedLogHour setD00(java.lang.Double d00){
    this.d00 = d00;
    return this;
  }

  /**
   * Obtém d01
   * return d01
   * @generated
   */
  
  public java.lang.Double getD01(){
    return this.d01;
  }

  /**
   * Define d01
   * @param d01 d01
   * @generated
   */
  public VxOrclArchivedLogHour setD01(java.lang.Double d01){
    this.d01 = d01;
    return this;
  }

  /**
   * Obtém d02
   * return d02
   * @generated
   */
  
  public java.lang.Double getD02(){
    return this.d02;
  }

  /**
   * Define d02
   * @param d02 d02
   * @generated
   */
  public VxOrclArchivedLogHour setD02(java.lang.Double d02){
    this.d02 = d02;
    return this;
  }

  /**
   * Obtém d03
   * return d03
   * @generated
   */
  
  public java.lang.Double getD03(){
    return this.d03;
  }

  /**
   * Define d03
   * @param d03 d03
   * @generated
   */
  public VxOrclArchivedLogHour setD03(java.lang.Double d03){
    this.d03 = d03;
    return this;
  }

  /**
   * Obtém d04
   * return d04
   * @generated
   */
  
  public java.lang.Double getD04(){
    return this.d04;
  }

  /**
   * Define d04
   * @param d04 d04
   * @generated
   */
  public VxOrclArchivedLogHour setD04(java.lang.Double d04){
    this.d04 = d04;
    return this;
  }

  /**
   * Obtém d05
   * return d05
   * @generated
   */
  
  public java.lang.Double getD05(){
    return this.d05;
  }

  /**
   * Define d05
   * @param d05 d05
   * @generated
   */
  public VxOrclArchivedLogHour setD05(java.lang.Double d05){
    this.d05 = d05;
    return this;
  }

  /**
   * Obtém d06
   * return d06
   * @generated
   */
  
  public java.lang.Double getD06(){
    return this.d06;
  }

  /**
   * Define d06
   * @param d06 d06
   * @generated
   */
  public VxOrclArchivedLogHour setD06(java.lang.Double d06){
    this.d06 = d06;
    return this;
  }

  /**
   * Obtém d07
   * return d07
   * @generated
   */
  
  public java.lang.Double getD07(){
    return this.d07;
  }

  /**
   * Define d07
   * @param d07 d07
   * @generated
   */
  public VxOrclArchivedLogHour setD07(java.lang.Double d07){
    this.d07 = d07;
    return this;
  }

  /**
   * Obtém d08
   * return d08
   * @generated
   */
  
  public java.lang.Double getD08(){
    return this.d08;
  }

  /**
   * Define d08
   * @param d08 d08
   * @generated
   */
  public VxOrclArchivedLogHour setD08(java.lang.Double d08){
    this.d08 = d08;
    return this;
  }

  /**
   * Obtém d09
   * return d09
   * @generated
   */
  
  public java.lang.Double getD09(){
    return this.d09;
  }

  /**
   * Define d09
   * @param d09 d09
   * @generated
   */
  public VxOrclArchivedLogHour setD09(java.lang.Double d09){
    this.d09 = d09;
    return this;
  }

  /**
   * Obtém d10
   * return d10
   * @generated
   */
  
  public java.lang.Double getD10(){
    return this.d10;
  }

  /**
   * Define d10
   * @param d10 d10
   * @generated
   */
  public VxOrclArchivedLogHour setD10(java.lang.Double d10){
    this.d10 = d10;
    return this;
  }

  /**
   * Obtém d11
   * return d11
   * @generated
   */
  
  public java.lang.Double getD11(){
    return this.d11;
  }

  /**
   * Define d11
   * @param d11 d11
   * @generated
   */
  public VxOrclArchivedLogHour setD11(java.lang.Double d11){
    this.d11 = d11;
    return this;
  }

  /**
   * Obtém d12
   * return d12
   * @generated
   */
  
  public java.lang.Double getD12(){
    return this.d12;
  }

  /**
   * Define d12
   * @param d12 d12
   * @generated
   */
  public VxOrclArchivedLogHour setD12(java.lang.Double d12){
    this.d12 = d12;
    return this;
  }

  /**
   * Obtém d13
   * return d13
   * @generated
   */
  
  public java.lang.Double getD13(){
    return this.d13;
  }

  /**
   * Define d13
   * @param d13 d13
   * @generated
   */
  public VxOrclArchivedLogHour setD13(java.lang.Double d13){
    this.d13 = d13;
    return this;
  }

  /**
   * Obtém d14
   * return d14
   * @generated
   */
  
  public java.lang.Double getD14(){
    return this.d14;
  }

  /**
   * Define d14
   * @param d14 d14
   * @generated
   */
  public VxOrclArchivedLogHour setD14(java.lang.Double d14){
    this.d14 = d14;
    return this;
  }

  /**
   * Obtém d15
   * return d15
   * @generated
   */
  
  public java.lang.Double getD15(){
    return this.d15;
  }

  /**
   * Define d15
   * @param d15 d15
   * @generated
   */
  public VxOrclArchivedLogHour setD15(java.lang.Double d15){
    this.d15 = d15;
    return this;
  }

  /**
   * Obtém d16
   * return d16
   * @generated
   */
  
  public java.lang.Double getD16(){
    return this.d16;
  }

  /**
   * Define d16
   * @param d16 d16
   * @generated
   */
  public VxOrclArchivedLogHour setD16(java.lang.Double d16){
    this.d16 = d16;
    return this;
  }

  /**
   * Obtém d17
   * return d17
   * @generated
   */
  
  public java.lang.Double getD17(){
    return this.d17;
  }

  /**
   * Define d17
   * @param d17 d17
   * @generated
   */
  public VxOrclArchivedLogHour setD17(java.lang.Double d17){
    this.d17 = d17;
    return this;
  }

  /**
   * Obtém d18
   * return d18
   * @generated
   */
  
  public java.lang.Double getD18(){
    return this.d18;
  }

  /**
   * Define d18
   * @param d18 d18
   * @generated
   */
  public VxOrclArchivedLogHour setD18(java.lang.Double d18){
    this.d18 = d18;
    return this;
  }

  /**
   * Obtém d19
   * return d19
   * @generated
   */
  
  public java.lang.Double getD19(){
    return this.d19;
  }

  /**
   * Define d19
   * @param d19 d19
   * @generated
   */
  public VxOrclArchivedLogHour setD19(java.lang.Double d19){
    this.d19 = d19;
    return this;
  }

  /**
   * Obtém d20
   * return d20
   * @generated
   */
  
  public java.lang.Double getD20(){
    return this.d20;
  }

  /**
   * Define d20
   * @param d20 d20
   * @generated
   */
  public VxOrclArchivedLogHour setD20(java.lang.Double d20){
    this.d20 = d20;
    return this;
  }

  /**
   * Obtém d21
   * return d21
   * @generated
   */
  
  public java.lang.Double getD21(){
    return this.d21;
  }

  /**
   * Define d21
   * @param d21 d21
   * @generated
   */
  public VxOrclArchivedLogHour setD21(java.lang.Double d21){
    this.d21 = d21;
    return this;
  }

  /**
   * Obtém d22
   * return d22
   * @generated
   */
  
  public java.lang.Double getD22(){
    return this.d22;
  }

  /**
   * Define d22
   * @param d22 d22
   * @generated
   */
  public VxOrclArchivedLogHour setD22(java.lang.Double d22){
    this.d22 = d22;
    return this;
  }

  /**
   * Obtém d23
   * return d23
   * @generated
   */
  
  public java.lang.Double getD23(){
    return this.d23;
  }

  /**
   * Define d23
   * @param d23 d23
   * @generated
   */
  public VxOrclArchivedLogHour setD23(java.lang.Double d23){
    this.d23 = d23;
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
  public VxOrclArchivedLogHour setQtdFiles(java.lang.Double qtdFiles){
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
    VxOrclArchivedLogHour object = (VxOrclArchivedLogHour)obj;
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
