package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Consultas {

public static final int TIMEOUT = 300;

/**
 *
 * @param bancId
 * @return Var
 */
// Consultas
public static Var fncQryBancosLimite(Var bancId) throws Exception {
 return new Callable<Var>() {

   private Var data = Var.VAR_NULL;

   public Var call() throws Exception {
    data = cronapi.database.Operations.query(Var.valueOf("reports.entity.VwBancos"),Var.valueOf("select v.id, v.numMaxSessoes from VwBancos v where v.id = :bancId"),Var.valueOf("bancId",bancId));
    return cronapi.database.Operations.getField(data, Var.valueOf("this[1]"));
   }
 }.call();
}

/**
 *
 * @param bancId
 * @param dataInicio
 * @param dataFim
 * @return Var
 */
// Consultas
public static Var fncQryBancosStatusSessoes(Var bancId, Var dataInicio, Var dataFim) throws Exception {
 return new Callable<Var>() {

   private Var data = Var.VAR_NULL;

   public Var call() throws Exception {
    data = cronapi.database.Operations.queryPaged(Var.valueOf("reports.entity.VwOrclSessions"),Var.valueOf("select v from VwOrclSessions v where v.bancId = :bancId AND v.dataGeracao BETWEEN :dataInicio AND :dataFim   order by v.dataGeracao asc, v.dataHora asc"),Var.valueOf(false),Var.valueOf("bancId",bancId),Var.valueOf("dataInicio",dataInicio),Var.valueOf("dataFim",dataFim),Var.valueOf("limit",Var.valueOf(1000000)),Var.valueOf("offset",Var.valueOf(0)));
    return data;
   }
 }.call();
}

/**
 *
 * @param bancId
 * @param dataInicio
 * @param dataFim
 * @return Var
 */
// Consultas
public static Var fncQryBancosStatusSessoesList(Var bancId, Var dataInicio, Var dataFim) throws Exception {
 return new Callable<Var>() {

   private Var data = Var.VAR_NULL;

   public Var call() throws Exception {
    data = cronapi.database.Operations.queryPaged(Var.valueOf("reports.entity.BancosStatusSessoes"),Var.valueOf("select b from BancosStatusSessoes b where b.bancId = :bancId AND b.dataGeracao BETWEEN :dataInicio AND :dataFim AND b.qtdeSessoesAtivas >= :numMaxSessoes   order by b.dataGeracao asc"),Var.valueOf(false),Var.valueOf("bancId",bancId),Var.valueOf("dataInicio",dataInicio),Var.valueOf("dataFim",dataFim),Var.valueOf("numMaxSessoes",Var.valueOf(fncQryBancosLimite(bancId))),Var.valueOf("limit",Var.valueOf(1000000)),Var.valueOf("offset",Var.valueOf(0)));
    return data;
   }
 }.call();
}

/**
 *
 * @param bancId
 * @param dataInicio
 * @param dataFim
 * @return Var
 */
// Consultas
public static Var fncQryChamados(Var bancId, Var dataInicio, Var dataFim) throws Exception {
 return new Callable<Var>() {

   private Var data = Var.VAR_NULL;

   public Var call() throws Exception {
    data = cronapi.database.Operations.queryPaged(Var.valueOf("reports.entity.VwApontamentosChamados"),Var.valueOf("select v from VwApontamentosChamados v\nwhere v.itemCodigo = (select x.itemCodigo from VwBancos x where x.id = :bancId)\nand v.sugiroNaoFaturar is null\nand (v.data between :dataInicio and :dataFim or v.status = \'AG\')\norder by v.codigoChamado,v.descServico,v.descStatus,v.descricao, v.data, v.horaInicio"),Var.valueOf(false),Var.valueOf("bancId",bancId),Var.valueOf("dataInicio",dataInicio),Var.valueOf("dataFim",dataFim),Var.valueOf("limit",Var.valueOf(1000000)),Var.valueOf("offset",Var.valueOf(0)));
    return data;
   }
 }.call();
}

/**
 *
 * @param bancId
 * @param dataInicio
 * @param dataFim
 * @return Var
 */
// Consultas
public static Var fncQryOrclTablespacesAno(Var bancId, Var dataInicio, Var dataFim) throws Exception {
 return new Callable<Var>() {

   private Var data = Var.VAR_NULL;
   private Var dataInicioAux = Var.VAR_NULL;

   public Var call() throws Exception {
    dataInicioAux = cronapi.dateTime.Operations.incMonth(dataInicio, Var.valueOf(-13));
    data = cronapi.database.Operations.query(Var.valueOf("reports.entity.VyOrclTablespacesAno"),Var.valueOf("select v from VyOrclTablespacesAno v where v.bancId = :bancId AND v.dataInicio BETWEEN :dataInicio AND :dataFim   order by v.dataInicio asc"),Var.valueOf("bancId",bancId),Var.valueOf("dataInicio",dataInicioAux),Var.valueOf("dataFim",dataFim));
    return data;
   }
 }.call();
}

/**
 *
 * @param bancId
 * @param dataInicio
 * @param dataFim
 * @return Var
 */
// Consultas
public static Var fncQryTablespaces(Var bancId, Var dataInicio, Var dataFim) throws Exception {
 return new Callable<Var>() {

   private Var data = Var.VAR_NULL;

   public Var call() throws Exception {
    data = cronapi.database.Operations.queryPaged(Var.valueOf("reports.entity.VyOrclTablespaces"),Var.valueOf("select v.dataInicioGraph, v.dataInicioRef, v.tablespaceName, v.totalAlocado from VyOrclTablespaces v  \nwhere v.bancId = :bancId \nand v.eventoExecucaoId in (select max(x.eventoExecucaoId) from  VyOrclTablespaces x where v.bancId = x.bancId and x.dataInicio between :dataInicio and :dataFim group by x.dataInicio) \norder by v.tablespaceName asc, v.dataInicioRef asc"),Var.valueOf(false),Var.valueOf("bancId",bancId),Var.valueOf("dataInicio",dataInicio),Var.valueOf("dataFim",dataFim),Var.valueOf("limit",Var.valueOf(1000000)),Var.valueOf("offset",Var.valueOf(0)));
    return data;
   }
 }.call();
}

/**
 *
 * @param bancId
 * @param dataInicio
 * @param dataFim
 * @return Var
 */
// Consultas
public static Var fncQryTablespacesGraph(Var bancId, Var dataInicio, Var dataFim) throws Exception {
 return new Callable<Var>() {

   private Var data = Var.VAR_NULL;
   private Var databaseSize = Var.VAR_NULL;

   public Var call() throws Exception {
    databaseSize = Var.valueOf(fncQryTablespacesTotal(bancId, dataInicio, dataFim));
    if (Var.valueOf(databaseSize.equals(Var.valueOf(0))).getObjectAsBoolean()) {
        databaseSize = Var.valueOf(1);
    }
    data = cronapi.database.Operations.queryPaged(Var.valueOf("reports.entity.VyOrclTablespaces"),Var.valueOf("select v.dataInicioGraph, v.dataInicioRef, v.tablespaceName, v.totalAlocado from VyOrclTablespaces v  \nwhere v.bancId = :bancId \nand v.eventoExecucaoId in (select max(x.eventoExecucaoId) from  VyOrclTablespaces x where v.bancId = x.bancId and x.dataInicio between :dataInicio and :dataFim group by x.dataInicio) \nand ( v.totalAlocado / :databaseSize * 100 > 1 )\norder by v.dataInicioRef asc"),Var.valueOf(false),Var.valueOf("bancId",bancId),Var.valueOf("dataInicio",dataInicio),Var.valueOf("dataFim",dataFim),Var.valueOf("databaseSize",databaseSize),Var.valueOf("limit",Var.valueOf(1000000)),Var.valueOf("offset",Var.valueOf(0)));
    return data;
   }
 }.call();
}

/**
 *
 * @param bancId
 * @param dataInicio
 * @param dataFim
 * @return Var
 */
// Consultas
public static Var fncQryTablespacesTotal(Var bancId, Var dataInicio, Var dataFim) throws Exception {
 return new Callable<Var>() {

   private Var data = Var.VAR_NULL;

   public Var call() throws Exception {
    data = cronapi.database.Operations.queryPaged(Var.valueOf("reports.entity.VmOrclTablespaces"),Var.valueOf("SELECT y.bancId, SUM(y.sumAllocMbbytes) as sumAllocMbbytes\nFROM   VmOrclTablespaces y \nWHERE  y.bancId = :bancId \nAND y.eventoExecucaoId IN ( \n   SELECT MAX(x.eventoExecucaoId) FROM VmOrclTablespaces x \n   WHERE y.bancId = x.bancId and x.dataInicio between :dataInicio and :dataFim) \ngroup by y.bancId"),Var.valueOf(true),Var.valueOf("bancId",bancId),Var.valueOf("dataInicio",dataInicio),Var.valueOf("dataFim",dataFim));
    return cronapi.database.Operations.getField(data, Var.valueOf("this[1]"));
   }
 }.call();
}

/**
 *
 * @param bancId
 * @param dataInicio
 * @param dataFim
 * @return Var
 */
// Describe this function...
public static Var fcnQryVxOrclArchivedLogHour(Var bancId, Var dataInicio, Var dataFim) throws Exception {
 return new Callable<Var>() {

   private Var data = Var.VAR_NULL;

   public Var call() throws Exception {
    data = cronapi.database.Operations.queryPaged(Var.valueOf("reports.entity.VxOrclArchivedLogHour"),Var.valueOf("select v from VxOrclArchivedLogHour v where v.bancId = :bancId AND v.dataArchiveLog BETWEEN :dataInicio AND :dataFim   order by v.dataArchiveLog asc"),Var.valueOf(false),Var.valueOf("bancId",bancId),Var.valueOf("dataInicio",dataInicio),Var.valueOf("dataFim",dataFim),Var.valueOf("limit",Var.valueOf(1000000)),Var.valueOf("offset",Var.valueOf(0)));
    return data;
   }
 }.call();
}

}

