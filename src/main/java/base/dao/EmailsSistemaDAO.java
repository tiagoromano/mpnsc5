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
@Repository("EmailsSistemaDAO")
@Transactional(transactionManager="base-TransactionManager")
public interface EmailsSistemaDAO extends JpaRepository<EmailsSistema, java.lang.Double> {

  /**
   * Obtém a instância de EmailsSistema utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM EmailsSistema entity WHERE entity.id = :id")
  public EmailsSistema findOne(@Param(value="id") java.lang.Double id);

  /**
   * Remove a instância de EmailsSistema utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM EmailsSistema entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Double id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM EmailsSistema entity WHERE entity.destinatario like concat('%',coalesce(:search,''),'%') OR entity.assunto like concat('%',coalesce(:search,''),'%') OR entity.spool like concat('%',coalesce(:search,''),'%') OR entity.status like concat('%',coalesce(:search,''),'%')")
  public Page<EmailsSistema> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM EmailsSistema entity WHERE (:destinatario is null OR entity.destinatario like concat('%',:destinatario,'%')) AND (:assunto is null OR entity.assunto like concat('%',:assunto,'%')) AND (:spool is null OR entity.spool like concat('%',:spool,'%')) AND (:status is null OR entity.status like concat('%',:status,'%'))")
  public Page<EmailsSistema> specificSearch(@Param(value="destinatario") java.lang.String destinatario, @Param(value="assunto") java.lang.String assunto, @Param(value="spool") java.lang.String spool, @Param(value="status") java.lang.String status, Pageable pageable);
  
}
