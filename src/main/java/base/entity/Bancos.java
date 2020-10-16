package base.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela BANCOS
 * @generated
 */
@Entity
@Table(name = "\"BANCOS\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("base.entity.Bancos")
public class Bancos implements Serializable {

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
  @Column(name = "ACESSO_ALERT", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double acessoAlert;

  /**
  * @generated
  */
  @Column(name = "ACESSO_BACKUP", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double acessoBackup;

  /**
  * @generated
  */
  @Column(name = "ACESSO_PARTICAO", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double acessoParticao;

  /**
  * @generated
  */
  @Column(name = "ATIVO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String ativo;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="CODI_ILHA", nullable = false, referencedColumnName = "CODI_ILHA", insertable=true, updatable=true)
  
  private BancosIlhas bancosIlhas;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="CLIE_ID", nullable = false, referencedColumnName = "ID", insertable=true, updatable=true)
  
  private Clientes clientes;

  /**
  * @generated
  */
  @Column(name = "CODI_CLUSTER", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double codiCluster;

  /**
  * @generated
  */
  @Column(name = "COLETA_COMPLETA", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double coletaCompleta;

  /**
  * @generated
  */
  @Column(name = "CONTRATO_ID", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double contratoId;

  /**
  * @generated
  */
  @Column(name = "ERRO_PARTICAO", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String erroParticao;

  /**
  * @generated
  */
  @Column(name = "FREQUENCIA", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double frequencia;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "HORA_ULT_COLETA", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date horaUltColeta;

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
  @Column(name = "INTERVENCAO", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double intervencao;

  /**
  * @generated
  */
  @Column(name = "IP", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String ip;

  /**
  * @generated
  */
  @Column(name = "ITEM_CODIGO", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double itemCodigo;

  /**
  * @generated
  */
  @Column(name = "LOGIN", nullable = true, unique = false, length=30, insertable=true, updatable=true)
  
  private java.lang.String login;

  /**
  * @generated
  */
  @Column(name = "MONITORNAME", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String monitorname;

  /**
  * @generated
  */
  @Column(name = "NOME", nullable = false, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "NUM_DELTA_ARCH", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double numDeltaArch;

  /**
  * @generated
  */
  @Column(name = "NUM_ERROS", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double numErros;

  /**
  * @generated
  */
  @Column(name = "NUM_MAX_SESSOES", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double numMaxSessoes;

  /**
  * @generated
  */
  @Column(name = "NUM_SEQ_ARCH", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double numSeqArch;

  /**
  * @generated
  */
  @Column(name = "NUMERO_MAXIMO_ERROS", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double numeroMaximoErros;

  /**
  * @generated
  */
  @Column(name = "OCI", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String oci;

  /**
  * @generated
  */
  @Column(name = "PORT", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.String port;

  /**
  * @generated
  */
  @Column(name = "RAC_ID", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double racId;

  /**
  * @generated
  */
  @Column(name = "SENHA", nullable = true, unique = false, length=30, insertable=true, updatable=true)
  
  private java.lang.String senha;

  /**
  * @generated
  */
  @Column(name = "SERVER_NAME", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String serverName;

  /**
  * @generated
  */
  @Column(name = "SERVICE_NAME", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String serviceName;

  /**
  * @generated
  */
  @Column(name = "STANDBY_ID", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double standbyId;

  /**
  * @generated
  */
  @Column(name = "STARTUP_TIME", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String startupTime;

  /**
  * @generated
  */
  @Column(name = "STATUS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String status;

  /**
  * @generated
  */
  @Column(name = "STATUS_MONITORIA", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double statusMonitoria;

  /**
  * @generated
  */
  @Column(name = "TIPO_ATENDIMENTO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double tipoAtendimento;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="TIPO_BANCO", nullable = false, referencedColumnName = "CD_TIPO_BANCO", insertable=true, updatable=true)
  
  private TiposBancos tiposBancos;

  /**
  * @generated
  */
  @Column(name = "TZ_DELAY", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double tzDelay;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "ULT_ACESSO_ALERT", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date ultAcessoAlert;

  /**
  * @generated
  */
  @Column(name = "VERSAO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String versao;

  /**
   * Construtor
   * @generated
   */
  public Bancos(){
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
  public Bancos setId(java.lang.Double id){
    this.id = id;
    return this;
  }

  /**
   * Obtém acessoAlert
   * return acessoAlert
   * @generated
   */
  
  public java.lang.Double getAcessoAlert(){
    return this.acessoAlert;
  }

  /**
   * Define acessoAlert
   * @param acessoAlert acessoAlert
   * @generated
   */
  public Bancos setAcessoAlert(java.lang.Double acessoAlert){
    this.acessoAlert = acessoAlert;
    return this;
  }

  /**
   * Obtém acessoBackup
   * return acessoBackup
   * @generated
   */
  
  public java.lang.Double getAcessoBackup(){
    return this.acessoBackup;
  }

  /**
   * Define acessoBackup
   * @param acessoBackup acessoBackup
   * @generated
   */
  public Bancos setAcessoBackup(java.lang.Double acessoBackup){
    this.acessoBackup = acessoBackup;
    return this;
  }

  /**
   * Obtém acessoParticao
   * return acessoParticao
   * @generated
   */
  
  public java.lang.Double getAcessoParticao(){
    return this.acessoParticao;
  }

  /**
   * Define acessoParticao
   * @param acessoParticao acessoParticao
   * @generated
   */
  public Bancos setAcessoParticao(java.lang.Double acessoParticao){
    this.acessoParticao = acessoParticao;
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
  public Bancos setAtivo(java.lang.String ativo){
    this.ativo = ativo;
    return this;
  }

  /**
   * Obtém bancosIlhas
   * return bancosIlhas
   * @generated
   */
  
  public BancosIlhas getBancosIlhas(){
    return this.bancosIlhas;
  }

  /**
   * Define bancosIlhas
   * @param bancosIlhas bancosIlhas
   * @generated
   */
  public Bancos setBancosIlhas(BancosIlhas bancosIlhas){
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
  public Bancos setClientes(Clientes clientes){
    this.clientes = clientes;
    return this;
  }

  /**
   * Obtém codiCluster
   * return codiCluster
   * @generated
   */
  
  public java.lang.Double getCodiCluster(){
    return this.codiCluster;
  }

  /**
   * Define codiCluster
   * @param codiCluster codiCluster
   * @generated
   */
  public Bancos setCodiCluster(java.lang.Double codiCluster){
    this.codiCluster = codiCluster;
    return this;
  }

  /**
   * Obtém coletaCompleta
   * return coletaCompleta
   * @generated
   */
  
  public java.lang.Double getColetaCompleta(){
    return this.coletaCompleta;
  }

  /**
   * Define coletaCompleta
   * @param coletaCompleta coletaCompleta
   * @generated
   */
  public Bancos setColetaCompleta(java.lang.Double coletaCompleta){
    this.coletaCompleta = coletaCompleta;
    return this;
  }

  /**
   * Obtém contratoId
   * return contratoId
   * @generated
   */
  
  public java.lang.Double getContratoId(){
    return this.contratoId;
  }

  /**
   * Define contratoId
   * @param contratoId contratoId
   * @generated
   */
  public Bancos setContratoId(java.lang.Double contratoId){
    this.contratoId = contratoId;
    return this;
  }

  /**
   * Obtém erroParticao
   * return erroParticao
   * @generated
   */
  
  public java.lang.String getErroParticao(){
    return this.erroParticao;
  }

  /**
   * Define erroParticao
   * @param erroParticao erroParticao
   * @generated
   */
  public Bancos setErroParticao(java.lang.String erroParticao){
    this.erroParticao = erroParticao;
    return this;
  }

  /**
   * Obtém frequencia
   * return frequencia
   * @generated
   */
  
  public java.lang.Double getFrequencia(){
    return this.frequencia;
  }

  /**
   * Define frequencia
   * @param frequencia frequencia
   * @generated
   */
  public Bancos setFrequencia(java.lang.Double frequencia){
    this.frequencia = frequencia;
    return this;
  }

  /**
   * Obtém horaUltColeta
   * return horaUltColeta
   * @generated
   */
  
  public java.util.Date getHoraUltColeta(){
    return this.horaUltColeta;
  }

  /**
   * Define horaUltColeta
   * @param horaUltColeta horaUltColeta
   * @generated
   */
  public Bancos setHoraUltColeta(java.util.Date horaUltColeta){
    this.horaUltColeta = horaUltColeta;
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
  public Bancos setHost(java.lang.String host){
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
  public Bancos setInstancia(java.lang.String instancia){
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
  public Bancos setInstanciaPoloserver(java.lang.Double instanciaPoloserver){
    this.instanciaPoloserver = instanciaPoloserver;
    return this;
  }

  /**
   * Obtém intervencao
   * return intervencao
   * @generated
   */
  
  public java.lang.Double getIntervencao(){
    return this.intervencao;
  }

  /**
   * Define intervencao
   * @param intervencao intervencao
   * @generated
   */
  public Bancos setIntervencao(java.lang.Double intervencao){
    this.intervencao = intervencao;
    return this;
  }

  /**
   * Obtém ip
   * return ip
   * @generated
   */
  
  public java.lang.String getIp(){
    return this.ip;
  }

  /**
   * Define ip
   * @param ip ip
   * @generated
   */
  public Bancos setIp(java.lang.String ip){
    this.ip = ip;
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
  public Bancos setItemCodigo(java.lang.Double itemCodigo){
    this.itemCodigo = itemCodigo;
    return this;
  }

  /**
   * Obtém login
   * return login
   * @generated
   */
  
  public java.lang.String getLogin(){
    return this.login;
  }

  /**
   * Define login
   * @param login login
   * @generated
   */
  public Bancos setLogin(java.lang.String login){
    this.login = login;
    return this;
  }

  /**
   * Obtém monitorname
   * return monitorname
   * @generated
   */
  
  public java.lang.String getMonitorname(){
    return this.monitorname;
  }

  /**
   * Define monitorname
   * @param monitorname monitorname
   * @generated
   */
  public Bancos setMonitorname(java.lang.String monitorname){
    this.monitorname = monitorname;
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
  public Bancos setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém numDeltaArch
   * return numDeltaArch
   * @generated
   */
  
  public java.lang.Double getNumDeltaArch(){
    return this.numDeltaArch;
  }

  /**
   * Define numDeltaArch
   * @param numDeltaArch numDeltaArch
   * @generated
   */
  public Bancos setNumDeltaArch(java.lang.Double numDeltaArch){
    this.numDeltaArch = numDeltaArch;
    return this;
  }

  /**
   * Obtém numErros
   * return numErros
   * @generated
   */
  
  public java.lang.Double getNumErros(){
    return this.numErros;
  }

  /**
   * Define numErros
   * @param numErros numErros
   * @generated
   */
  public Bancos setNumErros(java.lang.Double numErros){
    this.numErros = numErros;
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
  public Bancos setNumMaxSessoes(java.lang.Double numMaxSessoes){
    this.numMaxSessoes = numMaxSessoes;
    return this;
  }

  /**
   * Obtém numSeqArch
   * return numSeqArch
   * @generated
   */
  
  public java.lang.Double getNumSeqArch(){
    return this.numSeqArch;
  }

  /**
   * Define numSeqArch
   * @param numSeqArch numSeqArch
   * @generated
   */
  public Bancos setNumSeqArch(java.lang.Double numSeqArch){
    this.numSeqArch = numSeqArch;
    return this;
  }

  /**
   * Obtém numeroMaximoErros
   * return numeroMaximoErros
   * @generated
   */
  
  public java.lang.Double getNumeroMaximoErros(){
    return this.numeroMaximoErros;
  }

  /**
   * Define numeroMaximoErros
   * @param numeroMaximoErros numeroMaximoErros
   * @generated
   */
  public Bancos setNumeroMaximoErros(java.lang.Double numeroMaximoErros){
    this.numeroMaximoErros = numeroMaximoErros;
    return this;
  }

  /**
   * Obtém oci
   * return oci
   * @generated
   */
  
  public java.lang.String getOci(){
    return this.oci;
  }

  /**
   * Define oci
   * @param oci oci
   * @generated
   */
  public Bancos setOci(java.lang.String oci){
    this.oci = oci;
    return this;
  }

  /**
   * Obtém port
   * return port
   * @generated
   */
  
  public java.lang.String getPort(){
    return this.port;
  }

  /**
   * Define port
   * @param port port
   * @generated
   */
  public Bancos setPort(java.lang.String port){
    this.port = port;
    return this;
  }

  /**
   * Obtém racId
   * return racId
   * @generated
   */
  
  public java.lang.Double getRacId(){
    return this.racId;
  }

  /**
   * Define racId
   * @param racId racId
   * @generated
   */
  public Bancos setRacId(java.lang.Double racId){
    this.racId = racId;
    return this;
  }

  /**
   * Obtém senha
   * return senha
   * @generated
   */
  
  public java.lang.String getSenha(){
    return this.senha;
  }

  /**
   * Define senha
   * @param senha senha
   * @generated
   */
  public Bancos setSenha(java.lang.String senha){
    this.senha = senha;
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
  public Bancos setServerName(java.lang.String serverName){
    this.serverName = serverName;
    return this;
  }

  /**
   * Obtém serviceName
   * return serviceName
   * @generated
   */
  
  public java.lang.String getServiceName(){
    return this.serviceName;
  }

  /**
   * Define serviceName
   * @param serviceName serviceName
   * @generated
   */
  public Bancos setServiceName(java.lang.String serviceName){
    this.serviceName = serviceName;
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
  public Bancos setStandbyId(java.lang.Double standbyId){
    this.standbyId = standbyId;
    return this;
  }

  /**
   * Obtém startupTime
   * return startupTime
   * @generated
   */
  
  public java.lang.String getStartupTime(){
    return this.startupTime;
  }

  /**
   * Define startupTime
   * @param startupTime startupTime
   * @generated
   */
  public Bancos setStartupTime(java.lang.String startupTime){
    this.startupTime = startupTime;
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
  public Bancos setStatus(java.lang.String status){
    this.status = status;
    return this;
  }

  /**
   * Obtém statusMonitoria
   * return statusMonitoria
   * @generated
   */
  
  public java.lang.Double getStatusMonitoria(){
    return this.statusMonitoria;
  }

  /**
   * Define statusMonitoria
   * @param statusMonitoria statusMonitoria
   * @generated
   */
  public Bancos setStatusMonitoria(java.lang.Double statusMonitoria){
    this.statusMonitoria = statusMonitoria;
    return this;
  }

  /**
   * Obtém tipoAtendimento
   * return tipoAtendimento
   * @generated
   */
  
  public java.lang.Double getTipoAtendimento(){
    return this.tipoAtendimento;
  }

  /**
   * Define tipoAtendimento
   * @param tipoAtendimento tipoAtendimento
   * @generated
   */
  public Bancos setTipoAtendimento(java.lang.Double tipoAtendimento){
    this.tipoAtendimento = tipoAtendimento;
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
  public Bancos setTiposBancos(TiposBancos tiposBancos){
    this.tiposBancos = tiposBancos;
    return this;
  }

  /**
   * Obtém tzDelay
   * return tzDelay
   * @generated
   */
  
  public java.lang.Double getTzDelay(){
    return this.tzDelay;
  }

  /**
   * Define tzDelay
   * @param tzDelay tzDelay
   * @generated
   */
  public Bancos setTzDelay(java.lang.Double tzDelay){
    this.tzDelay = tzDelay;
    return this;
  }

  /**
   * Obtém ultAcessoAlert
   * return ultAcessoAlert
   * @generated
   */
  
  public java.util.Date getUltAcessoAlert(){
    return this.ultAcessoAlert;
  }

  /**
   * Define ultAcessoAlert
   * @param ultAcessoAlert ultAcessoAlert
   * @generated
   */
  public Bancos setUltAcessoAlert(java.util.Date ultAcessoAlert){
    this.ultAcessoAlert = ultAcessoAlert;
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
  public Bancos setVersao(java.lang.String versao){
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
    Bancos object = (Bancos)obj;
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
