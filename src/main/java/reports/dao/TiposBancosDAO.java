package reports.dao;

import reports.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("TiposBancosDAO")
@Transactional(transactionManager="reports-TransactionManager")
public interface TiposBancosDAO extends JpaRepository<TiposBancos, java.lang.Double> {

  /**
   * Obtém a instância de TiposBancos utilizando os identificadores
   * 
   * @param cdTipoBanco
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM TiposBancos entity WHERE entity.cdTipoBanco = :cdTipoBanco")
  public TiposBancos findOne(@Param(value="cdTipoBanco") java.lang.Double cdTipoBanco);

  /**
   * Remove a instância de TiposBancos utilizando os identificadores
   * 
   * @param cdTipoBanco
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM TiposBancos entity WHERE entity.cdTipoBanco = :cdTipoBanco")
  public void delete(@Param(value="cdTipoBanco") java.lang.Double cdTipoBanco);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM AlertasColeta entity WHERE entity.tiposBancos.cdTipoBanco = :cdTipoBanco")
  public Page<AlertasColeta> findAlertasColeta(@Param(value="cdTipoBanco") java.lang.Double cdTipoBanco, Pageable pageable);
    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM VwBancos entity WHERE entity.tiposBancos.cdTipoBanco = :cdTipoBanco AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<VwBancos> findVwBancosGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="cdTipoBanco") java.lang.Double cdTipoBanco, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM VwBancos entity WHERE entity.tiposBancos.cdTipoBanco = :cdTipoBanco AND (:id is null OR entity.id = :id) AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<VwBancos> findVwBancosSpecificSearch(@Param(value="cdTipoBanco") java.lang.Double cdTipoBanco, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM VwBancos entity WHERE entity.tiposBancos.cdTipoBanco = :cdTipoBanco")
  public Page<VwBancos> findVwBancos(@Param(value="cdTipoBanco") java.lang.Double cdTipoBanco, Pageable pageable);
  
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.clientes FROM VwBancos entity WHERE entity.tiposBancos.cdTipoBanco = :cdTipoBanco AND (entity.clientes.nome like concat('%',coalesce(:search,''),'%') OR entity.clientes.negocio like concat('%',coalesce(:search,''),'%') OR entity.clientes.sigla like concat('%',coalesce(:search,''),'%') OR entity.clientes.status like concat('%',coalesce(:search,''),'%'))")
  public Page<Clientes> listClientesGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="cdTipoBanco") java.lang.Double cdTipoBanco, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.clientes FROM VwBancos entity WHERE entity.tiposBancos.cdTipoBanco = :cdTipoBanco AND (:id is null OR entity.clientes.id = :id) AND (:nome is null OR entity.clientes.nome like concat('%',:nome,'%')) AND (:negocio is null OR entity.clientes.negocio like concat('%',:negocio,'%')) AND (:sigla is null OR entity.clientes.sigla like concat('%',:sigla,'%')) AND (:status is null OR entity.clientes.status like concat('%',:status,'%'))")
  public Page<Clientes> listClientesSpecificSearch(@Param(value="cdTipoBanco") java.lang.Double cdTipoBanco, @Param(value="nome") java.lang.String nome, @Param(value="negocio") java.lang.String negocio, @Param(value="sigla") java.lang.String sigla, @Param(value="status") java.lang.String status, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.clientes FROM VwBancos entity WHERE entity.tiposBancos.cdTipoBanco = :cdTipoBanco")
  public Page<Clientes> listClientes(@Param(value="cdTipoBanco") java.lang.Double cdTipoBanco, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM VwBancos entity WHERE entity.tiposBancos.cdTipoBanco = :instanceCdTipoBanco AND entity.clientes.id = :relationId")
  public int deleteClientes(@Param(value="instanceCdTipoBanco") java.lang.Double instanceCdTipoBanco, @Param(value="relationId") java.lang.Double relationId);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM TiposBancos entity WHERE entity.dsTipoBanco like concat('%',coalesce(:search,''),'%') OR entity.dsIconeBanco like concat('%',coalesce(:search,''),'%')")
  public Page<TiposBancos> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM TiposBancos entity WHERE (:cdTipoBanco is null OR entity.cdTipoBanco = :cdTipoBanco) AND (:dsTipoBanco is null OR entity.dsTipoBanco like concat('%',:dsTipoBanco,'%')) AND (:dsIconeBanco is null OR entity.dsIconeBanco like concat('%',:dsIconeBanco,'%'))")
  public Page<TiposBancos> specificSearch(@Param(value="cdTipoBanco") java.lang.Double cdTipoBanco, @Param(value="dsTipoBanco") java.lang.String dsTipoBanco, @Param(value="dsIconeBanco") java.lang.String dsIconeBanco, Pageable pageable);
  
}
