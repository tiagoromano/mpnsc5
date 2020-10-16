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
@Repository("AlertasColetaDAO")
@Transactional(transactionManager="base-TransactionManager")
public interface AlertasColetaDAO extends JpaRepository<AlertasColeta, java.lang.Double> {

  /**
   * Obtém a instância de AlertasColeta utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM AlertasColeta entity WHERE entity.id = :id")
  public AlertasColeta findOne(@Param(value="id") java.lang.Double id);

  /**
   * Remove a instância de AlertasColeta utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM AlertasColeta entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Double id);



  /**
   * Foreign Key tiposBancos
   * @generated
   */
  @Query("SELECT entity FROM AlertasColeta entity WHERE entity.tiposBancos.cdTipoBanco = :cdTipoBanco")
  public Page<AlertasColeta> findAlertasColetasByTiposBancos(@Param(value="cdTipoBanco") java.lang.Double cdTipoBanco, Pageable pageable);

}
