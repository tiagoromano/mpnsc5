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
@Repository("VxOrclArchivedLogHourDAO")
@Transactional(transactionManager="reports-TransactionManager")
public interface VxOrclArchivedLogHourDAO extends JpaRepository<VxOrclArchivedLogHour, VxOrclArchivedLogHourPK> {

  /**
   * Obtém a instância de VxOrclArchivedLogHour utilizando os identificadores
   * 
   * @param bancId
   *          Identificador 
   * @param dataArchiveLog
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM VxOrclArchivedLogHour entity WHERE entity.bancId = :bancId AND entity.dataArchiveLog = :dataArchiveLog")
  public VxOrclArchivedLogHour findOne(@Param(value="bancId") java.lang.Double bancId, @Param(value="dataArchiveLog") java.util.Date dataArchiveLog);

  /**
   * Remove a instância de VxOrclArchivedLogHour utilizando os identificadores
   * 
   * @param bancId
   *          Identificador 
   * @param dataArchiveLog
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM VxOrclArchivedLogHour entity WHERE entity.bancId = :bancId AND entity.dataArchiveLog = :dataArchiveLog")
  public void delete(@Param(value="bancId") java.lang.Double bancId, @Param(value="dataArchiveLog") java.util.Date dataArchiveLog);



    
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM VxOrclArchivedLogHour entity WHERE :search = :search")
  public Page<VxOrclArchivedLogHour> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM VxOrclArchivedLogHour entity WHERE (:bancId is null OR entity.bancId = :bancId) AND (:d00 is null OR entity.d00 = :d00)")
  public Page<VxOrclArchivedLogHour> specificSearch(@Param(value="bancId") java.lang.Double bancId, @Param(value="d00") java.lang.Double d00, Pageable pageable);
  
}
