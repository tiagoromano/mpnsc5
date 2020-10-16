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
@Repository("VwPolomsgAvisosDAO")
@Transactional(transactionManager="base-TransactionManager")
public interface VwPolomsgAvisosDAO extends JpaRepository<VwPolomsgAvisos, java.lang.Double> {

  /**
   * Obtém a instância de VwPolomsgAvisos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM VwPolomsgAvisos entity WHERE entity.id = :id")
  public VwPolomsgAvisos findOne(@Param(value="id") java.lang.Double id);

  /**
   * Remove a instância de VwPolomsgAvisos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM VwPolomsgAvisos entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Double id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM VwPolomsgAvisos entity WHERE entity.dsTipoBanco like concat('%',coalesce(:search,''),'%') OR entity.msgErro like concat('%',coalesce(:search,''),'%') OR entity.nome like concat('%',coalesce(:search,''),'%') OR entity.tipoAlertaDesc like concat('%',coalesce(:search,''),'%')")
  public Page<VwPolomsgAvisos> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM VwPolomsgAvisos entity WHERE (:dsTipoBanco is null OR entity.dsTipoBanco like concat('%',:dsTipoBanco,'%')) AND (:msgErro is null OR entity.msgErro like concat('%',:msgErro,'%')) AND (:nome is null OR entity.nome like concat('%',:nome,'%')) AND (:tipoAlertaDesc is null OR entity.tipoAlertaDesc like concat('%',:tipoAlertaDesc,'%'))")
  public Page<VwPolomsgAvisos> specificSearch(@Param(value="dsTipoBanco") java.lang.String dsTipoBanco, @Param(value="msgErro") java.lang.String msgErro, @Param(value="nome") java.lang.String nome, @Param(value="tipoAlertaDesc") java.lang.String tipoAlertaDesc, Pageable pageable);
  
}
