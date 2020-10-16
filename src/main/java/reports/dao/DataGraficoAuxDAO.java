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
@Repository("DataGraficoAuxDAO")
@Transactional(transactionManager="reports-TransactionManager")
public interface DataGraficoAuxDAO extends JpaRepository<DataGraficoAux, java.lang.Double> {

  /**
   * Obtém a instância de DataGraficoAux utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM DataGraficoAux entity WHERE entity.id = :id")
  public DataGraficoAux findOne(@Param(value="id") java.lang.Double id);

  /**
   * Remove a instância de DataGraficoAux utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM DataGraficoAux entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Double id);



}
