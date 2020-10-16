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
@Repository("TiposBancosDAO")
@Transactional(transactionManager="base-TransactionManager")
public interface TiposBancosDAO extends JpaRepository<TiposBancos, java.lang.Double> {

  /**
   * Obtém a instância de TiposBancos utilizando os identificadores
   * 
   * @param cdTipoBanco
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM TiposBancos entity WHERE entity.cdTipoBanco = :cdTipoBanco")
  public TiposBancos findOne(@Param(value="cdTipoBanco") java.lang.Double cdTipoBanco);

  /**
   * Remove a instância de TiposBancos utilizando os identificadores
   * 
   * @param cdTipoBanco
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM TiposBancos entity WHERE entity.cdTipoBanco = :cdTipoBanco")
  public void delete(@Param(value="cdTipoBanco") java.lang.Double cdTipoBanco);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM AlertasColeta entity WHERE entity.tiposBancos.cdTipoBanco = :cdTipoBanco")
  public Page<AlertasColeta> findAlertasColeta(@Param(value="cdTipoBanco") java.lang.Double cdTipoBanco, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Bancos entity WHERE entity.tiposBancos.cdTipoBanco = :cdTipoBanco")
  public Page<Bancos> findBancos(@Param(value="cdTipoBanco") java.lang.Double cdTipoBanco, Pageable pageable);

}
