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
@Repository("BancosStatusSessoesDAO")
@Transactional(transactionManager="reports-TransactionManager")
public interface BancosStatusSessoesDAO extends JpaRepository<BancosStatusSessoes, BancosStatusSessoesPK> {

  /**
   * Obtém a instância de BancosStatusSessoes utilizando os identificadores
   * 
   * @param bancId
   *          Identificador 
   * @param dataGeracao
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM BancosStatusSessoes entity WHERE entity.bancId = :bancId AND entity.dataGeracao = :dataGeracao")
  public BancosStatusSessoes findOne(@Param(value="bancId") java.lang.Double bancId, @Param(value="dataGeracao") java.util.Date dataGeracao);

  /**
   * Remove a instância de BancosStatusSessoes utilizando os identificadores
   * 
   * @param bancId
   *          Identificador 
   * @param dataGeracao
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM BancosStatusSessoes entity WHERE entity.bancId = :bancId AND entity.dataGeracao = :dataGeracao")
  public void delete(@Param(value="bancId") java.lang.Double bancId, @Param(value="dataGeracao") java.util.Date dataGeracao);



    
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM BancosStatusSessoes entity WHERE :search = :search")
  public Page<BancosStatusSessoes> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM BancosStatusSessoes entity WHERE (:bancId is null OR entity.bancId = :bancId) AND (:dataGeracao is null OR entity.dataGeracao = :dataGeracao)")
  public Page<BancosStatusSessoes> specificSearch(@Param(value="bancId") java.lang.Double bancId, @Param(value="dataGeracao") java.util.Date dataGeracao, Pageable pageable);
  
}
