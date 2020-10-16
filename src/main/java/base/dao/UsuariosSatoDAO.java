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
@Repository("UsuariosSatoDAO")
@Transactional(transactionManager="base-TransactionManager")
public interface UsuariosSatoDAO extends JpaRepository<UsuariosSato, java.lang.Double> {

  /**
   * Obtém a instância de UsuariosSato utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM UsuariosSato entity WHERE entity.id = :id")
  public UsuariosSato findOne(@Param(value="id") java.lang.Double id);

  /**
   * Remove a instância de UsuariosSato utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM UsuariosSato entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.Double id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM UsuariosSato entity WHERE entity.nome like concat('%',coalesce(:search,''),'%') OR entity.email like concat('%',coalesce(:search,''),'%')")
  public Page<UsuariosSato> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM UsuariosSato entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%')) AND (:email is null OR entity.email like concat('%',:email,'%'))")
  public Page<UsuariosSato> specificSearch(@Param(value="nome") java.lang.String nome, @Param(value="email") java.lang.String email, Pageable pageable);
  
}
