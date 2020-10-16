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
@Repository("LogMensagensDAO")
@Transactional(transactionManager="base-TransactionManager")
public interface LogMensagensDAO extends JpaRepository<LogMensagens, java.lang.Double> {

  /**
   * Obtém a instância de LogMensagens utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM LogMensagens entity WHERE entity.id = :id")
  public LogMensagens findOne(@Param(value="id") java.lang.Double id);

  /**
   * Remove a instância de LogMensagens utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM LogMensagens entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Double id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM LogMensagens entity WHERE entity.mensagem like concat('%',coalesce(:search,''),'%')")
  public Page<LogMensagens> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM LogMensagens entity WHERE (:mensagem is null OR entity.mensagem like concat('%',:mensagem,'%')) AND (:dataGeracao is null OR entity.dataGeracao = :dataGeracao) AND (:id is null OR entity.id = :id)")
  public Page<LogMensagens> specificSearch(@Param(value="mensagem") java.lang.String mensagem, @Param(value="dataGeracao") java.util.Date dataGeracao, @Param(value="id") java.lang.Double id, Pageable pageable);
  
}
