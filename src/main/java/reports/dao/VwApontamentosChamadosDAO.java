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
@Repository("VwApontamentosChamadosDAO")
@Transactional(transactionManager="reports-TransactionManager")
public interface VwApontamentosChamadosDAO extends JpaRepository<VwApontamentosChamados, VwApontamentosChamadosPK> {

  /**
   * Obtém a instância de VwApontamentosChamados utilizando os identificadores
   * 
   * @param codigoChamado
   *          Identificador 
   * @param agenSequencia
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM VwApontamentosChamados entity WHERE entity.codigoChamado = :codigoChamado AND entity.agenSequencia = :agenSequencia")
  public VwApontamentosChamados findOne(@Param(value="codigoChamado") java.lang.Double codigoChamado, @Param(value="agenSequencia") java.lang.Double agenSequencia);

  /**
   * Remove a instância de VwApontamentosChamados utilizando os identificadores
   * 
   * @param codigoChamado
   *          Identificador 
   * @param agenSequencia
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM VwApontamentosChamados entity WHERE entity.codigoChamado = :codigoChamado AND entity.agenSequencia = :agenSequencia")
  public void delete(@Param(value="codigoChamado") java.lang.Double codigoChamado, @Param(value="agenSequencia") java.lang.Double agenSequencia);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM VwApontamentosChamados entity WHERE entity.profApelido like concat('%',coalesce(:search,''),'%') OR entity.compromisso like concat('%',coalesce(:search,''),'%') OR entity.status like concat('%',coalesce(:search,''),'%') OR entity.servico like concat('%',coalesce(:search,''),'%')")
  public Page<VwApontamentosChamados> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM VwApontamentosChamados entity WHERE (:profApelido is null OR entity.profApelido like concat('%',:profApelido,'%')) AND (:codigoChamado is null OR entity.codigoChamado = :codigoChamado) AND (:compromisso is null OR entity.compromisso like concat('%',:compromisso,'%')) AND (:status is null OR entity.status like concat('%',:status,'%')) AND (:servico is null OR entity.servico like concat('%',:servico,'%'))")
  public Page<VwApontamentosChamados> specificSearch(@Param(value="profApelido") java.lang.String profApelido, @Param(value="codigoChamado") java.lang.Double codigoChamado, @Param(value="compromisso") java.lang.String compromisso, @Param(value="status") java.lang.String status, @Param(value="servico") java.lang.String servico, Pageable pageable);
  
}
