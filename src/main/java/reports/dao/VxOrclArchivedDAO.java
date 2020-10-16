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
@Repository("VxOrclArchivedDAO")
@Transactional(transactionManager="reports-TransactionManager")
public interface VxOrclArchivedDAO extends JpaRepository<VxOrclArchived, VxOrclArchivedPK> {

  /**
   * Obtém a instância de VxOrclArchived utilizando os identificadores
   * 
   * @param bancId
   *          Identificador 
   * @param dataInicio
   *          Identificador 
   * @param horaLog
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM VxOrclArchived entity WHERE entity.bancId = :bancId AND entity.dataInicio = :dataInicio AND entity.horaLog = :horaLog")
  public VxOrclArchived findOne(@Param(value="bancId") java.lang.Double bancId, @Param(value="dataInicio") java.util.Date dataInicio, @Param(value="horaLog") java.lang.String horaLog);

  /**
   * Remove a instância de VxOrclArchived utilizando os identificadores
   * 
   * @param bancId
   *          Identificador 
   * @param dataInicio
   *          Identificador 
   * @param horaLog
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM VxOrclArchived entity WHERE entity.bancId = :bancId AND entity.dataInicio = :dataInicio AND entity.horaLog = :horaLog")
  public void delete(@Param(value="bancId") java.lang.Double bancId, @Param(value="dataInicio") java.util.Date dataInicio, @Param(value="horaLog") java.lang.String horaLog);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM VxOrclArchived entity WHERE entity.horaLog like concat('%',coalesce(:search,''),'%')")
  public Page<VxOrclArchived> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM VxOrclArchived entity WHERE (:bancId is null OR entity.bancId = :bancId) AND (:horaLog is null OR entity.horaLog like concat('%',:horaLog,'%'))")
  public Page<VxOrclArchived> specificSearch(@Param(value="bancId") java.lang.Double bancId, @Param(value="horaLog") java.lang.String horaLog, Pageable pageable);
  
}
