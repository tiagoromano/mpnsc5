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
@Repository("VyOrclTablespacesAnoDAO")
@Transactional(transactionManager="reports-TransactionManager")
public interface VyOrclTablespacesAnoDAO extends JpaRepository<VyOrclTablespacesAno, VyOrclTablespacesAnoPK> {

  /**
   * Obtém a instância de VyOrclTablespacesAno utilizando os identificadores
   * 
   * @param bancId
   *          Identificador 
   * @param dataMes
   *          Identificador 
   * @param dataInicio
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM VyOrclTablespacesAno entity WHERE entity.bancId = :bancId AND entity.dataMes = :dataMes AND entity.dataInicio = :dataInicio")
  public VyOrclTablespacesAno findOne(@Param(value="bancId") java.lang.Double bancId, @Param(value="dataMes") java.lang.String dataMes, @Param(value="dataInicio") java.util.Date dataInicio);

  /**
   * Remove a instância de VyOrclTablespacesAno utilizando os identificadores
   * 
   * @param bancId
   *          Identificador 
   * @param dataMes
   *          Identificador 
   * @param dataInicio
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM VyOrclTablespacesAno entity WHERE entity.bancId = :bancId AND entity.dataMes = :dataMes AND entity.dataInicio = :dataInicio")
  public void delete(@Param(value="bancId") java.lang.Double bancId, @Param(value="dataMes") java.lang.String dataMes, @Param(value="dataInicio") java.util.Date dataInicio);



    
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM VyOrclTablespacesAno entity WHERE :search = :search")
  public Page<VyOrclTablespacesAno> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM VyOrclTablespacesAno entity WHERE (:bancId is null OR entity.bancId = :bancId)")
  public Page<VyOrclTablespacesAno> specificSearch(@Param(value="bancId") java.lang.Double bancId, Pageable pageable);
  
}
