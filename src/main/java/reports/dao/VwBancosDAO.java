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
@Repository("VwBancosDAO")
@Transactional(transactionManager="reports-TransactionManager")
public interface VwBancosDAO extends JpaRepository<VwBancos, java.lang.Double> {

  /**
   * Obtém a instância de VwBancos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM VwBancos entity WHERE entity.id = :id")
  public VwBancos findOne(@Param(value="id") java.lang.Double id);

  /**
   * Remove a instância de VwBancos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM VwBancos entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Double id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM VwBancos entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<VwBancos> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM VwBancos entity WHERE (:id is null OR entity.id = :id) AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<VwBancos> specificSearch(@Param(value="id") java.lang.Double id, @Param(value="nome") java.lang.String nome, Pageable pageable);
  
  /**
   * Foreign Key clientes
   * @generated
   */
  @Query("SELECT entity FROM VwBancos entity WHERE entity.clientes.id = :id")
  public Page<VwBancos> findVwBancossByClientes(@Param(value="id") java.lang.Double id, Pageable pageable);

  /**
   * Foreign Key tiposBancos
   * @generated
   */
  @Query("SELECT entity FROM VwBancos entity WHERE entity.tiposBancos.cdTipoBanco = :cdTipoBanco")
  public Page<VwBancos> findVwBancossByTiposBancos(@Param(value="cdTipoBanco") java.lang.Double cdTipoBanco, Pageable pageable);

}
