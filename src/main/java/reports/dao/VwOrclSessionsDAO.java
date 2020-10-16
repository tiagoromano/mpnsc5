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
@Repository("VwOrclSessionsDAO")
@Transactional(transactionManager="reports-TransactionManager")
public interface VwOrclSessionsDAO extends JpaRepository<VwOrclSessions, VwOrclSessionsPK> {

  /**
   * Obtém a instância de VwOrclSessions utilizando os identificadores
   * 
   * @param bancId
   *          Identificador 
   * @param dataGeracao
   *          Identificador 
   * @param dataHora
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM VwOrclSessions entity WHERE entity.bancId = :bancId AND entity.dataGeracao = :dataGeracao AND entity.dataHora = :dataHora")
  public VwOrclSessions findOne(@Param(value="bancId") java.lang.Double bancId, @Param(value="dataGeracao") java.util.Date dataGeracao, @Param(value="dataHora") java.lang.String dataHora);

  /**
   * Remove a instância de VwOrclSessions utilizando os identificadores
   * 
   * @param bancId
   *          Identificador 
   * @param dataGeracao
   *          Identificador 
   * @param dataHora
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM VwOrclSessions entity WHERE entity.bancId = :bancId AND entity.dataGeracao = :dataGeracao AND entity.dataHora = :dataHora")
  public void delete(@Param(value="bancId") java.lang.Double bancId, @Param(value="dataGeracao") java.util.Date dataGeracao, @Param(value="dataHora") java.lang.String dataHora);



    
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM VwOrclSessions entity WHERE :search = :search")
  public Page<VwOrclSessions> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM VwOrclSessions entity WHERE (:bancId is null OR entity.bancId = :bancId)")
  public Page<VwOrclSessions> specificSearch(@Param(value="bancId") java.lang.Double bancId, Pageable pageable);
  
}
