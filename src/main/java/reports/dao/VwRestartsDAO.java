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
@Repository("VwRestartsDAO")
@Transactional(transactionManager="reports-TransactionManager")
public interface VwRestartsDAO extends JpaRepository<VwRestarts, java.lang.Double> {

  /**
   * Obtém a instância de VwRestarts utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM VwRestarts entity WHERE entity.id = :id")
  public VwRestarts findOne(@Param(value="id") java.lang.Double id);

  /**
   * Remove a instância de VwRestarts utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM VwRestarts entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Double id);



    
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM VwRestarts entity WHERE :search = :search")
  public Page<VwRestarts> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM VwRestarts entity WHERE (:bancId is null OR entity.bancId = :bancId)")
  public Page<VwRestarts> specificSearch(@Param(value="bancId") java.lang.Double bancId, Pageable pageable);
  
}
