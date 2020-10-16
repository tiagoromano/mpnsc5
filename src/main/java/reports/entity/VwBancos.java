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
 * Classe que representa a tabela VW_BANCOS
 * @generated
 */
@Entity
@Table(name = "\"VW_BANCOS\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.VwBancos")
public class VwBancos implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID", nullable = false, insertable=true, updatable=true)
  private java.lang.Double id;

  /**
  * @generated
  */
  @Column(name = "ATIVO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String ativo;

  /**
  * @generated
  */
  @Column(name = "CODI_ILHA", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double bancosIlhas;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="CLIE_ID", nullable = false, referencedColumnName = "ID", insertable=true, updatable=true)
  
  private Clientes clientes;

  /**
  * @generated
  */
  @Column(name = "HOST", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String host;

  /**
  * @generated
  */
  @Column(name = "INSTANCIA", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String instancia;

  /**
  * @generated
  */
  @Column(name = "INSTANCIA_POLOSERVER", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double instanciaPoloserver;

  /**
  * @generated
  */
  @Column(name = "ITEM_CODIGO", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double itemCodigo;

  /**
  * @generated
  */
  @Column(name = "NOME", nullable = false, unique = false, length=50, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "NUM_MAX_SESSOES", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double numMaxSessoes;

  /**
  * @generated
  */
  @Column(name = "SERVER_NAME", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String serverName;

  /**
  * @generated
  */
  @Column(name = "STANDBY_ID", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double standbyId;

  /**
  * @generated
  */
  @Column(name = "STATUS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String status;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="TIPO_BANCO", nullable = false, referencedColumnName = "CD_TIPO_BANCO", insertable=true, updatable=true)
  
  private TiposBancos tiposBancos;

  /**
  * @generated
  */
  @Column(name = "VERSAO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String versao;

  /**
   * Construtor
   * @generated
   */
  public VwBancos(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.Double getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public VwBancos setId(java.lang.Double id){
    this.id = id;
    return this;
  }

  /**
   * Obtém ativo
   * return ativo
   * @generated
   */
  
  public java.lang.String getAtivo(){
    return this.ativo;
  }

  /**
   * Define ativo
   * @param ativo ativo
   * @generated
   */
  public VwBancos setAtivo(java.lang.String ativo){
    this.ativo = ativo;
    return this;
  }

  /**
   * Obtém bancosIlhas
   * return bancosIlhas
   * @generated
   */
  
  public java.lang.Double getBancosIlhas(){
    return this.bancosIlhas;
  }

  /**
   * Define bancosIlhas
   * @param bancosIlhas bancosIlhas
   * @generated
   */
  public VwBancos setBancosIlhas(java.lang.Double bancosIlhas){
    this.bancosIlhas = bancosIlhas;
    return this;
  }

  /**
   * Obtém clientes
   * return clientes
   * @generated
   */
  
  public Clientes getClientes(){
    return this.clientes;
  }

  /**
   * Define clientes
   * @param clientes clientes
   * @generated
   */
  public VwBancos setClientes(Clientes clientes){
    this.clientes = clientes;
    return this;
  }

  /**
   * Obtém host
   * return host
   * @generated
   */
  
  public java.lang.String getHost(){
    return this.host;
  }

  /**
   * Define host
   * @param host host
   * @generated
   */
  public VwBancos setHost(java.lang.String host){
    this.host = host;
    return this;
  }

  /**
   * Obtém instancia
   * return instancia
   * @generated
   */
  
  public java.lang.String getInstancia(){
    return this.instancia;
  }

  /**
   * Define instancia
   * @param instancia instancia
   * @generated
   */
  public VwBancos setInstancia(java.lang.String instancia){
    this.instancia = instancia;
    return this;
  }

  /**
   * Obtém instanciaPoloserver
   * return instanciaPoloserver
   * @generated
   */
  
  public java.lang.Double getInstanciaPoloserver(){
    return this.instanciaPoloserver;
  }

  /**
   * Define instanciaPoloserver
   * @param instanciaPoloserver instanciaPoloserver
   * @generated
   */
  public VwBancos setInstanciaPoloserver(java.lang.Double instanciaPoloserver){
    this.instanciaPoloserver = instanciaPoloserver;
    return this;
  }

  /**
   * Obtém itemCodigo
   * return itemCodigo
   * @generated
   */
  
  public java.lang.Double getItemCodigo(){
    return this.itemCodigo;
  }

  /**
   * Define itemCodigo
   * @param itemCodigo itemCodigo
   * @generated
   */
  public VwBancos setItemCodigo(java.lang.Double itemCodigo){
    this.itemCodigo = itemCodigo;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public VwBancos setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém numMaxSessoes
   * return numMaxSessoes
   * @generated
   */
  
  public java.lang.Double getNumMaxSessoes(){
    return this.numMaxSessoes;
  }

  /**
   * Define numMaxSessoes
   * @param numMaxSessoes numMaxSessoes
   * @generated
   */
  public VwBancos setNumMaxSessoes(java.lang.Double numMaxSessoes){
    this.numMaxSessoes = numMaxSessoes;
    return this;
  }

  /**
   * Obtém serverName
   * return serverName
   * @generated
   */
  
  public java.lang.String getServerName(){
    return this.serverName;
  }

  /**
   * Define serverName
   * @param serverName serverName
   * @generated
   */
  public VwBancos setServerName(java.lang.String serverName){
    this.serverName = serverName;
    return this;
  }

  /**
   * Obtém standbyId
   * return standbyId
   * @generated
   */
  
  public java.lang.Double getStandbyId(){
    return this.standbyId;
  }

  /**
   * Define standbyId
   * @param standbyId standbyId
   * @generated
   */
  public VwBancos setStandbyId(java.lang.Double standbyId){
    this.standbyId = standbyId;
    return this;
  }

  /**
   * Obtém status
   * return status
   * @generated
   */
  
  public java.lang.String getStatus(){
    return this.status;
  }

  /**
   * Define status
   * @param status status
   * @generated
   */
  public VwBancos setStatus(java.lang.String status){
    this.status = status;
    return this;
  }

  /**
   * Obtém tiposBancos
   * return tiposBancos
   * @generated
   */
  
  public TiposBancos getTiposBancos(){
    return this.tiposBancos;
  }

  /**
   * Define tiposBancos
   * @param tiposBancos tiposBancos
   * @generated
   */
  public VwBancos setTiposBancos(TiposBancos tiposBancos){
    this.tiposBancos = tiposBancos;
    return this;
  }

  /**
   * Obtém versao
   * return versao
   * @generated
   */
  
  public java.lang.String getVersao(){
    return this.versao;
  }

  /**
   * Define versao
   * @param versao versao
   * @generated
   */
  public VwBancos setVersao(java.lang.String versao){
    this.versao = versao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VwBancos object = (VwBancos)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
