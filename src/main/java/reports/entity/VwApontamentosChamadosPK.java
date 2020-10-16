package reports.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class VwApontamentosChamadosPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  private java.lang.Double codigoChamado;
  
  /**
   * @generated
   */
  private java.lang.Double agenSequencia;
  
  /**
   * Construtor
   * @generated
   */
  public VwApontamentosChamadosPK(){
  }
  
  /**
   * Obtém codigoChamado
   * return codigoChamado
   * @generated
   */
  public java.lang.Double getCodigoChamado(){
    return this.codigoChamado;
  }
  
  /**
   * Define codigoChamado
   * @param codigoChamado codigoChamado
   * @generated
   */
  public VwApontamentosChamadosPK setCodigoChamado(java.lang.Double codigoChamado){
    this.codigoChamado = codigoChamado;
    return this;
  }
  /**
   * Obtém agenSequencia
   * return agenSequencia
   * @generated
   */
  public java.lang.Double getAgenSequencia(){
    return this.agenSequencia;
  }
  
  /**
   * Define agenSequencia
   * @param agenSequencia agenSequencia
   * @generated
   */
  public VwApontamentosChamadosPK setAgenSequencia(java.lang.Double agenSequencia){
    this.agenSequencia = agenSequencia;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VwApontamentosChamadosPK object = (VwApontamentosChamadosPK)obj;
    if (codigoChamado != null ? !codigoChamado.equals(object.codigoChamado) : object.codigoChamado != null) return false;
    if (agenSequencia != null ? !agenSequencia.equals(object.agenSequencia) : object.agenSequencia != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((codigoChamado == null) ? 0 : codigoChamado.hashCode());
    result = 31 * result + ((agenSequencia == null) ? 0 : agenSequencia.hashCode());
    return result;
  }

}
