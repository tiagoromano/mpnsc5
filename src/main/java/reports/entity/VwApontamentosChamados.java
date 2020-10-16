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
 * Classe que representa a tabela VW_APONTAMENTOS_CHAMADOS
 * @generated
 */
@Entity
@IdClass(VwApontamentosChamadosPK.class)
@Table(name = "\"VW_APONTAMENTOS_CHAMADOS\"", schema="\"DBAREMOTO\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("reports.entity.VwApontamentosChamados")
public class VwApontamentosChamados implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "CODIGO_CHAMADO", nullable = true, length=7, insertable=true, updatable=true)
  private java.lang.Double codigoChamado;

  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY, generator="") 
  @Column(name = "AGEN_SEQUENCIA", nullable = true, insertable=true, updatable=true)
  private java.lang.Double agenSequencia;

  /**
  * @generated
  */
  @Column(name = "DESCRICAO", nullable = true, unique = false, length=1000, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
  * @generated
  */
  @Column(name = "ITEM_CODIGO", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.Double itemCodigo;

  /**
  * @generated
  */
  @Column(name = "PROF_APELIDO", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String profApelido;

  /**
  * @generated
  */
  @Column(name = "ATIVIDADE", nullable = true, unique = false, length=640, insertable=true, updatable=true)
  
  private java.lang.String atividade;

  /**
  * @generated
  */
  @Column(name = "SUGIRO_NAO_FATURAR", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.Double sugiroNaoFaturar;

  /**
  * @generated
  */
  @Column(name = "CECU_CODIGO", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cecuCodigo;

  /**
  * @generated
  */
  @Column(name = "COMPROMISSO", nullable = true, unique = false, length=4000, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String compromisso;

  /**
  * @generated
  */
  @Column(name = "LOCAL", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String local;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATA", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data;

  /**
  * @generated
  */
  @Column(name = "HORA_INICIO", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.String horaInicio;

  /**
  * @generated
  */
  @Column(name = "HORA_FINAL", nullable = true, unique = false, length=5, insertable=true, updatable=true)
  
  private java.lang.String horaFinal;

  /**
  * @generated
  */
  @Column(name = "CLIE_ID", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.String clieId;

  /**
  * @generated
  */
  @Column(name = "CLIE_NOME", nullable = true, unique = false, length=105, insertable=true, updatable=true)
  
  private java.lang.String clieNome;

  /**
  * @generated
  */
  @Column(name = "PROF_NUMERO", nullable = true, unique = false, length=4, insertable=true, updatable=true)
  
  private java.lang.Double profNumero;

  /**
  * @generated
  */
  @Column(name = "PROF_NOME", nullable = true, unique = false, length=45, insertable=true, updatable=true)
  
  private java.lang.String profNome;

  /**
  * @generated
  */
  @Column(name = "EMPR_NOME", nullable = true, unique = false, length=105, insertable=true, updatable=true)
  
  private java.lang.String emprNome;

  /**
  * @generated
  */
  @Column(name = "STATUS", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String status;

  /**
  * @generated
  */
  @Column(name = "DESC_STATUS", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String descStatus;

  /**
  * @generated
  */
  @Column(name = "SERVICO", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String servico;

  /**
  * @generated
  */
  @Column(name = "DESC_SERVICO", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String descServico;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DATAHORA_ABERTURA", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date datahoraAbertura;

  /**
   * Construtor
   * @generated
   */
  public VwApontamentosChamados(){
  }


  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  
  public java.lang.String getDescricao(){
    return this.descricao;
  }

  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public VwApontamentosChamados setDescricao(java.lang.String descricao){
    this.descricao = descricao;
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
  public VwApontamentosChamados setItemCodigo(java.lang.Double itemCodigo){
    this.itemCodigo = itemCodigo;
    return this;
  }

  /**
   * Obtém profApelido
   * return profApelido
   * @generated
   */
  
  public java.lang.String getProfApelido(){
    return this.profApelido;
  }

  /**
   * Define profApelido
   * @param profApelido profApelido
   * @generated
   */
  public VwApontamentosChamados setProfApelido(java.lang.String profApelido){
    this.profApelido = profApelido;
    return this;
  }

  /**
   * Obtém atividade
   * return atividade
   * @generated
   */
  
  public java.lang.String getAtividade(){
    return this.atividade;
  }

  /**
   * Define atividade
   * @param atividade atividade
   * @generated
   */
  public VwApontamentosChamados setAtividade(java.lang.String atividade){
    this.atividade = atividade;
    return this;
  }

  /**
   * Obtém sugiroNaoFaturar
   * return sugiroNaoFaturar
   * @generated
   */
  
  public java.lang.Double getSugiroNaoFaturar(){
    return this.sugiroNaoFaturar;
  }

  /**
   * Define sugiroNaoFaturar
   * @param sugiroNaoFaturar sugiroNaoFaturar
   * @generated
   */
  public VwApontamentosChamados setSugiroNaoFaturar(java.lang.Double sugiroNaoFaturar){
    this.sugiroNaoFaturar = sugiroNaoFaturar;
    return this;
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
  public VwApontamentosChamados setCodigoChamado(java.lang.Double codigoChamado){
    this.codigoChamado = codigoChamado;
    return this;
  }

  /**
   * Obtém cecuCodigo
   * return cecuCodigo
   * @generated
   */
  
  public java.lang.String getCecuCodigo(){
    return this.cecuCodigo;
  }

  /**
   * Define cecuCodigo
   * @param cecuCodigo cecuCodigo
   * @generated
   */
  public VwApontamentosChamados setCecuCodigo(java.lang.String cecuCodigo){
    this.cecuCodigo = cecuCodigo;
    return this;
  }

  /**
   * Obtém compromisso
   * return compromisso
   * @generated
   */
  
  public java.lang.String getCompromisso(){
    return this.compromisso;
  }

  /**
   * Define compromisso
   * @param compromisso compromisso
   * @generated
   */
  public VwApontamentosChamados setCompromisso(java.lang.String compromisso){
    this.compromisso = compromisso;
    return this;
  }

  /**
   * Obtém local
   * return local
   * @generated
   */
  
  public java.lang.String getLocal(){
    return this.local;
  }

  /**
   * Define local
   * @param local local
   * @generated
   */
  public VwApontamentosChamados setLocal(java.lang.String local){
    this.local = local;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public VwApontamentosChamados setData(java.util.Date data){
    this.data = data;
    return this;
  }

  /**
   * Obtém horaInicio
   * return horaInicio
   * @generated
   */
  
  public java.lang.String getHoraInicio(){
    return this.horaInicio;
  }

  /**
   * Define horaInicio
   * @param horaInicio horaInicio
   * @generated
   */
  public VwApontamentosChamados setHoraInicio(java.lang.String horaInicio){
    this.horaInicio = horaInicio;
    return this;
  }

  /**
   * Obtém horaFinal
   * return horaFinal
   * @generated
   */
  
  public java.lang.String getHoraFinal(){
    return this.horaFinal;
  }

  /**
   * Define horaFinal
   * @param horaFinal horaFinal
   * @generated
   */
  public VwApontamentosChamados setHoraFinal(java.lang.String horaFinal){
    this.horaFinal = horaFinal;
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
  public VwApontamentosChamados setAgenSequencia(java.lang.Double agenSequencia){
    this.agenSequencia = agenSequencia;
    return this;
  }

  /**
   * Obtém clieId
   * return clieId
   * @generated
   */
  
  public java.lang.String getClieId(){
    return this.clieId;
  }

  /**
   * Define clieId
   * @param clieId clieId
   * @generated
   */
  public VwApontamentosChamados setClieId(java.lang.String clieId){
    this.clieId = clieId;
    return this;
  }

  /**
   * Obtém clieNome
   * return clieNome
   * @generated
   */
  
  public java.lang.String getClieNome(){
    return this.clieNome;
  }

  /**
   * Define clieNome
   * @param clieNome clieNome
   * @generated
   */
  public VwApontamentosChamados setClieNome(java.lang.String clieNome){
    this.clieNome = clieNome;
    return this;
  }

  /**
   * Obtém profNumero
   * return profNumero
   * @generated
   */
  
  public java.lang.Double getProfNumero(){
    return this.profNumero;
  }

  /**
   * Define profNumero
   * @param profNumero profNumero
   * @generated
   */
  public VwApontamentosChamados setProfNumero(java.lang.Double profNumero){
    this.profNumero = profNumero;
    return this;
  }

  /**
   * Obtém profNome
   * return profNome
   * @generated
   */
  
  public java.lang.String getProfNome(){
    return this.profNome;
  }

  /**
   * Define profNome
   * @param profNome profNome
   * @generated
   */
  public VwApontamentosChamados setProfNome(java.lang.String profNome){
    this.profNome = profNome;
    return this;
  }

  /**
   * Obtém emprNome
   * return emprNome
   * @generated
   */
  
  public java.lang.String getEmprNome(){
    return this.emprNome;
  }

  /**
   * Define emprNome
   * @param emprNome emprNome
   * @generated
   */
  public VwApontamentosChamados setEmprNome(java.lang.String emprNome){
    this.emprNome = emprNome;
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
  public VwApontamentosChamados setStatus(java.lang.String status){
    this.status = status;
    return this;
  }

  /**
   * Obtém descStatus
   * return descStatus
   * @generated
   */
  
  public java.lang.String getDescStatus(){
    return this.descStatus;
  }

  /**
   * Define descStatus
   * @param descStatus descStatus
   * @generated
   */
  public VwApontamentosChamados setDescStatus(java.lang.String descStatus){
    this.descStatus = descStatus;
    return this;
  }

  /**
   * Obtém servico
   * return servico
   * @generated
   */
  
  public java.lang.String getServico(){
    return this.servico;
  }

  /**
   * Define servico
   * @param servico servico
   * @generated
   */
  public VwApontamentosChamados setServico(java.lang.String servico){
    this.servico = servico;
    return this;
  }

  /**
   * Obtém descServico
   * return descServico
   * @generated
   */
  
  public java.lang.String getDescServico(){
    return this.descServico;
  }

  /**
   * Define descServico
   * @param descServico descServico
   * @generated
   */
  public VwApontamentosChamados setDescServico(java.lang.String descServico){
    this.descServico = descServico;
    return this;
  }

  /**
   * Obtém datahoraAbertura
   * return datahoraAbertura
   * @generated
   */
  
  public java.util.Date getDatahoraAbertura(){
    return this.datahoraAbertura;
  }

  /**
   * Define datahoraAbertura
   * @param datahoraAbertura datahoraAbertura
   * @generated
   */
  public VwApontamentosChamados setDatahoraAbertura(java.util.Date datahoraAbertura){
    this.datahoraAbertura = datahoraAbertura;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    VwApontamentosChamados object = (VwApontamentosChamados)obj;
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
