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
@Repository("VmOrclSistemaOperacionalDAO")
@Transactional(transactionManager="reports-TransactionManager")
public interface VmOrclSistemaOperacionalDAO extends JpaRepository<VmOrclSistemaOperacional, java.lang.Double> {

  /**
   * Obtém a instância de VmOrclSistemaOperacional utilizando os identificadores
   * 
   * @param seqResultado
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM VmOrclSistemaOperacional entity WHERE entity.seqResultado = :seqResultado")
  public VmOrclSistemaOperacional findOne(@Param(value="seqResultado") java.lang.Double seqResultado);

  /**
   * Remove a instância de VmOrclSistemaOperacional utilizando os identificadores
   * 
   * @param seqResultado
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM VmOrclSistemaOperacional entity WHERE entity.seqResultado = :seqResultado")
  public void delete(@Param(value="seqResultado") java.lang.Double seqResultado);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM VmOrclSistemaOperacional entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<VmOrclSistemaOperacional> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM VmOrclSistemaOperacional entity WHERE (:bancId is null OR entity.bancId = :bancId) AND (:dataInicio is null OR entity.dataInicio = :dataInicio) AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<VmOrclSistemaOperacional> specificSearch(@Param(value="bancId") java.lang.Double bancId, @Param(value="dataInicio") java.util.Date dataInicio, @Param(value="nome") java.lang.String nome, Pageable pageable);
  
}
