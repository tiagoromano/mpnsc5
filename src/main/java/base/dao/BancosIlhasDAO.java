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
@Repository("BancosIlhasDAO")
@Transactional(transactionManager="base-TransactionManager")
public interface BancosIlhasDAO extends JpaRepository<BancosIlhas, java.lang.Double> {

  /**
   * Obtém a instância de BancosIlhas utilizando os identificadores
   * 
   * @param codiIlha
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM BancosIlhas entity WHERE entity.codiIlha = :codiIlha")
  public BancosIlhas findOne(@Param(value="codiIlha") java.lang.Double codiIlha);

  /**
   * Remove a instância de BancosIlhas utilizando os identificadores
   * 
   * @param codiIlha
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM BancosIlhas entity WHERE entity.codiIlha = :codiIlha")
  public void delete(@Param(value="codiIlha") java.lang.Double codiIlha);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Bancos entity WHERE entity.bancosIlhas.codiIlha = :codiIlha")
  public Page<Bancos> findBancos(@Param(value="codiIlha") java.lang.Double codiIlha, Pageable pageable);

}
