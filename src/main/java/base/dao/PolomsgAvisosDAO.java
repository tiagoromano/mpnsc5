package base.dao;

import base.entity.*;
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
@Repository("PolomsgAvisosDAO")
@Transactional(transactionManager="base-TransactionManager")
public interface PolomsgAvisosDAO extends JpaRepository<PolomsgAvisos, java.lang.Double> {

  /**
   * Obtém a instância de PolomsgAvisos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM PolomsgAvisos entity WHERE entity.id = :id")
  public PolomsgAvisos findOne(@Param(value="id") java.lang.Double id);

  /**
   * Remove a instância de PolomsgAvisos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM PolomsgAvisos entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Double id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM PolomsgAvisos entity WHERE entity.msgErro like concat('%',coalesce(:search,''),'%')")
  public Page<PolomsgAvisos> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM PolomsgAvisos entity WHERE (:msgErro is null OR entity.msgErro like concat('%',:msgErro,'%'))")
  public Page<PolomsgAvisos> specificSearch(@Param(value="msgErro") java.lang.String msgErro, Pageable pageable);
  
}
