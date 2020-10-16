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
@Repository("ClientesDAO")
@Transactional(transactionManager="reports-TransactionManager")
public interface ClientesDAO extends JpaRepository<Clientes, java.lang.Double> {

  /**
   * Obtém a instância de Clientes utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Clientes entity WHERE entity.id = :id")
  public Clientes findOne(@Param(value="id") java.lang.Double id);

  /**
   * Remove a instância de Clientes utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Clientes entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Double id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM VwBancos entity WHERE entity.clientes.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<VwBancos> findVwBancosGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.Double id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM VwBancos entity WHERE entity.clientes.id = :id AND (:id is null OR entity.id = :id) AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<VwBancos> findVwBancosSpecificSearch(@Param(value="id") java.lang.Double id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM VwBancos entity WHERE entity.clientes.id = :id")
  public Page<VwBancos> findVwBancos(@Param(value="id") java.lang.Double id, Pageable pageable);
  
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.tiposBancos FROM VwBancos entity WHERE entity.clientes.id = :id AND (entity.tiposBancos.dsTipoBanco like concat('%',coalesce(:search,''),'%') OR entity.tiposBancos.dsIconeBanco like concat('%',coalesce(:search,''),'%'))")
  public Page<TiposBancos> listTiposBancosGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.Double id, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.tiposBancos FROM VwBancos entity WHERE entity.clientes.id = :id AND (:cdTipoBanco is null OR entity.tiposBancos.cdTipoBanco = :cdTipoBanco) AND (:dsTipoBanco is null OR entity.tiposBancos.dsTipoBanco like concat('%',:dsTipoBanco,'%')) AND (:dsIconeBanco is null OR entity.tiposBancos.dsIconeBanco like concat('%',:dsIconeBanco,'%'))")
  public Page<TiposBancos> listTiposBancosSpecificSearch(@Param(value="id") java.lang.Double id, @Param(value="dsTipoBanco") java.lang.String dsTipoBanco, @Param(value="dsIconeBanco") java.lang.String dsIconeBanco, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.tiposBancos FROM VwBancos entity WHERE entity.clientes.id = :id")
  public Page<TiposBancos> listTiposBancos(@Param(value="id") java.lang.Double id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM VwBancos entity WHERE entity.clientes.id = :instanceId AND entity.tiposBancos.cdTipoBanco = :relationCdTipoBanco")
  public int deleteTiposBancos(@Param(value="instanceId") java.lang.Double instanceId, @Param(value="relationCdTipoBanco") java.lang.Double relationCdTipoBanco);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Clientes entity WHERE entity.nome like concat('%',coalesce(:search,''),'%') OR entity.negocio like concat('%',coalesce(:search,''),'%') OR entity.sigla like concat('%',coalesce(:search,''),'%') OR entity.status like concat('%',coalesce(:search,''),'%')")
  public Page<Clientes> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Clientes entity WHERE (:id is null OR entity.id = :id) AND (:nome is null OR entity.nome like concat('%',:nome,'%')) AND (:negocio is null OR entity.negocio like concat('%',:negocio,'%')) AND (:sigla is null OR entity.sigla like concat('%',:sigla,'%')) AND (:status is null OR entity.status like concat('%',:status,'%'))")
  public Page<Clientes> specificSearch(@Param(value="id") java.lang.Double id, @Param(value="nome") java.lang.String nome, @Param(value="negocio") java.lang.String negocio, @Param(value="sigla") java.lang.String sigla, @Param(value="status") java.lang.String status, Pageable pageable);
  
}
