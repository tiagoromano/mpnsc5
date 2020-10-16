package base.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TIPOS_BANCOS
 * @generated
 */
@Entity
@Table(name = "\"TIPOS_BANCOS\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("base.entity.TiposBancos")
public class TiposBancos implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "CD_TIPO_BANCO", nullable = false, insertable=true, updatable=true)
  private java.lang.Double cdTipoBanco;

  /**
  * @generated
  */
  @Column(name = "DS_ICONE_BANCO", nullable = true, unique = false, length=30, insertable=true, updatable=true)
  
  private java.lang.String dsIconeBanco;

  /**
  * @generated
  */
  @Column(name = "DS_TIPO_BANCO", nullable = false, unique = false, length=30, insertable=true, updatable=true)
  
  private java.lang.String dsTipoBanco;

  /**
   * Construtor
   * @generated
   */
  public TiposBancos(){
  }


  /**
   * Obtém cdTipoBanco
   * return cdTipoBanco
   * @generated
   */
  
  public java.lang.Double getCdTipoBanco(){
    return this.cdTipoBanco;
  }

  /**
   * Define cdTipoBanco
   * @param cdTipoBanco cdTipoBanco
   * @generated
   */
  public TiposBancos setCdTipoBanco(java.lang.Double cdTipoBanco){
    this.cdTipoBanco = cdTipoBanco;
    return this;
  }

  /**
   * Obtém dsIconeBanco
   * return dsIconeBanco
   * @generated
   */
  
  public java.lang.String getDsIconeBanco(){
    return this.dsIconeBanco;
  }

  /**
   * Define dsIconeBanco
   * @param dsIconeBanco dsIconeBanco
   * @generated
   */
  public TiposBancos setDsIconeBanco(java.lang.String dsIconeBanco){
    this.dsIconeBanco = dsIconeBanco;
    return this;
  }

  /**
   * Obtém dsTipoBanco
   * return dsTipoBanco
   * @generated
   */
  
  public java.lang.String getDsTipoBanco(){
    return this.dsTipoBanco;
  }

  /**
   * Define dsTipoBanco
   * @param dsTipoBanco dsTipoBanco
   * @generated
   */
  public TiposBancos setDsTipoBanco(java.lang.String dsTipoBanco){
    this.dsTipoBanco = dsTipoBanco;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    TiposBancos object = (TiposBancos)obj;
    if (cdTipoBanco != null ? !cdTipoBanco.equals(object.cdTipoBanco) : object.cdTipoBanco != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((cdTipoBanco == null) ? 0 : cdTipoBanco.hashCode());
    return result;
  }

}
