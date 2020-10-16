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
@Repository("BancosDAO")
@Transactional(transactionManager="base-TransactionManager")
public interface BancosDAO extends JpaRepository<Bancos, java.lang.Double> {

  /**
   * Obtém a instância de Bancos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Bancos entity WHERE entity.id = :id")
  public Bancos findOne(@Param(value="id") java.lang.Double id);

  /**
   * Remove a instância de Bancos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Bancos entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Double id);



  /**
   * Foreign Key bancosIlhas
   * @generated
   */
  @Query("SELECT entity FROM Bancos entity WHERE entity.bancosIlhas.codiIlha = :codiIlha")
  public Page<Bancos> findBancossByBancosIlhas(@Param(value="codiIlha") java.lang.Double codiIlha, Pageable pageable);

  /**
   * Foreign Key clientes
   * @generated
   */
  @Query("SELECT entity FROM Bancos entity WHERE entity.clientes.id = :id")
  public Page<Bancos> findBancossByClientes(@Param(value="id") java.lang.Double id, Pageable pageable);

  /**
   * Foreign Key tiposBancos
   * @generated
   */
  @Query("SELECT entity FROM Bancos entity WHERE entity.tiposBancos.cdTipoBanco = :cdTipoBanco")
  public Page<Bancos> findBancossByTiposBancos(@Param(value="cdTipoBanco") java.lang.Double cdTipoBanco, Pageable pageable);

}
